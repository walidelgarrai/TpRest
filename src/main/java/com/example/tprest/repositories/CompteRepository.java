package com.example.tprest.repositories;

import com.example.tprest.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {
}
