package org.example.voiture.services;

import org.example.voiture.entities.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="SERVICE-CLIENT")
public interface ClientService{
    @GetMapping("/clients/{id}")
    public Client clientById(@PathVariable Long id);
}