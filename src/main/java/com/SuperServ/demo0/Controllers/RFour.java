package com.SuperServ.demo0.Controllers;

import com.SuperServ.demo0.Database.IFourDataAccess;
import com.SuperServ.demo0.Models.Cfour;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("rest/Four")
public class RFour {
    @Autowired
    private IFourDataAccess fourDataAccess;


    
    
    
    @GetMapping("getFours")
public List<Cfour> getFours() throws SQLException, ClassNotFoundException {
    	List<Cfour> affiche=fourDataAccess.findAll();
return affiche;
    }


    @GetMapping("/getNbr")
    public int getNbr() throws SQLException, ClassNotFoundException {

        return fourDataAccess.getNbr();
    }
    

    
    
    @GetMapping("/getFourById/{id}")
    public Optional<Cfour> getFourById(@PathVariable Integer id){
        return fourDataAccess.findById(id);
    }

 
  
    
    @PostMapping("/setFour")
    public void setFour(@RequestBody Cfour cfour){

        this.fourDataAccess.save(cfour);
}
    @PostMapping("/delfour")
    public void delfour(@RequestBody Cfour cfour){

        this.fourDataAccess.delete(cfour);
}
  

    
    
    
    
}
