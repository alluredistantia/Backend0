package com.SuperServ.demo0.Database;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SuperServ.demo0.Models.CReqRecette;

@Repository
public interface IReqRecetteDataAccess extends JpaRepository<CReqRecette,Date>{
@Query (value = "SELECT count(*) FROM reqrecette u ", nativeQuery = true)
	int getNbr();



}