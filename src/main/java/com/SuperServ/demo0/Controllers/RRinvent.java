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

import com.SuperServ.demo0.Database.IRinventDataAccess;
import com.SuperServ.demo0.Models.Carticle;
import com.SuperServ.demo0.Models.Cinvent;
import com.SuperServ.demo0.Models.CRinvent;


@RestController
@RequestMapping("rest/rinvent")
public class RRinvent {
    @Autowired
    private IRinventDataAccess RinventDataAccess;


    @GetMapping("getRinvents")
public List<CRinvent> getRinvents() throws SQLException, ClassNotFoundException {
    	
return RinventDataAccess.findAll();
    }
    
    @GetMapping("/getNbr")
    public int getNbr() throws SQLException, ClassNotFoundException {

        return RinventDataAccess.getNbr();
    }
    
    @GetMapping("/getNbrRInventsByInvent/{vidinvent}")
    public int getNbrRInventsByInvent(@PathVariable int vidinvent) {

        return RinventDataAccess.getNbrRInventsByInvent(vidinvent);
    }

    @GetMapping("/getRInventsByInvent/{Invent}")
    public List<CRinvent> getRInventsByInvent(@PathVariable int Invent){
    	return  RinventDataAccess.getRInventsByInvent(Invent);
    }       
    
    @GetMapping("/getNewId")
    public int getNewId() throws SQLException, ClassNotFoundException {
    	
        return RinventDataAccess.getNewId()+1; 
    }
    
    
    @PostMapping("/setRInvent")
    public void setRinvent(@RequestBody CRinvent cRinvent){

        this.RinventDataAccess.save(cRinvent);
}    
    
    
    
    
    
    
    
}
