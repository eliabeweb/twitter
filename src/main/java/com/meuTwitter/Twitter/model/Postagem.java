package com.meuTwitter.Twitter.model;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Postagem {

	@Id
	@GeneratedValue
	private Integer id;
	@NotBlank
	private String descricao;
	private LocalDateTime horario;

	public Postagem() {

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getHorario() {
		return horario;
	}

	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}

}
