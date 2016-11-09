package com.stefanini.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Telefones implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	
	private int numero;
	private int ddd;
	
	@OneToMany
	private List<Proprietario> cpfProprietario;
	
	@OneToMany
	private List<Tipotelefone> idTipoTelefone;
	
	// Gets e Sets

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public List<Proprietario> getCpfProprietario() {
		return cpfProprietario;
	}

	public void setCpfProprietario(List<Proprietario> cpfProprietario) {
		this.cpfProprietario = cpfProprietario;
	}

	public List<Tipotelefone> getIdTipoTelefone() {
		return idTipoTelefone;
	}

	public void setIdTipoTelefone(List<Tipotelefone> idTipoTelefone) {
		this.idTipoTelefone = idTipoTelefone;
	}

	
}