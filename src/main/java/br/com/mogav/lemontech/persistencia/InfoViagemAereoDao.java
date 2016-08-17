package br.com.mogav.lemontech.persistencia;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.mogav.lemontech.model.InfoViagemAereo;

@RequestScoped
public class InfoViagemAereoDao extends JPADao<InfoViagemAereo>{
	
	/**
     * @deprecated CDI eyes only
     */
	InfoViagemAereoDao() {
		this(null);
	}
	
	@Inject
	public InfoViagemAereoDao(EntityManager em){
		super(em, InfoViagemAereo.class);
	}

	public boolean salvarEAtualizarTodos(Collection<InfoViagemAereo> infosViagens) {
		for(InfoViagemAereo infoViagem : infosViagens)
			this.salvarOuAtualizar(infoViagem);		
		return true;
	}
}