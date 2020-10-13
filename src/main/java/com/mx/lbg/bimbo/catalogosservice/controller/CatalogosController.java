package com.mx.lbg.bimbo.catalogosservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.lbg.bimbo.catalogosservice.model.AccionEntity;
import com.mx.lbg.bimbo.catalogosservice.model.BodegaEntity;
import com.mx.lbg.bimbo.catalogosservice.model.EstatusEntity;
import com.mx.lbg.bimbo.catalogosservice.model.LocalidadEntity;
import com.mx.lbg.bimbo.catalogosservice.model.RazonSocialUsuarioEntity;
import com.mx.lbg.bimbo.catalogosservice.model.RegionEntity;
import com.mx.lbg.bimbo.catalogosservice.service.ICatalogoService;

@RestController
@RequestMapping("/catalogo")
public class CatalogosController {

	@Autowired
	ICatalogoService iCatalogoService;
	
	
	// ****************************************************************************
	// ***************************** Consulta General *****************************
	// ****************************************************************************
	@GetMapping("/catestatus-consultar")
    public ResponseEntity<List<EstatusEntity>> consultarEstatus() {
        List<EstatusEntity> estatusEntity = iCatalogoService.consultaCatEstatus();
        return new ResponseEntity(estatusEntity, HttpStatus.OK);
    }
	
	@GetMapping("/catlocalidades-consultar")
    public ResponseEntity<List<LocalidadEntity>> consultarLocalidades( ) {		
		List<LocalidadEntity> localidadesEntity = iCatalogoService.consultaCatLocalidades();
        return new ResponseEntity(localidadesEntity, HttpStatus.OK);
    }
	
	@GetMapping("/catbodegas-consultar")
    public ResponseEntity<List<BodegaEntity>> consultarBodegas( ) {		
		List<BodegaEntity> bodegasEntity = iCatalogoService.cosultaBodegas();
        return new ResponseEntity(bodegasEntity, HttpStatus.OK);
    }
	
	@GetMapping("/catAcciones-consultar")
    public ResponseEntity<List<AccionEntity>> consultarAcciones( ) {		
		List<AccionEntity> accionesEntity = iCatalogoService.consultaAcciones();
        return new ResponseEntity(accionesEntity, HttpStatus.OK);
    }
	
	@GetMapping("/catRegiones-consultar")
    public ResponseEntity<List<RegionEntity>> consultarRegiones( ) {		
		List<RegionEntity> accionesEntity = iCatalogoService.consultaRegiones();
        return new ResponseEntity(accionesEntity, HttpStatus.OK);
    }
	
	@GetMapping("/catRazonsocilUsuario-consultar")
    public ResponseEntity<List<RazonSocialUsuarioEntity>> consultarRazonSocial( ) {		
		List<RazonSocialUsuarioEntity> razonSociaeslUserEntity = iCatalogoService.cosultaRazonSocialUser();
        return new ResponseEntity(razonSociaeslUserEntity, HttpStatus.OK);
    }
	
	// ***************************************************************************
	// ***************************** Consulta Por ID *****************************
	// ***************************************************************************
	@GetMapping("/catestatus-consultar-porid/{idEstatus}")
    public ResponseEntity<EstatusEntity> consultarRegistroEstatus( @PathVariable("idEstatus") String idEstatus ) {
        EstatusEntity estatusEntity = iCatalogoService.consultaRegistroCatEstatus( Integer.valueOf(idEstatus) );
        return new ResponseEntity(estatusEntity, HttpStatus.OK);
    }
	
	@GetMapping("/catlocalidades-consultar-porid/{idLoclidad}")
    public ResponseEntity<List<LocalidadEntity>> consultarRegistroLocalidades( @PathVariable("idLoclidad") String idLoclidad ) {		
		LocalidadEntity localidadesEntity = iCatalogoService.consultaRegistroCatLocalidades( Integer.valueOf(idLoclidad) );
        return new ResponseEntity(localidadesEntity, HttpStatus.OK);
    }
	
	@GetMapping("/catbodegas-consultar-porid/{idBodega}")
    public ResponseEntity<List<BodegaEntity>> consultarRegistroBodegas( @PathVariable("idBodega") String idBodega ) {		
		BodegaEntity bodegasEntity = iCatalogoService.cosultaRegistroCatBodegas( Integer.valueOf(idBodega) );
        return new ResponseEntity(bodegasEntity, HttpStatus.OK);
    }
	
	@GetMapping("/catAcciones-consultar-porid/{idAccion}")
    public ResponseEntity<List<AccionEntity>> consultarRegistroAcciones( @PathVariable("idAccion") String idAccion ) {		
		AccionEntity accionesEntity = iCatalogoService.consultaRegistroCatAcciones( Integer.valueOf(idAccion) );
        return new ResponseEntity(accionesEntity, HttpStatus.OK);
    }
	
	@GetMapping("/catRegiones-consultar-porid/{idRegion}")
    public ResponseEntity<List<RegionEntity>> consultarRegistroRegiones( @PathVariable("idRegion") String idRegion ) {		
		RegionEntity accionesEntity = iCatalogoService.consultaRegistroRegiones( Integer.valueOf(idRegion) );
        return new ResponseEntity(accionesEntity, HttpStatus.OK);
    }
	
	@GetMapping("/catRazonsocilUsuario-consultar-porid/{idRazon}")
    public ResponseEntity<List<RazonSocialUsuarioEntity>> consultarRegistroRazonSocial( @PathVariable("idRazon") String idRazon ) {		
		RazonSocialUsuarioEntity razonSociaeslUserEntity = iCatalogoService.cosultaRegCatRazonSocialUser( Integer.valueOf( idRazon) );
        return new ResponseEntity(razonSociaeslUserEntity, HttpStatus.OK);
    }
	
	// ****************************************************************************
	// ****************************** Actualizacion *******************************
	// ****************************************************************************
	/* @PostMapping("/catlocalidades-actualizar")
    public ResponseEntity<List<LocalidadEntity>> actualizaLocalidad( @RequestBody LocalidadEntity localidad ) {		
		RazonSocialUsuarioEntity razonSociaeslUserEntity = iCatalogoService.cosultaRegCatRazonSocialUser( Integer.valueOf( idRazon) );
        return new ResponseEntity(razonSociaeslUserEntity, HttpStatus.OK);
    } */
	
}
