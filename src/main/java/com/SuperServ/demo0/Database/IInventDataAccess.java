package com.SuperServ.demo0.Database;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.SuperServ.demo0.Models.Cinvent;



	@Repository
	public interface IInventDataAccess extends JpaRepository<Cinvent,Integer>{
	@Query (value = "SELECT count(*) FROM tinvent u ", nativeQuery = true)
		int getNbr();

   
    

}
