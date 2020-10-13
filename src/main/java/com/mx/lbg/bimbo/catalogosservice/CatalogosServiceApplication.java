package com.mx.lbg.bimbo.catalogosservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/* Descripcion: Servicio Rest para el manejo de las tablas de catalogos de la aplicacion
 * F. Creacion: Septiembre 2020
 * Creado Por : Carlos Luna Fernandez  
 */

@SpringBootApplication
//public class CatalogosServiceApplication {
public class CatalogosServiceApplication extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication.run(CatalogosServiceApplication.class, args);
	} 
	
	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources(CatalogosServiceApplication.class);
	}

}
