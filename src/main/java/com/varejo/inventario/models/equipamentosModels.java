package com.varejo.inventario.models;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class equipamentosModels implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String modelo;
	private String indentificacao;
	private String tipo;
	private MultipartFile imagem;
	
	
	public equipamentosModels() {
		super();
		// TODO Auto-generated constructor stub
	}


	public equipamentosModels(String modelo, String indentificacao, String tipo, MultipartFile imagem) {
		super();
		this.modelo = modelo;
		this.indentificacao = indentificacao;
		this.tipo = tipo;
		this.imagem = imagem;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getIndentificacao() {
		return indentificacao;
	}


	public void setIndentificacao(String indentificacao) {
		this.indentificacao = indentificacao;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public MultipartFile getImagem() {
		return imagem;
	}


	public void setImagem(MultipartFile imagem) {
		this.imagem = imagem;
	}
	
	

}