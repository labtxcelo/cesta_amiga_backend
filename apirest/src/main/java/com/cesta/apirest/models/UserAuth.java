package com.cesta.apirest.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USER_AUTH")
public class UserAuth implements Serializable {

	private static final long serialVersionUTD = 1L;

	@Id
	@SequenceGenerator(name = "SQ_USER_AUTH", sequenceName = "SQ_USER_AUTH", allocationSize = 1)
	@GeneratedValue(generator = "SQ_USER_AUTH")
	private long id;

	@OneToOne
	private Usuario usuario;

	private String nome;

	private String email;

	private String password;

	private String tipoUsuario;

	public UserAuth(Long userId) {
		this.id = userId;
	}

	public UserAuth() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	public static long getSerialversionutd() {
		return serialVersionUTD;
	}

}
