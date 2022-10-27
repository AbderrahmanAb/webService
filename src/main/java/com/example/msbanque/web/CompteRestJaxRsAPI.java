package com.example.msbanque.web;

import com.example.msbanque.entities.Compte;
import com.example.msbanque.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
@Component
@Path("/banque")
public class CompteRestJaxRsAPI {
    @Autowired
    private CompteRepository compteRepository;
    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Compte> listeCompte(){
        return compteRepository.findAll();

    }
    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Compte getOne(@PathParam("id") Long id){
        return compteRepository.findById(id).get();

    }
    @Path("/comptes")
    @POST
    @Produces({MediaType.APPLICATION_JSON})
    public Compte save(Compte compte){
        return compteRepository.save(compte);

    }
    @Path("/comptes/{id}")
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Compte update(Compte compte,@PathParam("id") Long id){
        compte.setId(id);
        return compteRepository.save(compte);

    }
    @Path("/comptes/{id}")
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void update(@PathParam("id") Long id){

        compteRepository.deleteById(id);

    }


}
