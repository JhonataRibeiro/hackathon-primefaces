package com.stefanini.bean;

import javax.inject.Named;

public class TesteBean {
	
	@Named( "testeMB")
	public void onload() { 
	    System.out.println("initializing testeBean on load");
	}

}
