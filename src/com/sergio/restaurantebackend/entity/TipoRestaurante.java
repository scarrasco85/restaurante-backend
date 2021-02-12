/**
 * 
 */
package com.sergio.restaurantebackend.entity;

import java.util.List;

/**
 * @author Sergio Carrasco García
 * Clase que representa una entidad de tipo restaurante en la DB.
 *
 */
public class TipoRestaurante extends CommonEntity{
	
	/**
	 * Identificador del tipo de restaurante
	 */
	private int idTipoRestaurante;
	
	/**
	 * Descripción del tipo de restaurante
	 */
	private String descripcion;
	


	/**
	 * Restaurantes que pertenecen a un tipo de restaurante.
	 */
	private List<Restaurante> restaurantes;

	/**
	 * @return the idTipoRestaurante
	 */
	public int getIdTipoRestaurante() {
		return idTipoRestaurante;
	}

	/**
	 * @param idTipoRestaurante the idTipoRestaurante to set
	 */
	public void setIdTipoRestaurante(int idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * @return the restaurantes
	 */
	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	/**
	 * @param restaurantes the restaurantes to set
	 */
	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

}
