package com.proyecto.proyecto.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

class ResponseData{
    public String translatedText;
}

class Traduction{
    public ResponseData responseData;
}

@Service
public class ProyectoService {
    @Autowired
    RestTemplate restTemplate;

    public  String getTraduccion(String frase){
        String url = "https://api.mymemory.translated.net/get?q=" + frase + "&langpair=es|en";
        Traduction json = restTemplate.getForObject(url,Traduction.class);
        return json.responseData.translatedText;

    }
}
