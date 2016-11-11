package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Infracoes;
import com.stefanini.repository.InfracoesRepository;

@Stateless
public class InfracoesService {

	@Inject
    private InfracoesRepository infracaoRepository;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(Infracoes infracao){
    	infracaoRepository.incluir(infracao);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	public List<Infracoes> listar() {
		return infracaoRepository.lista();
	}
}
