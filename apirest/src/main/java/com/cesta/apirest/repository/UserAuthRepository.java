package com.cesta.apirest.repository;

import com.cesta.apirest.models.UserAuth;
import com.cesta.apirest.models.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthRepository extends JpaRepository<UserAuth, Long> {

	Usuario findById(long id);

	UserAuth findByEmailAndPassword(String email, String senha);


}
