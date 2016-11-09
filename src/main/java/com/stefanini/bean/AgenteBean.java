package com.stefanini.bean;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;

@Named("agenteMB")
@SessionScoped
public class AgenteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private AgenteService agenteService;

	@Inject
	private Agente agente;

	private List<Agente> agentes;

	public List<Agente> getAgentes() {
		return agentes;
	}

	public void setAgentes(List<Agente> agentes) {
		this.agentes = agentes;
	}

	public Agente getAgente() {
		if (agente == null) {
			agente = new Agente();
		}
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public String chamar(String agente) {
		return "pages/teste?faces-redirect=true&nome=" + agente;
	}

	public void incluir(Agente agente) {
		System.out.println("agente");
		agenteService.incluir(agente);
	}
	
	/*public List<Agente> getAgentes() {
        return agenteService.listar();
    }*/
	
	@PostConstruct
    public void init() {
		System.out.println("init agent list");
        this.agentes = agenteService.listar();
    }

}
