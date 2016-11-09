package com.stefanini.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.mail.FetchProfile.Item;

import com.stefanini.model.Agente;
import com.stefanini.model.Proprietario;
import com.stefanini.model.Veiculos;
import com.stefanini.service.ProprietarioService;
import com.stefanini.service.VeiculosService;


@Named("veiculoMB")
@SessionScoped
public class VeiculosBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Veiculos veiculos;
	
	@Inject
	private VeiculosService veiculosService;
	
	@Inject
	private ProprietarioService propietarioService;
	
	private Proprietario proprietario;


	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Veiculos getVeiculos() {
		System.out.println("called veiculos");
		return veiculos;
	}

	public void setVeiculos(Veiculos veiculos) {
		this.veiculos = veiculos;
	}
	
	public void incluir(Veiculos veiculos) {
		System.out.println("called veiculos bean");
		veiculosService.incluir(veiculos);
	}
	
	public List<Proprietario> completePropietario(Proprietario proprietario) {
        return propietarioService.listar();
    }
	
	
	
}
