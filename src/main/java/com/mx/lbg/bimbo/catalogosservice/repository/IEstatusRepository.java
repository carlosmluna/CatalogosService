package com.mx.lbg.bimbo.catalogosservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.lbg.bimbo.catalogosservice.model.EstatusEntity;


@Repository
public interface IEstatusRepository extends JpaRepository<EstatusEntity, Integer> {
	List<EstatusEntity> findAll();
}
