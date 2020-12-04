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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidadeRecebido() {
		return quantidadeRecebido;
	}

	public void setQuantidadeRecebido(int quantidadeRecebido) {
		this.quantidadeRecebido = quantidadeRecebido;
	}

	public static long getSerialversionutd() {
		return serialVersionUTD;
	}
	
	
}
