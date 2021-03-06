package br.com.mogav.lemontech.model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Atribui um id à classe para que seja persistivel.
 *
 */
@MappedSuperclass
public abstract class Persistivel {

	@Id
	protected Long id;
	
	/**
	 * @deprecated JPA eyes only
	 */
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