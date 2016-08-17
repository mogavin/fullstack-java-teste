package br.com.mogav.lemontech.service;

import java.util.Collection;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.joda.time.DateTime;

import br.com.mogav.lemontech.client.PesquisaSolicitacaoClient;
import br.com.mogav.lemontech.model.InfoViagemAereo;
import br.com.mogav.lemontech.persistencia.InfoViagemAereoDao;

@RequestScoped
public class InfoViagemService {
	
	private final PesquisaSolicitacaoClient client;
	private final InfoViagemAereoDao dao;
	
	/**
     * @deprecated CDI eyes only
     */
	InfoViagemService() {
		this(null, null);
	}
	
	@Inject
	public InfoViagemService(PesquisaSolicitacaoClient client, InfoViagemAereoDao dao) {
		this.client = client;
		this.dao = dao;
	}

	
	/**
	 * Lista todas as informações de viagens com produtos aéreos atualizadas
	 * de acordo com o período estipulado pelo retorno dos métodos 
	 * {@link #getDataInicialConsultaWebservice() getDataInicialConsultaWebservice} e 
	 * {@link #getDataFinalConsultaWebservice() getDataFinalConsultaWebservice}
	 * 
	 */
	public Collection<InfoViagemAereo> atualizarERetornarInfos() {
		this.atualizarBase();
		return this.dao.listarTodos();
	}

	/**
	 * Consulta o webservice e atualiza os dados na base.
	 * 
	 */
	boolean atualizarBase() {
		Date dataInicial = getDataInicialConsultaWebservice();
		Date dataFinal = getDataFinalConsultaWebservice();
		
		Collection<InfoViagemAereo>	infosViagensPeriodo = 
				this.client.obterInfosViagemAereo(dataInicial, dataFinal);
		
		return this.dao.salvarEAtualizarTodos(infosViagensPeriodo);
	}
	
	public Date getDataInicialConsultaWebservice(){
		return new DateTime().minusYears(2).toDate();
	}
	
	public Date getDataFinalConsultaWebservice(){
		return new Date();
	}
}