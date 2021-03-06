package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Proprietario;
import com.stefanini.service.ProprietarioService;

@Named("propiearioMB")
@SessionScoped
public class PropietarioBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	Proprietario propietario;
	
	@Inject
	ProprietarioService propietarioService;
	
	public Proprietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Proprietario propietario) {
		this.propietario = propietario;
	}
	
	public void inlcuir(Proprietario proprietario) {
		propietarioService.incluir(proprietario);
	}

}
