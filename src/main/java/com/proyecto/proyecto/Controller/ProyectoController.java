package com.proyecto.proyecto.Controller;

import java.util.Map;

import com.proyecto.proyecto.Models.DatosModel;
import com.proyecto.proyecto.Services.ContarConsonantesYVocales;
import com.proyecto.proyecto.Services.ProyectoBDService;
import com.proyecto.proyecto.Services.TransformarFrase;

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

    @GetMapping("/")
    public String explicacion() {
        return "Bienvenido a la app de Samuel Alonso, para contar las vocales y consonantes de una palabra escribe '/contar'" +
        "<br>"+ 
        "<br>"+

        "para guardar datos en la base de datos escribe '/insercionDatos'" + 
        "<br>"+
        "<br>"+
        
        "si quieres listar los datos de la base escribe '/listar datos'";
    }


    @GetMapping("/contar/{palabra}")
    public String contarVocalesYConsonantes(@PathVariable String palabra) {
        String resultado = ContarConsonantesYVocales.contarConsonantes(palabra);
        return resultado;
    }

    @GetMapping("/contar1")
    public String contar1() {
        return "hola";
    }

    @Autowired
    ProyectoBDService proyectoBDService;

    @PostMapping("/insertaDatos")
    public String insertaDatos(@RequestParam Map<String, String> body) {
        System.out.println(body.get("dato"));
        DatosModel datosModel = new DatosModel();
        datosModel.setNombre(body.get("nombre"));
        proyectoBDService.guardarDatos(datosModel);
        return "guardado correctamente";

    }

    @GetMapping("/listarDatos")
    public String listarDatos() {
        return proyectoBDService.devuelveDatos().toString();
    }


    
    @GetMapping("/fraseAlreves/{texto}")
    public String fraseAlreves(@PathVariable String texto){
        String fraseAlreves = TransformarFrase.fraseAlreves(texto);
        return "La frase original es: " + texto + " y la frase al revés es: " + fraseAlreves;
    }
    
}
