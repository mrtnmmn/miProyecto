package com.proyecto.proyecto.Services;

import org.springframework.stereotype.Service;

@Service
public class TransformarFrase {

  public static String fraseAlreves(String cadena) {
    String reverse = "";
    for (int i = cadena.length() - 1; i >= 0; i--) {
      reverse += cadena.charAt(i);
    }
    return reverse;
  }
}
