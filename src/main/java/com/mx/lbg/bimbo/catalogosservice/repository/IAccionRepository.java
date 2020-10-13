package com.mx.lbg.bimbo.catalogosservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.lbg.bimbo.catalogosservice.model.AccionEntity;


@Repository
public interface IAccionRepository extends JpaRepository<AccionEntity, Integer> {
	List<AccionEntity> findAll();
}
