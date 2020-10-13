package com.mx.lbg.bimbo.catalogosservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat_acciones")
public class AccionEntity {
	// Declaro los atributos de la clase
	@Id
	private Integer id;
	private String  accion;		
	
	
	public AccionEntity() { }
	
	public AccionEntity(Integer id, String accion) {
		this.id = id;
		this.accion = accion;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccion() {
		return accion;
	}
	public void setAccion(String accion) {
		this.accion = accion;
	}
}
