package com.stefanini.bean;

import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;
import com.stefanini.service.DenuncianteService;

@Named( "agenteMB")
public class AgenteBean {
	
    @Inject
    private AgenteService agenteService;
    
    @Inject
    private Agente agente;

    public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public String chamar(String agente) {
        return "pages/teste?faces-redirect=true&nome=" + agente;
    }
	
	public String incluir() {
		//agenteService.incluir(agente);
		//chamar("fidjsao");
		return "pages/teste?faces-redirect=true&nome=teste";
    }


}
