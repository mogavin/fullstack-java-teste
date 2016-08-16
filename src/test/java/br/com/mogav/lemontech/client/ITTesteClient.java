package br.com.mogav.lemontech.client;

import java.util.Collection;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import org.joda.time.DateTime;

import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBookingService;
import br.com.mogav.lemontech.model.InfoViagemAereo;

public class ITTesteClient {

	public static void main(String[] args) throws DatatypeConfigurationException {		
		Date hoje = new Date();
		Date tresMesesAtras = new DateTime().minusYears(2).toDate();

		WsSelfBookingService service = new WsSelfBookingService();
		PesquisaSolicitacaoClient client = new PesquisaSolicitacaoClient(service);
		Collection<InfoViagemAereo> infosViagem = client.obterInfosViagemAereo(tresMesesAtras, hoje);
	
		System.err.println("Resultados: " + infosViagem.size());
		
		for(InfoViagemAereo infoViagem : infosViagem){
			System.err.println(infoViagem);
		}
    }
}