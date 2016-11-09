package com.stefanini.bean;

import javax.inject.Named;

import com.stefanini.service.DenuncianteService;

@Named( "denunciaMB")
public class DenunciaBean {

    public String chamar() {
        return "pages/teste.jsf";
    }

}
