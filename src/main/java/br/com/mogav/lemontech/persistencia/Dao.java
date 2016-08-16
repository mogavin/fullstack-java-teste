package br.com.mogav.lemontech.persistencia;

import java.util.Collection;

import br.com.mogav.lemontech.model.Persistivel;

interface Dao<T extends Persistivel> {
	T salvar(T t);
	T buscarPorId(Long id);
	Collection<T> listarTodos();
	boolean apagarTodos();
}