package com.varejo.inventario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varejo.inventario.models.prestadoresModels;

@Repository
public interface prestadoresRepository extends JpaRepository<prestadoresModels, Integer> {

}
