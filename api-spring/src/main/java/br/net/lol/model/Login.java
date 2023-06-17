package br.net.lol.model;

import java.io.Serializable;

public class Login implements Serializable {
private String email;
private String senha;

public Login() {
	super();
}

public Login(String email, String senha) {
	super();
	this.email = email;
	this.senha = senha;
}
// setters/getters
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
}
