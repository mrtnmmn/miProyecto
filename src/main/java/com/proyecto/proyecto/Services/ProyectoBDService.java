package com.proyecto.proyecto.Services;

import java.util.ArrayList;

import com.proyecto.proyecto.Models.DatosModel;
import com.proyecto.proyecto.Repository.ProyectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoBDService {
    @Autowired
    ProyectoBDService repositoryProyect;

  
    public DatosModel guardarDatos(DatosModel modeloDatos){
        return repositoryProyect.save(modeloDatos);
    }

    /*devuelve un arrayList del tipo modelo con los datos guardados en la base de datos,
    el método 'findAll' lo provee JPA*/
    public ArrayList<DatosModel> devuelveDatos(){
        return (ArrayList<DatosModel>) repositoryProyect.findAll();
    }
    
}
