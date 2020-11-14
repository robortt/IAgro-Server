package com.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;
import javax.persistence.GeneratedValue;

/**
 * Entity implementation class for Entity: Actividad
 *
 */
@Entity
@Table(name="casillas")

public class Casilla implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private long id_casilla;
	
	@ManyToMany
	private List<Formulario> formulario;
	
	private String parámetro; 
	
	private String uni_medida;
	
	private String descripción; 
	
	
	
	//● tipo de valor (*): variable según el tipo de dato como entero, string, double,
	//boolean.
	

	public Casilla() {
		super();
	}
	
	public long getId_casilla() {
		return id_casilla;
	}



	public void setId_casilla(long id_casilla) {
		this.id_casilla = id_casilla;
	}



	public String getParámetro() {
		return parámetro;
	}

	public void setParámetro(String parámetro) {
		this.parámetro = parámetro;
	}

	public String getUni_medida() {
		return uni_medida;
	}

	public void setUni_medida(String uni_medida) {
		this.uni_medida = uni_medida;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}
	
   
}
