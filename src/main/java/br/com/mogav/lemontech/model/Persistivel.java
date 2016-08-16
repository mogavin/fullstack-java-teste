package br.com.mogav.lemontech.model;

/**
 * Atribui um id à classe para que seja persistivel.
 *
 */
public abstract class Persistivel {

	protected Long id;
	
	Persistivel(){
		this(null);
	}
	
	
	Persistivel(Long id){
		this.id = id;
	}
	
	public Long getId(){
		return this.id;
	}
}