package com.cesta.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cesta.apirest.dto.usuarioDoacaoDTO;
import com.cesta.apirest.models.Doacao;
import com.cesta.apirest.models.Necessidade;
import com.cesta.apirest.models.Usuario;
import com.cesta.apirest.repository.DoacaoRepository;
import com.cesta.apirest.service.DoacaoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="doacao")
@Api(value="API REST Doacao")
@CrossOrigin(origins="*")
public class DoacaoResource {
	
	@Autowired
	DoacaoRepository doacaoRepository;
	
	@Autowired
	DoacaoService doacaoService;
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Gerar uma doacao")
	@RequestMapping(value = "/doar", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public Doacao gerarDoacao(@RequestBody Doacao doacao) {
		return doacaoService.save(doacao);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Busca todas as doacoes de um usuário")
	@RequestMapping(value = "/listar-todos/{userId}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public List<Doacao> sendDoacaoByUserAuthId(@PathVariable(value="userId") Long userId){
		return doacaoService.buscaDoacaoPorUsuario(userId);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Busca todas as doacoes efetuadas")
	@RequestMapping(value = "/listar-todos", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public List<Doacao> listDoacao(){
		return doacaoRepository.findAll();
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Busca maior doador")
	@RequestMapping(value = "/retorna-maior", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public usuarioDoacaoDTO retornaMaior(){
		return doacaoService.retornaMaiorDoador();
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Busca maior doador")
	@RequestMapping(value = "/total-doacoes", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public int retornaTotalDoacoes(){
		return doacaoService.retornaQuantidadeDoacoes();
	}
	

}
