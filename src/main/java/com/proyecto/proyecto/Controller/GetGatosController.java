package com.proyecto.proyecto.Controller;

import com.proyecto.proyecto.Models.DatosModel;
import com.proyecto.proyecto.Services.GatosService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetGatosController {

  @Autowired
  GatosService gatosService;

  @RequestMapping("/listarGatos")
  public String getAllGatos(Model model) {
    ArrayList<DatosModel> informacion = gatosService.getGatos();
    model.addAttribute("gatos", informacion);
    return "listaGatos";
  }
}
