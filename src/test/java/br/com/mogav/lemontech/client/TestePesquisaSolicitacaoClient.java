package br.com.mogav.lemontech.client;

import static br.com.mogav.lemontech.fixture.XMLCalendarFixture.converterParaXMLGregorianCalendar;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Before;
import org.junit.Test;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereos;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBooking;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBookingService;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;
import br.com.mogav.lemontech.model.InfoViagemAereo;

import com.google.common.collect.Lists;

public class TestePesquisaSolicitacaoClient {
	
	private static final DateTimeFormatter DTF = DateTimeFormat.forPattern("dd/MM/yyyy");

	private static final Long TIMESTAMP_INICIAL = DTF.parseDateTime("01/02/1987").getMillis();
	private static final Long TIMESTAMP_FINAL = DTF.parseDateTime("03/02/1987").getMillis();
	
	private WsSelfBookingService mockService;
	private PesquisaSolicitacaoClient spyClient;
	
	@Before
	public void setup(){
		this.mockService = mock(WsSelfBookingService.class, RETURNS_DEEP_STUBS);
		this.spyClient = spy(new PesquisaSolicitacaoClient(mockService));
	}
	
	
	@Test
	public void criarNovaPesquisa(){
		Date dataInicial = new Date(TIMESTAMP_INICIAL);
		Date dataFinal = new Date(TIMESTAMP_FINAL);
		
		PesquisarSolicitacaoRequest respostaEsperada = new PesquisarSolicitacaoRequest();
		respostaEsperada.setRegistroInicial(1);
		respostaEsperada.setDataInicial(converterParaXMLGregorianCalendar(TIMESTAMP_INICIAL));
		respostaEsperada.setDataFinal(converterParaXMLGregorianCalendar(TIMESTAMP_FINAL));
		
		//Executamos o método a ser testado
		PesquisarSolicitacaoRequest respostaObtida = spyClient.criarPesquisaRequest(dataInicial, dataFinal);
		
		assertEquals(respostaEsperada.getRegistroInicial(), respostaObtida.getRegistroInicial());
		assertEquals(respostaEsperada.getDataInicial(), respostaObtida.getDataInicial());
		assertEquals(respostaEsperada.getDataFinal(), respostaObtida.getDataFinal());
	}
	
	@Test
	public void obterSolicitacoesViagemPorPeriodo(){		
		List<Solicitacao> respostaEsperada = Lists.newArrayList(mock(Solicitacao.class));
		Date dataInicial = new Date(TIMESTAMP_INICIAL);
		Date dataFinal = new Date(TIMESTAMP_FINAL);

		PesquisarSolicitacaoRequest mockPesquisaRequest = mock(PesquisarSolicitacaoRequest.class);
		doReturn(mockPesquisaRequest).when(spyClient).criarPesquisaRequest(dataInicial, dataFinal);
		
		PesquisarSolicitacaoResponse mockResponse = mock(PesquisarSolicitacaoResponse.class);
		when(mockResponse.getSolicitacao()).thenReturn(respostaEsperada);
		WsSelfBooking mockPort = mockService.getWsSelfBookingPort();
		when(mockPort.pesquisarSolicitacao(PesquisaSolicitacaoClient.KEY_CLIENT,
											PesquisaSolicitacaoClient.USER_NAME, 
											PesquisaSolicitacaoClient.USER_PASSWORD,
											mockPesquisaRequest))
			.thenReturn(mockResponse);
		
		//Executamos o método a ser testado
		Collection<Solicitacao> respostaObtida = spyClient.obterSolicitacoesPeriodo(dataInicial, dataFinal);
		
		assertEquals(respostaEsperada, respostaObtida);
	}
	
	@Test
	public void obterSolicitacoesApenasComProdutosAereos(){
		Date dataInicial = new Date(TIMESTAMP_INICIAL);
		Date dataFinal = new Date(TIMESTAMP_FINAL);		
		Solicitacao semProdutosAereos = new Solicitacao(); semProdutosAereos.setAereos(null);
		Solicitacao comProdutosAereos = new Solicitacao(); comProdutosAereos.setAereos(mock(Aereos.class));
		Collection<Solicitacao> respostaEsperada = Lists.newArrayList(comProdutosAereos);
		
		Collection<Solicitacao> solicitacoesComESemAereos = Lists.newArrayList(semProdutosAereos, comProdutosAereos);
		doReturn(solicitacoesComESemAereos).when(spyClient).obterSolicitacoesPeriodo(dataInicial, dataFinal);

		//Executamos o método a ser testado
		Collection<Solicitacao> respostaObtida = spyClient.obterSolicitacoesComAereos(dataInicial, dataFinal);
		
		assertTrue(CollectionUtils.isEqualCollection(respostaEsperada, respostaObtida));
	}
	
	@Test
	public void obterInformacoesDeViagensAereas(){
		Date dataInicial = new Date(TIMESTAMP_INICIAL);
		Date dataFinal = new Date(TIMESTAMP_FINAL);
		
		//Executamos o método a ser testado
		Collection<InfoViagemAereo> respostaObtida = spyClient.obterInfosViagemAereo(dataInicial, dataFinal);
		
		fail();
	}
}