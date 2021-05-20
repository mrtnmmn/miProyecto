package com.proyecto.proyecto.Services;

import com.proyecto.proyecto.Models.DatosModel;
import java.util.ArrayList;
import com.proyecto.proyecto.Repository.ProyectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GatosService {

    @Autowired
    ProyectRepository proyectRepository;
  
    public DatosModel addGatos(DatosModel datosModel) {
      return proyectRepository.save(datosModel);
    }
  
    public ArrayList<DatosModel> devuelveDatos() {
      return (ArrayList<DatosModel>) proyectRepository.findAll();
    }

    public ArrayList<DatosModel> getGatos() {
        return null;
    }
    
}
