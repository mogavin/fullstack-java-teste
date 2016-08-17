package br.com.mogav.lemontech.controller;

import java.util.Collection;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.mogav.lemontech.model.InfoViagemAereo;
import br.com.mogav.lemontech.service.InfoViagemService;

@Controller
@Path("")
public class ProdutosAereosController {

	private final Result result;
	private final InfoViagemService service;
	
	 /**
     * @deprecated CDI eyes only
     */
	ProdutosAereosController(){
    	this(null, null);
    }

	@Inject
	public ProdutosAereosController(Result result, InfoViagemService service) {
		this.result = result;
		this.service = service;
	}

	@Path({"", "/"})
	public void listar(){
		Collection<InfoViagemAereo> infosViagens = this.service.atualizarERetornarInfos();
		this.result.include("infosViagens", infosViagens);
		
		this.result.include("dataInicialConsulta", this.service.getDataInicialConsultaWebservice());
		this.result.include("dataFinalConsulta", this.service.getDataFinalConsultaWebservice());
	}
}