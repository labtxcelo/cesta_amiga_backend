package com.cesta.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ITEM_DOACAO")

public class ItemDoacao implements Serializable{
	
private static final long serialVersionUTD = 1L;
	
	@Id
	@SequenceGenerator(name = "SQ_ITEM_DOACAO", sequenceName = "SQ_ITEM_DOACAO", allocationSize = 1)
	@GeneratedValue(generator = "SQ_ITEM_DOACAO")
	private long id;
	
	@ManyToOne
	private Item item;
	
	private int quantidade;

}
