package com.example.msbanque.web;

import com.example.msbanque.entities.Compte;
import com.example.msbanque.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import java.util.List;

//@RestController
@RequestMapping("/banque")
public class CompteRestConrollerAPI {
    @Autowired
    private CompteRepository compteRepository;
    @GetMapping(path = "/comptes",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE})
    public List<Compte> listeCompte(){
        return compteRepository.findAll();

    }
    @GetMapping(path = "/comptes/{id}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE})


    public Compte getOne(@PathVariable Long id){
        return compteRepository.findById(id).get();

    }
    @PostMapping( "/comptes")
    public Compte save(@RequestBody Compte compte){
        return compteRepository.save(compte);

    }
    @PostMapping(path = "/comptes/{id}")
    public Compte update(@RequestBody Compte compte,@PathVariable Long id){
        compte.setId(id);
        return compteRepository.save(compte);

    }
   @DeleteMapping("/comptes/{id}")
    public void update(@PathVariable Long id){

        compteRepository.deleteById(id);

    }


}
