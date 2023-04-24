package com.usergio.reto03.reto03.api;

import com.usergio.reto03.reto03.modelo.entidad.Message;
import com.usergio.reto03.reto03.modelo.entidad.Reservation;
import com.usergio.reto03.reto03.service.MessageService;
import com.usergio.reto03.reto03.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Reservation")
@CrossOrigin("*")

public class ReservationApi {

    @Autowired
    private ReservationService service;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return service.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Reservation reservation){
        service.save(reservation);
        return ResponseEntity.status(201).build();
    }
}
