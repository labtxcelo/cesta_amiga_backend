package com.cesta.apirest.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_DOACAO")
public class Doacao implements Serializable{
	
	private static final long serialVersionUTD = 1L;
	
	@Id
	@SequenceGenerator(name = "SQ_DOACAO", sequenceName = "SQ_DOACAO", allocationSize = 1)
	@GeneratedValue(generator = "SQ_DOACAO")
	private long id;
	
	@ManyToOne
	private UserAuth user;

	@ManyToOne
	private Necessidade necessidade;
	
	@OneToMany
	private List<ItemDoacao> itensDoacao;

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

	public Necessidade getNecessidade() {
		return necessidade;
	}

	public void setNecessidade(Necessidade necessidade) {
		this.necessidade = necessidade;
	}

	public List<ItemDoacao> getItensDoacao() {
		return itensDoacao;
	}

	public void setItensDoacao(List<ItemDoacao> itensDoacao) {
		this.itensDoacao = itensDoacao;
	}

	public static long getSerialversionutd() {
		return serialVersionUTD;
	}
	
	

}
