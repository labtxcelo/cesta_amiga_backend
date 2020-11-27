package com.cesta.apirest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cesta.apirest.models.UserAuth;
import com.cesta.apirest.models.Usuario;
import com.cesta.apirest.service.UserAuthService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="auth")
@Api(value="API REST Authent")
@CrossOrigin(origins="*")
public class UserAuthResource {
	
	@Autowired
	private UserAuthService service;
	
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "logar com um usuário")
	@RequestMapping(value = "/logar", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public UserAuth loginUsuario(@RequestBody UserAuth user) {
		return service.findByEmailAndPassword(user);
	}
	
	
}
