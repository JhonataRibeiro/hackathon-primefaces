package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Agente;
import com.stefanini.model.Veiculos;

public class VeiculosRepository {

	@Inject
	private EntityManager manager;

	public void incluir(Veiculos veiculos) {
		System.out.println("called veiculos repository");
		this.manager.persist(veiculos);
	}

	public void altera(Veiculos veiculos) {
		this.manager.merge(veiculos);
	}

	public Veiculos busca(Integer id) {
		return this.manager.find(Veiculos.class, id);
	}

	public List<Veiculos> lista() {
		return this.manager.createQuery("select c from Veiculos c", Veiculos.class).getResultList();
	}

}
