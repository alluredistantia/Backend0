package com.SuperServ.demo0.Controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.SuperServ.demo0.Database.IRBonLivDataAccess;

import com.SuperServ.demo0.Models.CRbonLiv;



@RestController
@RequestMapping("rest/rBonLiv")
public class RRBonLiv {
    @Autowired
    private IRBonLivDataAccess RbonLivDataAccess;
 

    @GetMapping("getRBonLivs")
   public List<CRbonLiv> getRBonLivs() throws SQLException, ClassNotFoundException {    	
    return RbonLivDataAccess.findAll();
    }
    
    @GetMapping("/getNbr")
    public int getNbr() throws SQLException, ClassNotFoundException {

        return RbonLivDataAccess.getNbr();
    }
    
  
    
    @GetMapping("/getRBonLivsByBarCode/{barcode}")
    public List<CRbonLiv> getRBonLivsByBarCode(@PathVariable int barcode){
    	return  RbonLivDataAccess.getRBonLivsByBarCode(barcode);
    } 
    
    @GetMapping("/getNbrRBonLivsByBonLiv/{vidbonliv}")
    public int getNbrRBonLivsByBonLiv(@PathVariable int vidbonliv) {

        return RbonLivDataAccess.getNbrRBonLivsByBonLiv(vidbonliv);
    }
    

    @GetMapping("/getRBonLivsByBonLiv/{BonLiv}")
    public List<CRbonLiv> getRBonLivsByBonLiv(@PathVariable int BonLiv){
    	return  RbonLivDataAccess.getRBonLivsByBonLiv(BonLiv);
    }       
    
    @GetMapping("/getNewId")
    public int getNewId() throws SQLException, ClassNotFoundException {    	
        return RbonLivDataAccess.getNewId()+1; 
    }
    
    
    @PostMapping("/setRBonLiv")
    public void setRBonLiv(@RequestBody CRbonLiv cRbonliv){

        this.RbonLivDataAccess.save(cRbonliv);
}    
    
    
    
    
    
    
    
}
