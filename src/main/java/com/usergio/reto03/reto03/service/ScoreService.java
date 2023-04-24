package com.usergio.reto03.reto03.service;

import com.usergio.reto03.reto03.modelo.entidad.Score;
import com.usergio.reto03.reto03.modelo.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository repository;

    public List<Score> getAll(){
        return repository.findAll();
    }

    public Score save(Score score){
        return repository.save(score);
    }


}
