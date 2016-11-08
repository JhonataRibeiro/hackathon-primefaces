package com.stefanini.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Infracoes;
import com.stefanini.model.Proprietario;
import com.stefanini.service.PropietarioService;

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
	PropietarioService propietarioService;
	
	public void inlcuir(Proprietario proprietario) {
		propietarioService.incluir(proprietario);
	}

}
