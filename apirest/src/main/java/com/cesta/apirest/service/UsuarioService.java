/*package com.cesta.apirest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.cesta.apirest.models.Usuario;
import com.cesta.apirest.repository.UsuarioRepository;

@Service(value = "usuarioService")
public class UsuarioService implements UserDetailsService{
	
	 @Autowired
	    private UsuarioRepository repository;    

	    @Autowired
	    private BCryptPasswordEncoder bcryptEncoder;

	    public UserDetails loadUserByEmailAndSenha(String email, String senha) {
	        //Optional<Usuario> opt = usuarioRepo.findByUsername(username);
	        Usuario user = repository.findByEmailAndPassword(email, senha);
	        if(opt.isPresent()){
	            user = opt.get();
	        }
	        if (user == null) {
	            throw new UsernameNotFoundException(username);
	        }
	        return new MyUserPrincipal(user);
	    }

	    public User save(User usuario) {
	        usuario.setPassword(bcryptEncoder.encode(usuario.getPassword()));
	        return usuarioRepo.save(usuario);
	    }

}*/
