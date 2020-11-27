package com.cesta.apirest.models;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_ITEM")

public class Item implements Serializable{
	
private static final long serialVersionUTD = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(columnDefinition = "serial")
	private long id;
	
	private String nome;
	
	private String peso;
	
	private String litro;
	
	private String tipo;

}
