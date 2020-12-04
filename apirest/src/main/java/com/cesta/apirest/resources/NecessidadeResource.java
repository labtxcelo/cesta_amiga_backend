package com.cesta.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.cesta.apirest.models.Necessidade;
import com.cesta.apirest.repository.NecessidadeRepository;
import com.cesta.apirest.service.NecessidadeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="necessidade")
@Api(value="API REST Necessidade")
@CrossOrigin(origins="*")
public class NecessidadeResource {
	
	@Autowired
	NecessidadeRepository necessidadeRepository;
	
	@Autowired 
	NecessidadeService necessidadeService;
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Cria uma Necessidade")
	@RequestMapping(value = "/criar", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public Necessidade criarNecessidade(@RequestBody Necessidade necessidade) {
		return necessidadeService.save(necessidade);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Busca todas as Necessidades criadas")
	@RequestMapping(value = "/listar-todos", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public List<Necessidade> listNecessidades(){
		return necessidadeRepository.findAll();
	}

}
