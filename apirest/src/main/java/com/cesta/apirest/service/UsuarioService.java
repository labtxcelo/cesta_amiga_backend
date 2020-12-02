package com.cesta.apirest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesta.apirest.models.UserAuth;
import com.cesta.apirest.models.Usuario;
import com.cesta.apirest.repository.UserAuthRepository;
import com.cesta.apirest.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	 @Autowired
	    private UsuarioRepository repository;
	 
	 @Autowired
	 	private UserAuthRepository authRepository;
	 
	 

	public Usuario save(Usuario usuario) {
		usuario = repository.save(usuario); 
		UserAuth userAuth = new UserAuth();
		
		userAuth.setEmail(usuario.getEmail());
		userAuth.setPassword(usuario.getPassword());
		userAuth.setNome(usuario.getNome());
		userAuth.setTipoUsuario(usuario.getTipoUsuario());
		userAuth.setUsuario(usuario);
		authRepository.save(userAuth);
		return usuario;
	}    
	
	

	
	

}
