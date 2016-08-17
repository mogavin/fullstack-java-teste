package br.com.mogav.lemontech.client;

import static br.com.mogav.lemontech.fixture.XMLCalendarFixture.converterParaXMLGregorianCalendar;

import java.util.Collection;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.xml.datatype.XMLGregorianCalendar;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBooking;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBookingService;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;
import br.com.mogav.lemontech.model.InfoViagemAereo;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;

@RequestScoped
public class PesquisaSolicitacaoClient {

	static final String KEY_CLIENT = "base_teste_qa";
	static final String USER_NAME = "a23b66e93a17759937046c0cc190d9e0";
	static final String USER_PASSWORD = "738c0d4bd196432fe90f091af8816674";
	
	private final WsSelfBookingService service;
	
	 /**
     * @deprecated CDI eyes only
     */
	PesquisaSolicitacaoClient() {
		this(null);
	}

	@Inject
	public PesquisaSolicitacaoClient(WsSelfBookingService service) {
		this.service = service;
	}
	
	
	public Collection<InfoViagemAereo> obterInfosViagemAereo(Date dataInicial, Date dataFinal) {
		Collection<InfoViagemAereo> infosViagem = Sets.newHashSet();
		
		Collection<Solicitacao> comAereos = this.obterSolicitacoesComAereos(dataInicial, dataFinal);
		for(Solicitacao comProdutoAereo : comAereos)
			infosViagem.add(InfoViagemAereo.extrairInfoViagemAereo(comProdutoAereo));
		
		return infosViagem;
	}
	
	Collection<Solicitacao> obterSolicitacoesComAereos(Date dataInicial, Date dataFinal) {
		Collection<Solicitacao> solicitacoes = this.obterSolicitacoesPeriodo(dataInicial, dataFinal);
		return filtrarComProdutosAereos(solicitacoes);
	}

	Collection<Solicitacao> obterSolicitacoesPeriodo(Date dataInicial, Date dataFinal) {
		PesquisarSolicitacaoRequest pesquisa = criarPesquisaRequest(dataInicial, dataFinal);
		WsSelfBooking port = service.getWsSelfBookingPort();
		
		PesquisarSolicitacaoResponse response = port.pesquisarSolicitacao(KEY_CLIENT, USER_NAME, 
																			USER_PASSWORD, pesquisa);
		return response.getSolicitacao();
	}
	
	PesquisarSolicitacaoRequest criarPesquisaRequest(Date dataInicial, Date dataFinal){		
		XMLGregorianCalendar xmlDataInicial = converterParaXMLGregorianCalendar(dataInicial.getTime());
		XMLGregorianCalendar xmlDataFinal = converterParaXMLGregorianCalendar(dataFinal.getTime());

		PesquisarSolicitacaoRequest pesquisarSolicitacao = new PesquisarSolicitacaoRequest();
		pesquisarSolicitacao.setRegistroInicial(1);
		pesquisarSolicitacao.setDataInicial(xmlDataInicial);
		pesquisarSolicitacao.setDataFinal(xmlDataFinal);
		
		return pesquisarSolicitacao;
	}
	
	private static final Collection<Solicitacao> filtrarComProdutosAereos (Collection<Solicitacao> solicitacoes){
		Collection<Solicitacao> semAereos =
			Collections2.filter(solicitacoes, new Predicate<Solicitacao>() {
			    @Override
			    public boolean apply(Solicitacao solicitacao) {
			        return solicitacao.getAereos() != null;
			    }
			});		
		return semAereos;
	}	
}