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
	private Usuario user;
	
	@OneToMany
	private List<ItemDoacao> itensDoacao;

}
