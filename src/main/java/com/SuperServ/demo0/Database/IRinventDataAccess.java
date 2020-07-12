package com.SuperServ.demo0.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SuperServ.demo0.Models.CRinvent;


	@Repository
	public interface IRinventDataAccess extends JpaRepository<CRinvent,Integer>{
	@Query (value = "SELECT count(*) FROM rinvent u ", nativeQuery = true)
		int getNbr();
	
	 @Query(
				value = "SELECT u.* FROM rinvent u WHERE u.idinvent=?1", 
				nativeQuery = true)
		      List<CRinvent> getRInventsByInvent(int vidinvent);

	 @Query(
				value = "SELECT count(*) FROM rinvent u WHERE u.idinvent=?1", 
				nativeQuery = true)
		      int getNbrRInventsByInvent(int vidinvent);

	 @Query(
				value = "SELECT ifnull (max(u.idrinvent),0) FROM rinvent u ",
				nativeQuery = true)
		      int getNewId();

}
