package com.usergio.reto03.reto03.api;

import com.usergio.reto03.reto03.modelo.entidad.Reservation;
import com.usergio.reto03.reto03.modelo.entidad.Score;
import com.usergio.reto03.reto03.service.ReservationService;
import com.usergio.reto03.reto03.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Score")
@CrossOrigin("*")

public class ScoreApi {
    @Autowired
    private ScoreService service;

    @GetMapping("/all")
    public List<Score> getAll(){
        return service.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Score score){
        service.save(score);
        return ResponseEntity.status(201).build();
    }

}
