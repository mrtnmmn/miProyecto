package com.proyecto.proyecto.Controller;

import com.proyecto.proyecto.Models.DatosModel;
import com.proyecto.proyecto.Services.ProyectoBDService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetGatosController {

  @Autowired
  ProyectoBDService proyectoBDService;

  /*no funciona*/
  @RequestMapping("/listarGatos")
  public String getAllGatos(Model model) {
    ArrayList<DatosModel> informacion = proyectoBDService.devuelveDatos();
    model.addAttribute("gatos", informacion);
    return "listaGatos";
  }
}
