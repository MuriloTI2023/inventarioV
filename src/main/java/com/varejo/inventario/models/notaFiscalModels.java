package com.varejo.inventario.models;

import org.springframework.web.multipart.MultipartFile;

public class notaFiscalModels {
	
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
