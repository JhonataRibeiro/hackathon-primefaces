package com.stefanini.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Infracoes{

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer idInfracao;
	
	@ManyToOne
	@JoinColumn(name = "idAgente")
	private Agente idAgente;
	
	@ManyToOne
	@JoinColumn(name = "idLocalInfracao")
	private Localinfracao idLocalInfracao;
	
	@ManyToOne
	@JoinColumn(name = "idTipoInfracao")
	private Tipoinfracao idTipoInfracao;
	
	@ManyToOne
	@JoinColumn(name = "placa")
	private Veiculos placa;
	
	private Integer velocidade;
	
	// Gets e Sets

	public Integer getIdInfracao() {
		return idInfracao;
	}

	public void setIdInfracao(Integer idInfracao) {
		this.idInfracao = idInfracao;
	}

	public Agente getIdAgente() {
		return idAgente;
	}

	public void setIdAgente(Agente idAgente) {
		this.idAgente = idAgente;
	}

	public Localinfracao getIdLocalInfracao() {
		return idLocalInfracao;
	}

	public void setIdLocalInfracao(Localinfracao idLocalInfracao) {
		this.idLocalInfracao = idLocalInfracao;
	}

	public Tipoinfracao getIdTipoInfracao() {
		return idTipoInfracao;
	}

	public void setIdTipoInfracao(Tipoinfracao idTipoInfracao) {
		this.idTipoInfracao = idTipoInfracao;
	}

	public Veiculos getPlaca() {
		return placa;
	}

	public void setPlaca(Veiculos placa) {
		this.placa = placa;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}

}