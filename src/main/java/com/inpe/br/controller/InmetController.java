package com.inpe.br.controller;

import java.util.List;

import javax.inject.Inject;

import com.inpe.br.DAO.inmetDAO;
import com.inpe.br.model.inmet;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller 
public class InmetController {
	
	private final Result result;
	
	protected InmetController() {
		this(null);
	}
	
	@Inject
	public InmetController(Result result) {
		this.result = result;
	}
	
	@Inject
    private inmetDAO dao;
	
	@Inject
    private inmet in;
	
	@Get("/imagens/")
    public void lista() {
		List <inmet> lista = dao.listaTodos();		
		result.use( Results.json() ).from( lista ).serialize();
		
		System.out.println("OLA MANS");
       
    }

}
