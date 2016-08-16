package br.com.mogav.lemontech.persistencia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.mogav.lemontech.model.InfoViagemAereo;

import com.google.common.collect.ImmutableList;

public class TesteInfoViagemAereoDao {
 
	private List<InfoViagemAereo> infosViagens;
	private InfoViagemAereoDao dao;
	
	@Before
	public void setup(){
		this.infosViagens = ImmutableList.of(
			new InfoViagemAereo("Daniella Thiemi Suzuki", "GOL_V2", 40L, 50L, "SAO PAULO", "VITORIA"),
			new InfoViagemAereo("Roger Fontella", "SABRE", 60L, 70L, "PORTO ALEGRE", "SAO PAULO")
		);
		this.dao = new InfoViagemAereoDao();
	}
	
	
	@Test
	public void recuperarPorId(){		
		InfoViagemAereo salvo = dao.salvar(infosViagens.get(0));
		InfoViagemAereo recuperado = dao.buscarPorId(salvo.getId());
		assertNotNull(recuperado);
	}
	
	@Test
	public void listarTodos(){
		dao.salvar(infosViagens.get(0));
		dao.salvar(infosViagens.get(1));
		
		CollectionUtils.isEqualCollection(infosViagens, dao.listarTodos());
	}
	
	@Test
	public void editar(){
		InfoViagemAereo salvo = dao.salvar(infosViagens.get(0));
		InfoViagemAereo recuperado = dao.buscarPorId(salvo.getId());
		
		InfoViagemAereo atualizado = new InfoViagemAereo(recuperado.getId(), recuperado.getNomePassageiro(), "AVIANCA",
										recuperado.getDataSaida().getTime(), recuperado.getDataChegada().getTime(),
										recuperado.getCidadeOrigem(), recuperado.getCidadeDestino());
		dao.salvar(atualizado);
		
		assertEquals(atualizado, dao.buscarPorId(atualizado.getId()));
	}
	
	
	@After
	public void clean(){
		this.dao.apagarTodos();
	}
}