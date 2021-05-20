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

    public DatosModel guardarDatos(DatosModel modeloDatos){
        return proyectRepository.save(modeloDatos);
    }

    public ArrayList<DatosModel> devuelveDatos(){
        return (ArrayList<DatosModel>) proyectRepository.findAll();
    }
    
}
