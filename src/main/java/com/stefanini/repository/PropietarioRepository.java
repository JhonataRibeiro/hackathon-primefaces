package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Proprietario;


public class PropietarioRepository {

	@Inject
	private EntityManager manager;
	
	public void incluir(Proprietario proprietario) {
		this.manager.persist(proprietario);
	}
		
}
