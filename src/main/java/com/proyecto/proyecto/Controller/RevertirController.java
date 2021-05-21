package com.proyecto.proyecto.Controller;

import com.proyecto.proyecto.Services.RevertirService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RevertirController {

  @RequestMapping("/revertir/{cadena}")
  public String mirror(@PathVariable String cadena, Model model) {
    String revertircadena = RevertirService.fraseAlreves(cadena);
    model.addAttribute("cadena", revertircadena);
    return "revierte";
  }
}
