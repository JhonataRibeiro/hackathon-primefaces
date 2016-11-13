package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Localinfracao;
import com.stefanini.model.Proprietario;
import com.stefanini	.model.Tipoinfracao;
import com.stefanini.repository.TipoInfracaoRepository;

@Stateless
public class TipoInfracaoService {

	@Inject
    private TipoInfracaoRepository tipoInfracaoRepository;
	
	 @TransactionAttribute(TransactionAttributeType.REQUIRED)
	    public Tipoinfracao busca(Integer id){
	    	return tipoInfracaoRepository.busca(id);
	    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
	public List<Tipoinfracao> listar() {
		return tipoInfracaoRepository.lista();
	}
	
}
