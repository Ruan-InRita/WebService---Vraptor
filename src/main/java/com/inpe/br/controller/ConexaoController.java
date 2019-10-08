package com.inpe.br.controller;

import javax.inject.Inject;

import com.inpe.br.DAO.Conexao;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class ConexaoController {

	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected ConexaoController() {
		this(null);
	}

	@Inject
	public ConexaoController(Result result) {
		this.result = result;
	}

	@Path("/conexao/")
	public void testar() {
		String teste ="";
		Conexao con = new Conexao();
		try {
			if (con.conectando() != null) {
				teste = "Conexao funciona";
			} else {
				teste = "Erro na conexao";
			}
		} catch (java.lang.NullPointerException err) {
			teste = "Erro na conexao";
		}
		result.include("cone", teste);
	}

}
