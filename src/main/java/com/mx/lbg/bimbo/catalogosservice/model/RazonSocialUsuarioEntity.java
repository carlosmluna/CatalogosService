package com.mx.lbg.bimbo.catalogosservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat_razonsocial_usuario")
public class RazonSocialUsuarioEntity {
	// Declaro los atributos de la clase
	@Id
	private Integer id;
	private String  razon;		
	
	
	public RazonSocialUsuarioEntity() { }
	
	public RazonSocialUsuarioEntity(Integer id, String razon) {
		this.id = id;
		this.razon = razon;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRazon() {
		return razon;
	}
	public void setRazon(String razon) {
		this.razon = razon;
	}
	
}
