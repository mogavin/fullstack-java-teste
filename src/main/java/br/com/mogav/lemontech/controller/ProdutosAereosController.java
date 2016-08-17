package br.com.mogav.lemontech.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;

@Controller
public class ProdutosAereosController {

	 /**
     * @deprecated CDI eyes only
     */
	ProdutosAereosController(){
    	this(null);
    }

	@Inject
	public ProdutosAereosController(Result result) {

	}

	public void listar(){}
}
