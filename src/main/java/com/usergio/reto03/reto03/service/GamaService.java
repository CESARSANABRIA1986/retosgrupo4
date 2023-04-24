package com.usergio.reto03.reto03.service;

import com.usergio.reto03.reto03.modelo.entidad.Gama;
import com.usergio.reto03.reto03.modelo.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GamaService {
    @Autowired
    private GamaRepository repository;
    // El return findAll me retorna todos los datos del objeto GAMA
    public List<Gama> getAll(){
        return repository.findAll();
    }
    /**
     * Metodo  save guarda registro en la tabla gama
     * **/
    public  Gama save(Gama gama){

        repository.save(gama);
        return repository.save(gama);
    }
}
