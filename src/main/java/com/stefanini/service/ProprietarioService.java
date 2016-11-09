package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.model.Proprietario;
import com.stefanini.repository.ProprietarioRepository;
import com.stefanini.repository.ProprietarioRepository;

@Stateless
public class ProprietarioService {
	
	@Inject 
	Proprietario proprietario = new Proprietario();
	
	@Inject 
	ProprietarioRepository proprietarioRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	
	public void incluir(Proprietario proprietario) {
		proprietarioRepository.incluir(proprietario);
	}
	
	public List<Proprietario> listar() {
		return proprietarioRepository.lista();
	}
	
	

}
