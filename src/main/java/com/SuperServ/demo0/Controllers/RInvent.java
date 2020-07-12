package com.SuperServ.demo0.Controllers;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SuperServ.demo0.Database.IInventDataAccess;
import com.SuperServ.demo0.Models.CRinvent;
import com.SuperServ.demo0.Models.Cinvent;


@RestController
@RequestMapping("rest/invent")
public class RInvent {
    @Autowired
    private IInventDataAccess InventDataAccess;


    @GetMapping("getInvents")
public List<Cinvent> getInvents() throws SQLException, ClassNotFoundException {
    	
return InventDataAccess.findAll();
    }
    
    @GetMapping("/getNbr")
    public int getNbr() throws SQLException, ClassNotFoundException {

        return InventDataAccess.getNbr();
    }
    
 //test

    @PostMapping("/setInvent")
    public void setInvent(@RequestBody Cinvent cinvent){
    	cinvent.setDate_(new Date());
        this.InventDataAccess.save(cinvent);
}    
    
    
    
    
    
}
