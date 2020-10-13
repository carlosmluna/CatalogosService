package com.mx.lbg.bimbo.catalogosservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat_regiones")
public class RegionEntity {
	// Declaro los atributos de la clase
	@Id
	private Integer id;
	private String  region;
	
	
	public RegionEntity() {	}
	
	public RegionEntity(Integer id, String region) {
		this.id = id;
		this.region = region;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
}
