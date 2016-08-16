package br.com.mogav.lemontech.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.common.base.Preconditions;

import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.AereoSeguimento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereos;

public class InfoViagemAereo {
	
	private final String nomePassageiro; 
	private final String ciaAerea;
	private final Long timestampSaida; 
	private final Long timestampChegada; 
	private final String cidadeOrigem; 
	private final String cidadeDestino;

		
	InfoViagemAereo(String nomePassageiro, String ciaAerea, Long timestampSaida, 
						Long timestampChegada, String cidadeOrigem, String cidadeDestino){
		this.nomePassageiro = nomePassageiro;
		this.ciaAerea = ciaAerea;
		this.timestampSaida = timestampSaida;
		this.timestampChegada = timestampChegada;
		this.cidadeOrigem = cidadeOrigem;
		this.cidadeDestino = cidadeDestino;
	}
	
	/**
	 * Construtor estático auxiliar que extrai informações do primeiro produto aéreo de uma solicitação.
	 * 
	 */
	public static final InfoViagemAereo extrairInfoViagemAereo(Solicitacao solicitacao){
		Aereo aereo = analisaSePossuiAereos(solicitacao);
		String nomePassageiro = solicitacao.getSolicitante().getNomeCompleto();
		String ciaAerea = aereo.getSource();

		AereoSeguimento seguimento = aereo.getAereoSeguimento().get(0);
		Long timestampSaida = seguimento.getDataSaida().toGregorianCalendar().getTimeInMillis();
		Long timestampChegada = seguimento.getDataChegada().toGregorianCalendar().getTimeInMillis();
		String cidadeOrigem = seguimento.getCidadeOrigem();
		String cidadeDestino = seguimento.getCidadeDestino();
		
		return new InfoViagemAereo(nomePassageiro, ciaAerea, timestampSaida, timestampChegada, cidadeOrigem, cidadeDestino);
	}

	public String getNomePassageiro() {
		return this.nomePassageiro;
	}

	public String getCiaAerea() {
		return this.ciaAerea;
	}

	public Date getDataSaida() {
		return new Date(this.timestampSaida);
	}
	
	public Date getDataChegada() {
		return new Date(this.timestampChegada);
	}
	
	public String getCidadeOrigem() {
		return this.cidadeOrigem;
	}
	
	public String getCidadeDestino() {
		return this.cidadeDestino;
	}
	

	/**
	 * @param solicitacao - Solicitação a ser analisada.
	 * @return A primeira instância da lista de aéreos da solicitação.
	 * @throws NullPointerException Caso a solicitação não possua nenhum produto aéreo.
	 */
	private static final Aereo analisaSePossuiAereos(Solicitacao solicitacao) 
												throws NullPointerException {
		Aereos aereos = Preconditions.checkNotNull(solicitacao.getAereos(), 
						"Solicitação não possui produtos aéreos");
		return aereos.getAereo().get(0);
	}
	
	
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return String.format("Passageiro: %s, Cia. Aérea: %s, Data saída: %s, Data chegada: %s, Cidade origem: %s, Cidade destino: %s",
								getNomePassageiro(), getCiaAerea(), sdf.format(getDataSaida()), 
								sdf.format(getDataChegada()), getCidadeOrigem(), getCidadeDestino());
	}	

	@Override
	public final int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciaAerea == null) ? 0 : ciaAerea.hashCode());
		result = prime * result + ((cidadeDestino == null) ? 0 : cidadeDestino.hashCode());
		result = prime * result + ((cidadeOrigem == null) ? 0 : cidadeOrigem.hashCode());
		result = prime * result + ((nomePassageiro == null) ? 0 : nomePassageiro.hashCode());
		result = prime * result + ((timestampChegada == null) ? 0 : timestampChegada.hashCode());
		result = prime * result + ((timestampSaida == null) ? 0 : timestampSaida.hashCode());
		return result;
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof InfoViagemAereo))
			return false;
		InfoViagemAereo other = (InfoViagemAereo) obj;
		if (ciaAerea == null) {
			if (other.ciaAerea != null)
				return false;
		} else if (!ciaAerea.equals(other.ciaAerea))
			return false;
		if (cidadeDestino == null) {
			if (other.cidadeDestino != null)
				return false;
		} else if (!cidadeDestino.equals(other.cidadeDestino))
			return false;
		if (cidadeOrigem == null) {
			if (other.cidadeOrigem != null)
				return false;
		} else if (!cidadeOrigem.equals(other.cidadeOrigem))
			return false;
		if (nomePassageiro == null) {
			if (other.nomePassageiro != null)
				return false;
		} else if (!nomePassageiro.equals(other.nomePassageiro))
			return false;
		if (timestampChegada == null) {
			if (other.timestampChegada != null)
				return false;
		} else if (!timestampChegada.equals(other.timestampChegada))
			return false;
		if (timestampSaida == null) {
			if (other.timestampSaida != null)
				return false;
		} else if (!timestampSaida.equals(other.timestampSaida))
			return false;
		return true;
	}	
}