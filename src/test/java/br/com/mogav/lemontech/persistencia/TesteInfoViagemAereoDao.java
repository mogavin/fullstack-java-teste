package br.com.mogav.lemontech.persistencia;

import static br.com.mogav.lemontech.fixture.XMLCalendarFixture.converterParaXMLGregorianCalendar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereos;
import br.com.mogav.lemontech.model.InfoViagemAereo;

public class TesteInfoViagemAereoDao extends BaseTesteDAO<InfoViagemAereo>{
 
	private List<InfoViagemAereo> infosViagens;
	private InfoViagemAereoDao dao;
	
	@Before
	public void setup(){
		this.infosViagens = ImmutableList.of(
			new InfoViagemAereo("Daniella Thiemi Suzuki", "GOL_V2", 40L, 50L, "SAO PAULO", "VITORIA"),
			new InfoViagemAereo("Roger Fontella", "SABRE", 60L, 70L, "PORTO ALEGRE", "SAO PAULO")
		);
		this.dao = new InfoViagemAereoDao(this.entityManager);
	}
	
	@Override
	protected JPADao<InfoViagemAereo> obterDAO() {
		return this.dao;
	}
	
	
	@Test
	public void recuperarPorId(){		
		InfoViagemAereo salvo = dao.salvarOuAtualizar(infosViagens.get(0));
		InfoViagemAereo recuperado = dao.buscarPorId(salvo.getId());
		assertNotNull(recuperado);
	}
	
	@Test
	public void listarTodos(){
		dao.salvarEAtualizarTodos(infosViagens);
		assertTrue(CollectionUtils.isEqualCollection(infosViagens, dao.listarTodos()));
	}
	
	@Test
	public void editar(){
		InfoViagemAereo salvo = dao.salvarOuAtualizar(infosViagens.get(0));
		InfoViagemAereo recuperado = dao.buscarPorId(salvo.getId());
		
		String novaCiaAerea = "AVIANCA";		
		Solicitacao solicitacao = criarSolicitacao(recuperado.getId(), recuperado.getNomePassageiro(), novaCiaAerea,
									recuperado.getDataSaida().getTime(), recuperado.getDataChegada().getTime(), 
									recuperado.getCidadeOrigem(), recuperado.getCidadeDestino());
		
		//Utilizamos o construtor estático para testar se o id da Solicitacao é repassado para a InfoViagemAereo
		InfoViagemAereo atualizado = InfoViagemAereo.extrairInfoViagemAereo(solicitacao);
		dao.salvarOuAtualizar(atualizado);
		
		assertEquals(1, dao.listarTodos().size());
		assertEquals(atualizado.getCiaAerea(), dao.buscarPorId(atualizado.getId()).getCiaAerea());
	}
	
	
	@After
	public void clean(){
		this.dao.apagarTodos();
	}
	
	
	
	/**
	 * Método de testes auxiliar para criar uma instância de 'Solicitacao'.
	 * 
	 */
	private static final Solicitacao criarSolicitacao(Long id, String nomePassageiro, String ciaAerea, Long timestampSaida, 
														Long timestampChegada, String cidadeOrigem, String cidadeDestino){
		AereoSeguimento seguimento = new AereoSeguimento();
		seguimento.setDataSaida(converterParaXMLGregorianCalendar(timestampSaida));
		seguimento.setDataChegada(converterParaXMLGregorianCalendar(timestampChegada));
		seguimento.setCidadeOrigem(cidadeOrigem);
		seguimento.setCidadeDestino(cidadeDestino);
		
		Aereo mockProdAereo = mock(Aereo.class);
		when(mockProdAereo.getSource()).thenReturn(ciaAerea);
		when(mockProdAereo.getAereoSeguimento()).thenReturn(Lists.newArrayList(seguimento));
		
		Aereos mockAereos = mock(Aereos.class);		
		when(mockAereos.getAereo()).thenReturn(Lists.newArrayList(mockProdAereo));
		
		Solicitacao solicitacao = new Solicitacao();
		Passageiro passageiro = new Passageiro(); passageiro.setNomeCompleto(nomePassageiro);
		solicitacao.setIdCliente(id.intValue());
		solicitacao.setSolicitante(passageiro);
		solicitacao.setAereos(mockAereos);
		
		return solicitacao;
	}
}