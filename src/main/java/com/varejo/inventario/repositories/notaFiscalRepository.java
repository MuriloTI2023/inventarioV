package com.varejo.inventario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varejo.inventario.models.notaFiscalModels;

@Repository
public interface notaFiscalRepository extends JpaRepository<notaFiscalModels, Integer>{

}
