package com.usergio.reto03.reto03.api;

import com.usergio.reto03.reto03.modelo.entidad.Gama;
import com.usergio.reto03.reto03.modelo.entidad.Message;
import com.usergio.reto03.reto03.service.GamaService;
import com.usergio.reto03.reto03.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Message")
@CrossOrigin("*")

public class MessageApi {

    @Autowired
    private MessageService service;

    @GetMapping("/all")
    public List<Message> getAll(){
        return service.getAll();
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody Message message){
        service.save(message);
        return ResponseEntity.status(201).build();
    }

}
