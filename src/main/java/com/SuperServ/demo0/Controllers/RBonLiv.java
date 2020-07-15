package com.SuperServ.demo0.Controllers;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SuperServ.demo0.Database.IBonLivDataAccess;
import com.SuperServ.demo0.Database.IFourDataAccess;
import com.SuperServ.demo0.Models.CBonLiv;
import com.SuperServ.demo0.Models.Carticle;
import com.SuperServ.demo0.Models.CbarCode;
import com.SuperServ.demo0.Models.Cfour;



@RestController
@RequestMapping("rest/BonLiv")
public class RBonLiv {
    @Autowired
    private IBonLivDataAccess BonLivDataAccess;
    @Autowired
    private IFourDataAccess fourDataAccess;	

    @GetMapping("/getBonLivs")
public List<CBonLiv> getBonLivs() throws SQLException, ClassNotFoundException {
    	
return BonLivDataAccess.findAll();
    }
    
    @GetMapping("/getNbr")
    public int getNbr() throws SQLException, ClassNotFoundException {

        return BonLivDataAccess.getNbr();
    }
    
    // @GetMapping("/getFour/{id}")
    //public Optional<Cfour>  getFour(@PathVariable int id) throws ClassNotFoundException, SQLException{
    //	CBonLiv obonLiv=BonLivDataAccess.findById(id).orElse(null);
    //	int vidfour=obonLiv.getIdfour();
    //	return fourDataAccess.findById(vidfour)
   // }
    
 //test

    @PostMapping("/setBonLiv")
    public void setInvent(@RequestBody CBonLiv cbonliv){
    	cbonliv.setDate_(new Date());
        this.BonLivDataAccess.save(cbonliv);
}    
    
    
    
    
    
}
