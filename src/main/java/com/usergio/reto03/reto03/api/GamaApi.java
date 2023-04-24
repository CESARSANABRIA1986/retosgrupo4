package com.usergio.reto03.reto03.api;

import com.usergio.reto03.reto03.modelo.entidad.Gama;
import com.usergio.reto03.reto03.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Gama")
@CrossOrigin("*")

public class GamaApi {
    @Autowired
    private GamaService service;
    @GetMapping("/all")

    public List<Gama> getAll(){
        return service.getAll();
    }
    @PostMapping("/save")

    public ResponseEntity save(@RequestBody Gama gama){
        service.save(gama);
        return ResponseEntity.status(201).build();

    }
}
