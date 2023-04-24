package com.usergio.reto03.reto03.service;
import com.usergio.reto03.reto03.modelo.entidad.Client;
import com.usergio.reto03.reto03.modelo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;
    public List<Client> getAll(){
        return repository.findAll();
    }

    public Client save(Client client){
        return repository.save(client);
    }
}
