package com.usergio.reto03.reto03.api;

import com.usergio.reto03.reto03.modelo.entidad.Car;
import com.usergio.reto03.reto03.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Car")
@CrossOrigin("*")

public class CarApi {
    @Autowired
    private CarService service;
    @GetMapping("/all")
    public List<Car> getAll(){
        return service.getAll();
    }
    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Car car){
        service.save(car);
        return  ResponseEntity.status(201).build();
    }

}
