package com.proyecto.proyecto.Controller;

import com.proyecto.proyecto.Services.TraduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TraduceController {

  @Autowired
  TraduceService traduceService;

  @RequestMapping("/traduce/{cadena}")
  public String traduce(@PathVariable String cadena, Model model) {
    String cadenaTraducida = traduceService.traduccion(cadena);
    model.addAttribute("cadena", cadena);
    model.addAttribute("cadenaTraducida", cadenaTraducida);
    return "traduce";
  }
}
