package com.varejo.inventario.models;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class notaFiscalModels implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String descricao;
	private MultipartFile pdf;
	public notaFiscalModels() {
		super();
		// TODO Auto-generated constructor stub
	}
	public notaFiscalModels(String descricao, MultipartFile pdf) {
		super();
		this.descricao = descricao;
		this.pdf = pdf;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public MultipartFile getPdf() {
		return pdf;
	}
	public void setPdf(MultipartFile pdf) {
		this.pdf = pdf;
	}
	
	

}
