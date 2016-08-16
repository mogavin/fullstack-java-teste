package br.com.mogav.lemontech.client;

import java.util.Collection;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import org.joda.time.DateTime;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBookingService;
import br.com.mogav.lemontech.client.PesquisaSolicitacaoClient;

public class TesteClient {

	public static void main(String[] args) throws DatatypeConfigurationException {		
		Date hoje = new Date();
		Date tresMesesAtras = new DateTime().minusYears(5).toDate();

		WsSelfBookingService service = new WsSelfBookingService();
		PesquisaSolicitacaoClient client = new PesquisaSolicitacaoClient(service);
		Collection<Solicitacao> solicitacoes = client.obterSolicitacoesComAereos(tresMesesAtras, hoje);
	
		System.err.println("Resultados: " + solicitacoes.size());
		
		for(Solicitacao solicitacao : solicitacoes){
			for(Aereo aereo : solicitacao.getAereos().getAereo()){
				System.err.println(aereo.getSource());
			}
		}
    }
}