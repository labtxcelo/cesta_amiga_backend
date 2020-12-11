package com.cesta.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cesta.apirest.dto.usuarioDoacaoDTO;
import com.cesta.apirest.models.Doacao;
import com.cesta.apirest.models.Necessidade;
import com.cesta.apirest.models.UserAuth;
import com.cesta.apirest.repository.DoacaoRepository;
import com.cesta.apirest.repository.NecessidadeRepository;

@Service
public class DoacaoService {
	
	@Autowired
	DoacaoRepository repository;
	
	@Autowired
	NecessidadeRepository necessidadeRepository;
	
	public Doacao save(Doacao doacao) {
		doacao = repository.save(doacao); 
		Necessidade necessidade = necessidadeRepository.getOne(doacao.getNecessidade().getId());
		necessidade.setStatusEncerrado(true);
		necessidadeRepository.save(necessidade);
		return doacao;
	}    
	
	public List<Doacao> buscaDoacaoPorUsuario(Long userId){
		return repository.findAllByUser(new UserAuth(userId));
	}
	
	public usuarioDoacaoDTO retornaMaiorDoador(){
		return repository.retornaMaiorDoador();
	}
	
	public int retornaQuantidadeDoacoes(){
		return repository.findAll().size();
	}

}
