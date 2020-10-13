package com.mx.lbg.bimbo.catalogosservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat_estatus")
public class EstatusEntity {
	// Declaro los atributos de la clase
	@Id
	private Integer id;
	private String  estatus;	
	
	
	// Metodos Contructores de la clase
	public EstatusEntity() { }
	
	public EstatusEntity(Integer id, String estatus) {
		this.id = id;
		this.estatus = estatus;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
}
