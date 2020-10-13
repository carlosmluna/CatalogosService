package com.mx.lbg.bimbo.catalogosservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.lbg.bimbo.catalogosservice.model.LocalidadEntity;


@Repository
public interface ILocalidadRepository extends JpaRepository<LocalidadEntity, Integer> {
	List<LocalidadEntity> findAll();
}
