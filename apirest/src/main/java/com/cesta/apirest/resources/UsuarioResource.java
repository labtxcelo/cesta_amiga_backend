package com.cesta.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.cesta.apirest.models.Usuario;
import com.cesta.apirest.repository.UsuarioRepository;
import com.cesta.apirest.service.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="usuario")
@Api(value="API REST Usuarios")
@CrossOrigin(origins="*")
public class UsuarioResource {
	
	@Autowired
	UsuarioService usuarioService;

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Busca todos os usuários cadastrados")
	@RequestMapping(value = "/listar-todos", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public List<Usuario> listUsuarios(){
		return usuarioRepository.findAll();
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Busca um usuário específico")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public Usuario sendUserById(@PathVariable(value="id") long id){
		return usuarioRepository.findById(id)  ;
	}
	
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Cadastra um usuário")
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Deleta um usuário")
	@RequestMapping(value = "/deletar", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
	public void deletarUsuario(@RequestBody Usuario usuario) {
		 usuarioRepository.delete(usuario);
	}
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Atualiza os dados cadastrais de um usuário")
	@RequestMapping(value = "/atualizar", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
	public Usuario atualizarUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
