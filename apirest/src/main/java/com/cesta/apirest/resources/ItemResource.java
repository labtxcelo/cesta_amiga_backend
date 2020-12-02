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

import com.cesta.apirest.models.Item;
import com.cesta.apirest.repository.ItemRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="item")
@Api(value="API REST Itens")
@CrossOrigin(origins="*")
public class ItemResource {
	
	@Autowired
	ItemRepository itemRepository;
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Cadastra um item")
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public Item cadastrarItem(@RequestBody Item item) {
		return itemRepository.save(item);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Busca todos os itens cadastrados")
	@RequestMapping(value = "/listar-todos", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public List<Item> listItens(){
		return itemRepository.findAll();
	}
	

}
