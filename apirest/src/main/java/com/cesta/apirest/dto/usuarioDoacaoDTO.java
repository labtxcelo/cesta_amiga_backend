package com.cesta.apirest.dto;


public class usuarioDoacaoDTO {
	
	String nome;
	
	Long quantidade;

	public usuarioDoacaoDTO(String nome, Long quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
