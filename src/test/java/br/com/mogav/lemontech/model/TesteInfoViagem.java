package br.com.mogav.lemontech.model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereos;
import nl.jqno.equalsverifier.EqualsVerifier;

public class TesteInfoViagem {
	
	private static final DateTimeFormatter DTF = DateTimeFormat.forPattern("dd/MM/yyyy");
	
	private static final String NOME_PASSAGEIRO = "NOME_PASSAGEIRO";
	private static final String CIA_AEREA = "CIA_AEREA";
	private static final Long TIMESTAMP_SAIDA = DTF.parseDateTime("01/02/1987").getMillis();
	private static final Long TIMESTAMP_CHEGADA = DTF.parseDateTime("03/02/1987").getMillis();
	private static final String CIDADE_ORIGEM = "CIDADE_ORIGEM";
	private static final String CIDADE_DESTINO = "CIDADE_DESTINO";
	
	private Solicitacao mockSolicitacaoComAereos;
	private Aereo mockAereo;
	private AereoSeguimento mockAereoSeguimento;

	@Before
	public void setup() throws DatatypeConfigurationException{
		this.mockSolicitacaoComAereos = mock(Solicitacao.class, RETURNS_DEEP_STUBS);
		this.mockAereo = mock(Aereo.class);
		Aereos mockAereos = mock(Aereos.class); when(mockSolicitacaoComAereos.getAereos()).thenReturn(mockAereos);
		when(mockAereos.getAereo()).thenReturn(Lists.newArrayList(mockAereo));		
		
		this.mockAereoSeguimento = mock(AereoSeguimento.class, RETURNS_DEEP_STUBS);
		when(mockAereo.getAereoSeguimento()).thenReturn(Lists.newArrayList(mockAereoSeguimento));
	}
	
	
	@Test(expected=NullPointerException.class)
	public void naoPermitirSolicitacoesSemAereos(){		
		Solicitacao semAereos = new Solicitacao();
		InfoViagemAereo.extrairInfoViagemAereo(semAereos);
	}
	
	@Test
	public void obterNomePassageiro(){
		Passageiro mockPassageiro = mock(Passageiro.class);
		when(mockPassageiro.getNomeCompleto()).thenReturn(NOME_PASSAGEIRO);
		when(mockSolicitacaoComAereos.getSolicitante()).thenReturn(mockPassageiro);
		
		InfoViagemAereo infoViagem = InfoViagemAereo.extrairInfoViagemAereo(mockSolicitacaoComAereos);
		
		assertEquals(NOME_PASSAGEIRO, infoViagem.getNomePassageiro());
	}
	
	@Test
	public void obterCiaAerea(){
		when(mockAereo.getSource()).thenReturn(CIA_AEREA);
		
		InfoViagemAereo infoViagem = InfoViagemAereo.extrairInfoViagemAereo(mockSolicitacaoComAereos);
		
		assertEquals(CIA_AEREA, infoViagem.getCiaAerea());
	}
	
	@Test
	public void obterDataSaida() throws DatatypeConfigurationException{
		Date dataHoraSaida = new Date(TIMESTAMP_SAIDA);		
		when(mockAereoSeguimento.getDataSaida()).thenReturn(converterParaXMLGregorianCalendar(TIMESTAMP_SAIDA));

		InfoViagemAereo infoViagem = InfoViagemAereo.extrairInfoViagemAereo(mockSolicitacaoComAereos);
		
		assertEquals(dataHoraSaida, infoViagem.getDataSaida());
	}
	
	@Test
	public void obterDataChegada() throws DatatypeConfigurationException{
		Date dataHoraChegada = new Date(TIMESTAMP_CHEGADA);		
		when(mockAereoSeguimento.getDataChegada()).thenReturn(converterParaXMLGregorianCalendar(TIMESTAMP_CHEGADA));
		
		InfoViagemAereo infoViagem = InfoViagemAereo.extrairInfoViagemAereo(mockSolicitacaoComAereos);
		
		assertEquals(dataHoraChegada, infoViagem.getDataChegada());
	}
	
	@Test
	public void obterCidadeOrigem(){
		when(mockAereoSeguimento.getCidadeOrigem()).thenReturn(CIDADE_ORIGEM);
		
		InfoViagemAereo infoViagem = InfoViagemAereo.extrairInfoViagemAereo(mockSolicitacaoComAereos);
		
		assertEquals(CIDADE_ORIGEM, infoViagem.getCidadeOrigem());
	}
	
	@Test
	public void obterCidadeDestino(){
		when(mockAereoSeguimento.getCidadeDestino()).thenReturn(CIDADE_DESTINO);
		
		InfoViagemAereo infoViagem = InfoViagemAereo.extrairInfoViagemAereo(mockSolicitacaoComAereos);
		
		assertEquals(CIDADE_DESTINO, infoViagem.getCidadeDestino());
	}
	
	@Test
	public void verificaToString(){
		InfoViagemAereo infoViagem = new InfoViagemAereo(NOME_PASSAGEIRO, CIA_AEREA, TIMESTAMP_SAIDA,
														TIMESTAMP_CHEGADA, CIDADE_ORIGEM, CIDADE_DESTINO);		
		assertEquals("Passageiro: NOME_PASSAGEIRO, Cia. Aérea: CIA_AEREA, "
						+ "Data saída: 01/02/1987, Data chegada: 03/02/1987, "
						+ "Cidade origem: CIDADE_ORIGEM, Cidade destino: CIDADE_DESTINO",
						infoViagem.toString());
	}
	
	@Test
	public void verificaEqualsEHashcode(){
		EqualsVerifier.forClass(InfoViagemAereo.class).verify();
	}
	
	
	/**
	 * Método auxiliar para converter um timestamp em uma instância de XMLGregorianCalendar.
	 * 
	 */
	private static final XMLGregorianCalendar converterParaXMLGregorianCalendar(Long timestamp)
																	throws DatatypeConfigurationException{		
		GregorianCalendar data = new GregorianCalendar(); data.setTimeInMillis(timestamp);		
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(data);
	}
}