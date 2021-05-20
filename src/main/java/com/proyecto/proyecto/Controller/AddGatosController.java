package com.proyecto.proyecto.Controller;

import com.proyecto.proyecto.Models.DatosModel;
import com.proyecto.proyecto.Services.GatosService;
import com.proyecto.proyecto.Services.ProyectoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddGatosController {
    @Autowired
    GatosService gatosService;
  
    @GetMapping("/addGatos")
    public String addGatos(@RequestParam String nombre, @RequestParam String raza) {
        DatosModel datosModel = new DatosModel();
        datosModel.setNombre(nombre);
        datosModel.setRaza(raza);
      ProyectoService.addGatos(datosModel);
      return datosModel.toString();
    }
}
