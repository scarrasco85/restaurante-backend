/**
 * 
 */
package com.sergio.restaurantebackend.entity;

import java.time.LocalDateTime;

/**
 * @author Sergio Carrasco García
 * Clase que contiene campos que se reutilizan en todas las clases que mapean a las tablas.
 * Esta clase será superpadre de todas las demás que representan a las entidades.
 */
public class CommonEntity {

	/**
	 * Fecha de creación del tipo de restaurante
	 */
	private LocalDateTime fechaCreacion;
	
	/**
	 * Fecha de modificación del tipo de restaurante
	 */
	private LocalDateTime fechaModificacion;
	
	/**
	 * Estado habilitado o deshabilitado.
	 */
	private boolean estatus;

	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the fechaModificacion
	 */
	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
}
