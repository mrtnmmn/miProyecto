package com.proyecto.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProyectoApplication {

  @Bean
  public RestTemplate getresttemplate() {
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(ProyectoApplication.class, args);
  }
}
