package com.SuperServ.demo0.Controllers;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SuperServ.demo0.Database.IArticleDataAccess;
import com.SuperServ.demo0.Database.IBarCodeDataAccess;
import com.SuperServ.demo0.Models.Carticle;
import com.SuperServ.demo0.Models.CbarCode;
	
	@RestController
	@RequestMapping("rest/BarCode")
	public class RbarCode {
	    @Autowired
	    private IBarCodeDataAccess barCodeDataAccess;
	    @Autowired
	    private IArticleDataAccess articleDataAccess;	    

	    @GetMapping("/getBarCodeById/{id}")
	    public CbarCode getBarCode(@PathVariable String id) throws SQLException, ClassNotFoundException {
	      	CbarCode obarCode=barCodeDataAccess.findById(id).orElse(null);
	    	return obarCode;	    	  
	    }	
	    
    

	    @GetMapping("/getArticle/{id}")
	    public Optional<Carticle>  getArticle(@PathVariable String id) throws ClassNotFoundException, SQLException{
	    	CbarCode obarCode=barCodeDataAccess.findById(id).orElse(null);
	    	String vidArticle=obarCode.getIdarticle();
	    	return articleDataAccess.findById(vidArticle);  
	    }
	    
	    @GetMapping("/getNbr")
	    public int getNbr() throws SQLException, ClassNotFoundException {

	        return barCodeDataAccess.getNbr();
	    }
	    @GetMapping("/isExist/{id}")
	    public Boolean isExist(@PathVariable String id){
		       return  barCodeDataAccess.existsById(id);
	    
	    }
	    
	    @PostMapping("/setBarCode")
	    public void setBarCode(@RequestBody CbarCode cbarCode){

	        this.barCodeDataAccess.save(cbarCode);
	}
	    @PostMapping("/delBarCode")
	    public void delArticle(@RequestBody CbarCode cbarCode){

	        this.barCodeDataAccess.delete(cbarCode);
	}
	    
	    
	    
	    @GetMapping("getBarCodes")
	    public List<CbarCode> getBarCodes() {
	    	List<CbarCode> obarCodeList=barCodeDataAccess.findAll();
	    	return obarCodeList;	    	  
	    }
	    
   
	    
	}

	


