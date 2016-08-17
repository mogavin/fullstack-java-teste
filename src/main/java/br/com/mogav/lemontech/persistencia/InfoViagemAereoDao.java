package br.com.mogav.lemontech.persistencia;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import javax.enterprise.context.RequestScoped;

import com.google.common.collect.Maps;

import br.com.mogav.lemontech.model.InfoViagemAereo;

@RequestScoped
public class InfoViagemAereoDao implements Dao<InfoViagemAereo>{

	private static Long CHAVE_DISPONIVEL = 1L;
	private static final Map<Long, InfoViagemAereo> TABELA = Maps.newHashMap();
	
	@Override
	public InfoViagemAereo salvarEAtualizar(InfoViagemAereo infoViagem) {
		Long chave = (infoViagem.getId() == null) ? CHAVE_DISPONIVEL : infoViagem.getId();
		
		InfoViagemAereo aSalvar = 
				new InfoViagemAereo(chave, infoViagem.getNomePassageiro(), infoViagem.getCiaAerea(),
						infoViagem.getDataSaida().getTime(), infoViagem.getDataChegada().getTime(),
						infoViagem.getCidadeOrigem(), infoViagem.getCidadeDestino());
		TABELA.put(aSalvar.getId(), aSalvar);
		CHAVE_DISPONIVEL++;
		
		return aSalvar;
	}
	
	@Override
	public InfoViagemAereo buscarPorId(Long id) {
		return TABELA.get(id);
	}

	@Override
	public Collection<InfoViagemAereo> listarTodos() {
		return Collections.unmodifiableCollection(TABELA.values());
	}

	@Override
	public boolean apagarTodos() {
		TABELA.clear(); return true;
	}

	public boolean salvarEAtualizarTodos(Collection<InfoViagemAereo> infosViagens) {
		for(InfoViagemAereo infoViagem : infosViagens)
			this.salvarEAtualizar(infoViagem);		
		return true;
	}
}