package com.cesta.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesta.apirest.models.Necessidade;
import com.cesta.apirest.models.UserAuth;

public interface NecessidadeRepository extends JpaRepository<Necessidade, Long> {
	

	List<Necessidade> findAllByUser(UserAuth userAuth);

}
