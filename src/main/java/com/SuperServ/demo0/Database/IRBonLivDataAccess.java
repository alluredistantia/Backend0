package com.SuperServ.demo0.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.SuperServ.demo0.Models.CRbonLiv;



	@Repository
	public interface IRBonLivDataAccess extends JpaRepository<CRbonLiv,Integer>{
	@Query (value = "SELECT count(*) FROM rbonliv u ", nativeQuery = true)
		int getNbr();
	
	 @Query(
				value = "SELECT u.* FROM rbonliv u WHERE u.idbonliv=?1", 
				nativeQuery = true)
		      List<CRbonLiv> getRBonLivsByBonLiv(int vidbonliv);
	 @Query(
				value = "SELECT u.* FROM rbonliv u WHERE u.idbarcode=?1", 
				nativeQuery = true)
		      List<CRbonLiv> getRBonLivsByBarCode(int vidbarcode);

	 @Query(
				value = "SELECT count(*) FROM rbonliv u WHERE u.idbonliv=?1", 
				nativeQuery = true)
		      int getNbrRBonLivsByBonLiv(int vidinvent);

	 @Query(
				value = "SELECT ifnull (max(u.idrbonliv),0) FROM rbonliv u ",
				nativeQuery = true)
		      int getNewId();
	 @Query(
				value = "delete  FROM rbonliv u where u.idbonliv=?1 ",
				nativeQuery = true)
		        void deleteByBonLiv(int vidbonliv);

}
