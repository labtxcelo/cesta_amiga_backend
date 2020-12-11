package com.cesta.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesta.apirest.models.Necessidade;
import com.cesta.apirest.models.UserAuth;
import com.cesta.apirest.models.Usuario;
import com.cesta.apirest.repository.NecessidadeRepository;

@Service
public class NecessidadeService {
	
	@Autowired
	NecessidadeRepository repository;
	
	public Necessidade save(Necessidade necessidade) {
		necessidade = repository.save(necessidade); 
	
		return necessidade;
	}    
	
	public List<Necessidade> buscaNecessidadePorUsuario(Long userId){
		return repository.findAllByUser(new UserAuth(userId));
	}
	
	public int retornaQuantidadeNecessidades(){
		return repository.findAll().size();
	}

}
