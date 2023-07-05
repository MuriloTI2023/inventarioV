package com.varejo.inventario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varejo.inventario.models.equipamentosModels;

@Repository
public interface equipamentoRepository extends JpaRepository<equipamentosModels, Integer>{

}
