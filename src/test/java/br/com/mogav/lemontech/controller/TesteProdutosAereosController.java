package br.com.mogav.lemontech.controller;

import java.util.Collection;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.google.common.collect.Sets;

import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.util.test.MockResult;
import br.com.mogav.lemontech.model.InfoViagemAereo;
import br.com.mogav.lemontech.service.InfoViagemService;

public class TesteProdutosAereosController {

	private Result mockResult;
	private InfoViagemService mockService;
	private ProdutosAereosController controller;
	
	@Before
	public void setup(){
		this.mockResult = new MockResult();
		this.mockService = mock(InfoViagemService.class);
		this.controller = new ProdutosAereosController(mockResult, mockService); 
	}
	
	
	@Test
	public void listarProdutos(){
		Date dataInicial = new Date(10L);
		Date dataFinal = new Date(500L);
		
		when(mockService.getDataInicialConsultaWebservice()).thenReturn(dataInicial);
		when(mockService.getDataFinalConsultaWebservice()).thenReturn(dataFinal);
		Collection<InfoViagemAereo> infosViagens = Sets.newHashSet(mock(InfoViagemAereo.class));
		when(mockService.atualizarERetornarInfos()).thenReturn(infosViagens);
		
		//Executamos o método a ser testado
		controller.listar();
		
		assertEquals(dataInicial, mockResult.included().get("dataInicialConsulta"));
		assertEquals(dataFinal, mockResult.included().get("dataFinalConsulta"));
		assertEquals(infosViagens, mockResult.included().get("infosViagens"));
	}
}