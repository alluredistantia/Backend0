package com.SuperServ.demo0.Database;


import com.SuperServ.demo0.Models.Cfour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFourDataAccess extends JpaRepository<Cfour,String>{

    
    @Query (value = "SELECT count(*) FROM tfour u ", nativeQuery = true)
	int getNbr();
    
    @Query (value = "SELECT count(*) FROM tfour u WHERE u.desfour like %?1% ", nativeQuery = true)
	int getNbrLike(String str);
	
    @Query(
			value = "SELECT * FROM tfour u WHERE u.desfour like %?1% ", 
			nativeQuery = true)
	      List<Cfour> getfourLike(String str);	
   
}    



