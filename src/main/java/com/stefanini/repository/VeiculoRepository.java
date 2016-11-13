package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Veiculo;

public class VeiculoRepository {

	@Inject
	private EntityManager manager;

	public void incluir(Veiculo veiculos) {
		this.manager.persist(veiculos);
	}

	public void altera(Veiculo veiculos) {
		this.manager.merge(veiculos);
	}

	public Veiculo busca(Integer id) {
		return this.manager.find(Veiculo.class, id);
	}

	public List<Veiculo> lista() {
		return this.manager.createQuery("select c from Veiculo c", Veiculo.class).getResultList();
	}

}
