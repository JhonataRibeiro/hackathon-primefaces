package com.stefanini.bean;

import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.service.DenuncianteService;

//faz a ligação entre a tela e a bean que tem o papel de controlar a tela.
@Named( "denunciaMB")
public class DenunciaBean {

    @Inject
    private DenuncianteService denunciaService;

    public String chamar() {
        return "pages/teste.jsf";
    }

}
