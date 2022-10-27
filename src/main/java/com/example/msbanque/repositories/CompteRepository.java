package com.example.msbanque.repositories;

import com.example.msbanque.entities.Compte;
import com.example.msbanque.entities.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,Long> {
    public List<Compte> findByType(TypeCompte type);

}
