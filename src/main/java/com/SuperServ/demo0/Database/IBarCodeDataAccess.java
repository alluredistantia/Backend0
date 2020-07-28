package com.SuperServ.demo0.Database;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.SuperServ.demo0.Models.CbarCode;

@Repository
public interface IBarCodeDataAccess extends JpaRepository<CbarCode,String>{
	
    @Query (value = "SELECT count(*) FROM tbarcode u ", nativeQuery = true)
	int getNbr();

}


	


