package com.proyecto.proyecto.Repository;

import com.proyecto.proyecto.Models.DatosModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectRepository extends CrudRepository<DatosModel, Long>{
    //@Query(value="SELECT * FROM pokemon WHERE nombre='Pepe'")
    //ArrayList<PokemonModel> sentenciaSqlSuperChunga();

}

