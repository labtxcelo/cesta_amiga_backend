package com.cesta.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.cesta.apirest.dto.usuarioDoacaoDTO;
import com.cesta.apirest.models.Doacao;
import com.cesta.apirest.models.UserAuth;


public interface DoacaoRepository extends JpaRepository<Doacao, Long>  {

	List<Doacao> findAllByUser(UserAuth userAuth);

	//@Query("SELECT u.nome as nome, count(d.id) as quantidade FROM public.tb_doacao d join tb_user_auth u on u.id = d.user_id GROUP BY u.nome;")
	@Query("SELECT new com.cesta.apirest.dto.usuarioDoacaoDTO(u.nome as nome, count(d.id) as quantidade) FROM Doacao d join UserAuth u on u.id = d.user GROUP BY u.nome")
	usuarioDoacaoDTO retornaMaiorDoador();

	
}
