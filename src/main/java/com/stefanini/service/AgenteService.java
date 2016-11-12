package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.repository.AgenteRepository;

@Stateless
public class AgenteService {
	@Inject
	private AgenteRepository agenteRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	
	public void incluir(Agente agente) {
		agenteRepository.incluir(agente);
	}
	
	public void deleta(Integer id) {
		agenteRepository.deleta(id);
	}
	
	public Agente buscar(Integer id) {
		return agenteRepository.busca(id);
	}
	
	public List<Agente> listar() {
		return agenteRepository.lista();
	}
}
