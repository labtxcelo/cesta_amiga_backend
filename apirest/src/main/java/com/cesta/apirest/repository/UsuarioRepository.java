package com.cesta.apirest.repository;

import com.cesta.apirest.models.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findById(long id);

}
