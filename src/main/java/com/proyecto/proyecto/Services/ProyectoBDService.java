package com.proyecto.proyecto.Services;

import java.util.ArrayList;

import com.proyecto.proyecto.Models.DatosModel;
import com.proyecto.proyecto.Repository.ProyectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoBDService {

    @Autowired
    ProyectRepository proyectRepository;

    public DatosModel guardarDatos(DatosModel datosModel){
        return proyectRepository.save(datosModel);
    }

    public ArrayList<DatosModel> devuelveDatos(){
        return (ArrayList<DatosModel>) proyectRepository.findAll();
    }
    
}
