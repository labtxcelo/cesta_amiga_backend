package com.cesta.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_NECESSIDADE_ITEM")

public class NecessidadeItem implements Serializable{
	
private static final long serialVersionUTD = 1L;
	
	@Id
	@SequenceGenerator(name = "SQ_NECESSIDADE_ITEM", sequenceName = "SQ_NECESSIDADE_ITEM", allocationSize = 1)
	@GeneratedValue(generator = "SQ_NECESSIDADE_ITEM")
	private long id;
	
	@ManyToOne
	private Item item;
	
	private int quantidade;
	
	private int quantidadeRecebido;
	

}
