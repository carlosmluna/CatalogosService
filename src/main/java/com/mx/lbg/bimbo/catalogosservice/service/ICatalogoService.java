package com.mx.lbg.bimbo.catalogosservice.service;

import java.util.List;

import com.mx.lbg.bimbo.catalogosservice.model.AccionEntity;
import com.mx.lbg.bimbo.catalogosservice.model.BodegaEntity;
import com.mx.lbg.bimbo.catalogosservice.model.EstatusEntity;
import com.mx.lbg.bimbo.catalogosservice.model.LocalidadEntity;
import com.mx.lbg.bimbo.catalogosservice.model.RazonSocialUsuarioEntity;
import com.mx.lbg.bimbo.catalogosservice.model.RegionEntity;

public interface ICatalogoService {	
	List<EstatusEntity>   consultaCatEstatus();						// Consulta los Estatusdel del catalogo de BD
	List<LocalidadEntity> consultaCatLocalidades();					// Consulta los Localidades del catalogo de BD
	List<BodegaEntity>    cosultaBodegas();							// Consulta los Bodegas del catalogo de BD
	List<AccionEntity>    consultaAcciones();						// Consulta los Acciones del catalogo de BD
	List<RegionEntity>    consultaRegiones();						// Consulta los Regiones del catalogo de BD
	List<RazonSocialUsuarioEntity> cosultaRazonSocialUser();		// Consulta los Razon Social Usuarios del catalogo de BD
	
	EstatusEntity   consultaRegistroCatEstatus( Integer cveEstatus );			// Consulta los Estatusdel del catalogo de BD
	LocalidadEntity consultaRegistroCatLocalidades( Integer idLocalidad );		// Consulta los Localidades del catalogo de BD
	BodegaEntity    cosultaRegistroCatBodegas( Integer idBodega );				// Consulta los Bodegas del catalogo de BD
	AccionEntity    consultaRegistroCatAcciones( Integer idAccion );			// Consulta los Acciones del catalogo de BD
	RegionEntity    consultaRegistroRegiones( Integer idRegion );				// Consulta los Region del catalogo de BD
	RazonSocialUsuarioEntity cosultaRegCatRazonSocialUser( Integer idRazon );	// Consulta los Razon Social Usuarios del catalogo de BD
	
	LocalidadEntity actualizarLocalidad( LocalidadEntity localidad );		// Consulta los Localidades del catalogo de BD
}
