package com.mx.lbg.bimbo.catalogosservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat_bodegas")
public class BodegaEntity {
	// Declaro los atributos de la clase
	@Id
	private Integer id;
	private String  bodega;	
	
	
	public BodegaEntity() { }
	
	public BodegaEntity(Integer id, String bodega) {
		this.id = id;
		this.bodega = bodega;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBodega() {
		return bodega;
	}
	public void setBodega(String bodega) {
		this.bodega = bodega;
	}
}
