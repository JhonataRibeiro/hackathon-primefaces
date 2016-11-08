package com.stefanini.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Proprietario;
import com.stefanini.repository.PropietarioRepository;

@Stateless
public class PropietarioService {
	
	@Inject 
	Proprietario propietario = new Proprietario();
	
	@Inject 
	PropietarioRepository propietarioRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	
	public void incluir(Proprietario proprietario) {
		propietarioRepository.incluir(proprietario);

	}
	
	

}
