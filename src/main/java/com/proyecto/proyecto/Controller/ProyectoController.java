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
      "Bienvenido a la aplicación de Yariana" +
      "<br>" +
      "<br>" +
      "Funciones que puede realizar:" +
      "<br>" +
      "<br>" +
      "Para guardar datos en la base de datos escribe '/almacenarGatos'" +
      "<br>" +
      "<br>" +
      "Para contar las vocales y consonantes de una palabra escribe '/contar/'" +
      "<br>" +
      "<br>" +
      "si quieres listar los datos de la base escribe '/listar datos'"
    );
  }

  /*funciona*/
  @GetMapping("/contar/{palabra}")
  public String contarVocalesYConsonantes(@PathVariable String palabra) {
    String resultado = ContarConsonantesYVocales.contarConsonantes(palabra);
    return resultado;
  }

  /*funciona*/
  @GetMapping("/contar1")
  public String contar1() {
    return "hola";
  }

  @Autowired
  ProyectoBDService proyectoBDService;

  /*no funciona*/
  @PostMapping("/insertaDatos")
  public String insertaDatos(@RequestParam Map<String, String> body) {
    System.out.println(body.get("dato"));
    DatosModel datosModel = new DatosModel();
    datosModel.setNombre(body.get("nombre"));
    proyectoBDService.guardarDatos(datosModel);
    return "guardado correctamente";
  }

  /*funciona*/
  @GetMapping("/listarDatos")
  public String listarDatos() {
    return proyectoBDService.devuelveDatos().toString();
  }

  @GetMapping("/fraseAlreves/{texto}")
  public String fraseAlreves(@PathVariable String cadena) {
    String cadenaInvertida = RevertirService.fraseAlreves(cadena);
    return ("Original: " + cadena + " invertida: " + cadenaInvertida);
  }
}
