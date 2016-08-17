package br.com.mogav.lemontech.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

import br.com.mogav.lemontech.client.PesquisaSolicitacaoClient;
import br.com.mogav.lemontech.model.InfoViagemAereo;
import br.com.mogav.lemontech.persistencia.InfoViagemAereoDao;

public class TesteInfoViagemService {

	private static final List<InfoViagemAereo> INFOS_VIAGENS = ImmutableList.of(
		new InfoViagemAereo("Daniella Thiemi Suzuki", "GOL_V2", 40L, 50L, "SAO PAULO", "VITORIA"),
		new InfoViagemAereo("Roger Fontella", "SABRE", 60L, 70L, "PORTO ALEGRE", "SAO PAULO")
	);
	
	private PesquisaSolicitacaoClient mockClient;
	private InfoViagemAereoDao mockDao;
	private InfoViagemService spyService;
	
	@Before
	public void setup(){
		this.mockClient = mock(PesquisaSolicitacaoClient.class);
		this.mockDao = mock(InfoViagemAereoDao.class);
		this.spyService = spy(new InfoViagemService(mockClient, mockDao));
	}
	
	
	@Test
	public void atualizarABaseEListarTodasInfosViagens(){
		when(mockDao.listarTodos()).thenReturn(INFOS_VIAGENS);		
		
		//Executamos o método a ser testado
		Collection<InfoViagemAereo> respostaObtida = spyService.atualizarERetornarInfos();
		
		verify(spyService).atualizarBase();		
		assertEquals(INFOS_VIAGENS, respostaObtida);
	}
	
	@Test
	public void atualizarBase(){
		Date dataInicial = new Date(10L);
		Date dataFinal = new Date(500L);
		
		doReturn(dataInicial).when(spyService).getDataInicialConsultaWebservice();
		doReturn(dataFinal).when(spyService).getDataFinalConsultaWebservice();
		when(mockClient.obterInfosViagemAereo(dataInicial, dataFinal))
			.thenReturn(INFOS_VIAGENS);
		
		//Executamos o método a ser testado
		spyService.atualizarBase();
		
		verify(mockDao).salvarEAtualizarTodos(INFOS_VIAGENS);
	}
}
