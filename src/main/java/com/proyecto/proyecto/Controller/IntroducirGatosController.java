package com.proyecto.proyecto.Controller;

import com.proyecto.proyecto.Models.DatosModel;
import com.proyecto.proyecto.Services.ProyectoBDService;
import com.proyecto.proyecto.Services.TraduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntroducirGatosController {

  /*@Autowired
  ProyectoBDService proyectoBDService;

  @GetMapping("/addGatos")
  public String addGatos(
    @RequestParam String nombre,
    @RequestParam String raza
  ) {
    DatosModel datosModel = new DatosModel();
    datosModel.setNombre(nombre);
    datosModel.setRaza(raza);
    TraduceService.addGatos(datosModel);
    return datosModel.toString();
  }*/
}
