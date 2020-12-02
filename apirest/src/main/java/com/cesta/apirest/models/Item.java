package com.cesta.apirest.models;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ITEM")

public class Item implements Serializable{
	
private static final long serialVersionUTD = 1L;
	
	@Id
	@SequenceGenerator(name = "SQ_ITEM", sequenceName = "SQ_ITEM", allocationSize = 1)
	@GeneratedValue(generator = "SQ_ITEM")
	private long id;
	
	private String nome;
	
	private String peso;
	
	private String litro;
	
	private String tipo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getLitro() {
		return litro;
	}

	public void setLitro(String litro) {
		this.litro = litro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static long getSerialversionutd() {
		return serialVersionUTD;
	}
	
	

}
