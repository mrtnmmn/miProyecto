package com.proyecto.proyecto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuardarBDController {

  /*no funciona*/
  @RequestMapping("/insercionDatos")
  public String insercionProyecto() {
    return "insercionDatos";
  }
}
