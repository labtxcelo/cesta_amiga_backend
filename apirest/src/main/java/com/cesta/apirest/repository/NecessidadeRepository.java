package com.cesta.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesta.apirest.models.Necessidade;

public interface NecessidadeRepository extends JpaRepository<Necessidade, Long> {

}
