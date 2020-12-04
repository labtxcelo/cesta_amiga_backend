package com.cesta.apirest.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_NECESSIDADE")

public class Necessidade implements Serializable {

	private static final long serialVersionUTD = 1L;

	@Id
	@SequenceGenerator(name = "SQ_NECESSIDADE", sequenceName = "SQ_NECESSIDADE", allocationSize = 1)
	@GeneratedValue(generator = "SQ_NECESSIDADE")
	private long id;

	@ManyToOne
	private UserAuth user;

	private String descricao;

	@OneToMany
	private List<NecessidadeItem> itens;

	private Boolean statusEncerrado;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserAuth getUser() {
		return user;
	}

	public void setUser(UserAuth user) {
		this.user = user;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<NecessidadeItem> getItens() {
		return itens;
	}

	public void setItens(List<NecessidadeItem> itens) {
		this.itens = itens;
	}

	public Boolean getStatusEncerrado() {
		return statusEncerrado;
	}

	public void setStatusEncerrado(Boolean statusEncerrado) {
		this.statusEncerrado = statusEncerrado;
	}

	public static long getSerialversionutd() {
		return serialVersionUTD;
	}
	
	

}
