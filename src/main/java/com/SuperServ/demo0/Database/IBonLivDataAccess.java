package com.SuperServ.demo0.Database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SuperServ.demo0.Models.CBonLiv;




	@Repository
	public interface IBonLivDataAccess extends JpaRepository<CBonLiv,Integer>{
	@Query (value = "SELECT count(*) FROM tbonliv u ", nativeQuery = true)
		int getNbr();

   
    

}
