package br.com.mogav.lemontech.service;

import java.util.Collection;
import java.util.Date;

import org.joda.time.DateTime;

import br.com.mogav.lemontech.client.PesquisaSolicitacaoClient;
import br.com.mogav.lemontech.model.InfoViagemAereo;
import br.com.mogav.lemontech.persistencia.InfoViagemAereoDao;

public class InfoViagemService {

	private static final Long TMSP_INICIAL_ATUALIZACAO = new DateTime().minusYears(2).getMillis();
	private static final Long TMSP_FINAL_ATUALIZACAO = new Date().getTime();
	
	private final PesquisaSolicitacaoClient client;
	private final InfoViagemAereoDao dao;
	
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
	public Collection<InfoViagemAereo> consultarEAtualizarInfos() {
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
	
	public static final Date getDataInicialConsultaWebservice(){
		return new Date(TMSP_INICIAL_ATUALIZACAO);
	}
	
	public static final Date getDataFinalConsultaWebservice(){
		return new Date(TMSP_FINAL_ATUALIZACAO);
	}
}