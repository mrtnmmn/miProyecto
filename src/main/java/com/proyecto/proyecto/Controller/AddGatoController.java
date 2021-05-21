package com.proyecto.proyecto.Controller;

import java.util.Map;

import com.proyecto.proyecto.Models.DatosModel;
import com.proyecto.proyecto.Services.ProyectoBDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddGatoController {

  @Autowired
  ProyectoBDService proyectoBDService;

  @GetMapping("/insertaGato")
  public String insertaGato(@RequestParam Map<String, String> body) {
    System.out.println(body.get("nombre"));
    DatosModel datosModel = new DatosModel();
    datosModel.setNombre(body.get("nombre"));
    proyectoBDService.guardarDatos(datosModel);
    return "Datos Guardados!";
  }
}
