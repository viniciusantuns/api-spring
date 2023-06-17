package br.net.lol.model;

import java.io.Serializable;
public class Usuario implements Serializable {
private int id;
private String nome;
private String email;
private String senha;
private String perfil;

public Usuario() {
	super();
} 

public Usuario(int id, String nome, String email, String senha, String perfil) {
	super();
	this.id = id;
	this.nome = nome;
	this.email = email;
	this.senha = senha;
	this.perfil = perfil;
	
} 

	// setters/getters e 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
}
