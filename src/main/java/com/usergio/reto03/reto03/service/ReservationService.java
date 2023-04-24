package com.usergio.reto03.reto03.service;

import com.usergio.reto03.reto03.modelo.entidad.Reservation;
import com.usergio.reto03.reto03.modelo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ReservationService {
    @Autowired
    private ReservationRepository repository;

    public List<Reservation> getAll(){
        return repository.findAll();
    }

    public Reservation save(Reservation reservation){
        return repository.save(reservation);
    }



}
