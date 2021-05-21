package com.proyecto.proyecto.Controller;

import com.proyecto.proyecto.Models.DatosModel;
import com.proyecto.proyecto.Services.ContarConsonantesYVocales;
import com.proyecto.proyecto.Services.ProyectoBDService;
import com.proyecto.proyecto.Services.RevertirService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {

  @Autowired
  ContarConsonantesYVocales contar;

  /*funciona*/
  @GetMapping("/")
  public String paginaPrincipal() {
    return (
      "¡Bienvenido a la aplicación de Yariana!" +
      "<br>" +
      "<br>" +
      "Funciones que puede realizar:" +
      "<br>" +
      "<br>" +
      "Guardar datos en la base de datos escribe /insercionDatos" +
      "<br>" +
      "<br>" +
      "Lista los gatos que introducimos en la base de datos escribe /listarGatos" +
      "<br>" +
      "<br>" +
      "Para contar las vocales y consonantes de una palabra escribe '/contar/'" +
      "<br>" +
      "<br>" +
      "Para invertir una palabra escribe /fraseAlreves/{texto}'"
    );
  }

  /*funciona*/
  @GetMapping("/contar/{palabra}")
  public String contarVocalesYConsonantes(@PathVariable String palabra) {
    String resultado = ContarConsonantesYVocales.contarConsonantes(palabra);
    return resultado;
  }


  @Autowired
  ProyectoBDService proyectoBDService;

  /*funciona*/
  @GetMapping("/listarGatos")
  public String listarGatos() {
    return proyectoBDService.devuelveDatos().toString();
  }

  @PostMapping("/insertaDatos")
  public String insertaDatos(@RequestParam Map<String, String> body) {
    System.out.println(body.get("nombre"));
    DatosModel entornosModel = new DatosModel();
    entornosModel.setNombre(body.get("nombre"));
    proyectoBDService.guardarDatos(entornosModel);
    return "guardado correctamente";
  }

  @GetMapping("/revertirCadena/{cadena}")
  public String fraseAlreves(@PathVariable String cadena) {
    String fraseAlreves = RevertirService.fraseAlreves(cadena);
    return "Palabra original: " + cadena + " y al revés: " + fraseAlreves;
  }
}
