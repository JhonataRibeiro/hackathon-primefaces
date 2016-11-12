package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Localinfracao;
import com.stefanini.repository.LocalInfracaoRepository;

@Stateless
public class LocalInfracaoService {

	@Inject
    private LocalInfracaoRepository localInfracaoRepository;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(Localinfracao localInfracao){
    	localInfracaoRepository.incluir(localInfracao);
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Localinfracao busca(Integer id){
    	return localInfracaoRepository.busca(id);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	public List<Localinfracao> listar() {
		return localInfracaoRepository.lista();
	}
	
}
