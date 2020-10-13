package com.mx.lbg.bimbo.catalogosservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.mx.lbg.bimbo.catalogosservice.exception.CustomException;
import com.mx.lbg.bimbo.catalogosservice.model.*;
import com.mx.lbg.bimbo.catalogosservice.repository.*;


@Service
@Transactional
public class CatalogoServiceImpl implements ICatalogoService {

	@Autowired
	IEstatusRepository   estatusRepository;
	@Autowired
	ILocalidadRepository localidadRepository;
	@Autowired
	IBodegaRepository    bodegaRepository;
	@Autowired
	IAccionRepository    accionRepository;
	@Autowired
	IRegionRepository    regionRepository;
	@Autowired
	IRazonSocialUsuarioRepository rasonSocialRepository;
	
		
	@Override
	public List<EstatusEntity> consultaCatEstatus() {
		try {
			List<EstatusEntity> estatusList = estatusRepository.findAll();
			return estatusList;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-estatus");
		}
	}

	@Override
	public List<LocalidadEntity> consultaCatLocalidades() {
		try {
			List<LocalidadEntity> localidadList = localidadRepository.findAll();
			return localidadList;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-localidades");
		}
	}

	@Override
	public List<BodegaEntity> cosultaBodegas() {
		try {
			List<BodegaEntity> bodegaList = bodegaRepository.findAll();
			return bodegaList;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-bodegas");
		}
	}
	
	@Override
	public List<AccionEntity> consultaAcciones() {
		try {
			List<AccionEntity> accionList = accionRepository.findAll();
			return accionList;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-acciones");
		}
	}

	@Override
	public List<RazonSocialUsuarioEntity> cosultaRazonSocialUser() {
		try {
			List<RazonSocialUsuarioEntity> razonSocUserList = rasonSocialRepository.findAll();
			return razonSocUserList;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-razonsocial-usuario");
		}
	}

	@Override
	public EstatusEntity consultaRegistroCatEstatus( Integer cveEstatus ) {
		try {
			EstatusEntity estatus = new EstatusEntity();
			
			Optional<EstatusEntity> estatusEntity = estatusRepository.findById( cveEstatus );
			estatus.setId( estatusEntity.get().getId() );
			estatus.setEstatus( estatusEntity.get().getEstatus() );
			
			return estatus;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-estatus");
		}
	}

	@Override
	public LocalidadEntity consultaRegistroCatLocalidades( Integer idLocalidad ) {
		try {
			LocalidadEntity localidad = new LocalidadEntity();
			
			Optional<LocalidadEntity> localidadEntity = localidadRepository.findById(idLocalidad);
			localidad.setId( localidadEntity.get().getId() );
			localidad.setLocalidad( localidadEntity.get().getLocalidad() );
			
			return localidad;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-localidades");
		}
	}

	@Override
	public BodegaEntity cosultaRegistroCatBodegas( Integer idBodega ) {
		try {
			BodegaEntity bodega = new BodegaEntity();
			
			Optional<BodegaEntity> bodegaEntity = bodegaRepository.findById( idBodega );
			bodega.setId( bodegaEntity.get().getId() );
			bodega.setBodega( bodegaEntity.get().getBodega() );
			return bodega;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-bodegas");
		}
	}

	@Override
	public AccionEntity consultaRegistroCatAcciones( Integer idAccion ) {
		try {
			AccionEntity accion = new AccionEntity();
			
			Optional<AccionEntity> bodegaEntity = accionRepository.findById( idAccion );
			accion.setId( bodegaEntity.get().getId() );
			accion.setAccion( bodegaEntity.get().getAccion() );
			return accion;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-bodegas");
		}
	}

	@Override
	public RazonSocialUsuarioEntity cosultaRegCatRazonSocialUser( Integer idRazon ) {		
		try {
			RazonSocialUsuarioEntity razonSocial = new RazonSocialUsuarioEntity();
			
			Optional<RazonSocialUsuarioEntity> razonSocialEntity = rasonSocialRepository.findById( idRazon );
			razonSocial.setId( razonSocialEntity.get().getId() );
			razonSocial.setRazon( razonSocialEntity.get().getRazon() );
			return razonSocial;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-bodegas");
		}
	}

	@Override
	public List<RegionEntity> consultaRegiones() {
		try {
			List<RegionEntity> regionList = regionRepository.findAll();
			return regionList;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-acciones");
		}
	}

	@Override
	public RegionEntity consultaRegistroRegiones(Integer idRegion) {
		try {
			RegionEntity region = new RegionEntity();
			
			Optional<RegionEntity> regionEntity = regionRepository.findById( idRegion );
			region.setId( regionEntity.get().getId() );
			region.setRegion( regionEntity.get().getRegion() );
			return region;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-bodegas");
		}
	}

	@Override
	public LocalidadEntity actualizarLocalidad(LocalidadEntity localidad) {
		try {			
			LocalidadEntity localidadEntity = localidadRepository.save(localidad);
			return localidadEntity;
		} catch(CustomException e) {
			throw e;
		} catch (RuntimeException re) {
			throw new CustomException(re.getMessage(), HttpStatus.ACCEPTED, "error-upd-localidad");
		}
	}	
}
