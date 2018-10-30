package com.meuTwitter.Twitter.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private Integer id;
	@NotBlank
	@Column(unique = true)
	private String email;
	@NotBlank
	private String senha;
	@NotBlank
	private String nomeDeUsuario;
	@OneToMany
	private List<Postagem> postagens;

	public Usuario() {
		postagens = new ArrayList<>();
	}
	
	

	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
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

	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}

	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}

}
