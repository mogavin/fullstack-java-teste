package br.com.lemontech.selfbooking.wsselfbooking.services;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.joda.time.DateTime;

import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;

public class PesquisaSolicitacaoClient {

	public static void main(String[] args) throws DatatypeConfigurationException {
		
		DateTime hoje = new DateTime();
		DateTime tresMesesAtras = hoje.minusYears(7);
		
		XMLGregorianCalendar xmlGregHoje = converterParaXMLGregorianCalendar(hoje.toGregorianCalendar());
		System.err.println(xmlGregHoje);
		XMLGregorianCalendar xmlGregTresMesesAtras = converterParaXMLGregorianCalendar(tresMesesAtras.toGregorianCalendar());
		System.err.println(xmlGregTresMesesAtras);


		WsSelfBookingService helloService = new WsSelfBookingService();
		WsSelfBooking hello = helloService.getWsSelfBookingPort();
		
		PesquisarSolicitacaoRequest pesquisarSolicitacao = new PesquisarSolicitacaoRequest();
		pesquisarSolicitacao.setRegistroInicial(1);
		pesquisarSolicitacao.setDataInicial(xmlGregTresMesesAtras);
		pesquisarSolicitacao.setDataFinal(xmlGregHoje);


		PesquisarSolicitacaoResponse response = hello.pesquisarSolicitacao(
												"base_teste_qa", 
												"a23b66e93a17759937046c0cc190d9e0", 
												"738c0d4bd196432fe90f091af8816674", 
												pesquisarSolicitacao);
		
		System.out.println(response.getResultadoAcao());
		System.out.println(response.getNumeroSolicitacoes());
		System.out.println(response.getSolicitacao());
		System.out.println(response.getMensagemRetorno());
    }
	
	private static XMLGregorianCalendar converterParaXMLGregorianCalendar(GregorianCalendar data)
															throws DatatypeConfigurationException{
		return DatatypeFactory.newInstance().newXMLGregorianCalendar(data);
	}
}
