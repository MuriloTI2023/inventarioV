package com.varejo.inventario.models;

public class prestadoresModels {
	
	private String nome;
	private String CPF;
	private String contato;
	private String area;
	private String funcao;
	public prestadoresModels() {
		super();
		// TODO Auto-generated constructor stub
	}
	public prestadoresModels(String nome, String cPF, String contato, String area, String funcao) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.contato = contato;
		this.area = area;
		this.funcao = funcao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	

}
