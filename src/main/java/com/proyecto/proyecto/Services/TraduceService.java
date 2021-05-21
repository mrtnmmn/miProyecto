package com.proyecto.proyecto.Services;

import com.proyecto.proyecto.Models.DatosModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

class ResponseData {

  public String translatedText;
}

class Traduction {

  public ResponseData responseData;
}

@Service
public class TraduceService {

  @Autowired
  RestTemplate restTemplate;

  public String traduccion(String cadena) {
    String url =
      "https://api.mymemory.translated.net/get?q=" + cadena + "&langpair=es|en";
    Traduction json = restTemplate.getForObject(url, Traduction.class);
    return json.responseData.translatedText;
  }
}
