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
import com.SuperServ.demo0.Database.IReqRecetteDataAccess;
import com.SuperServ.demo0.Models.CReqRecette;
import com.SuperServ.demo0.Models.Carticle;
import com.SuperServ.demo0.Models.CbarCode;
@RestController
@RequestMapping("rest/ReqRecette")
public class RReqRecette {
    @Autowired
    private IReqRecetteDataAccess reqRecetteDataAccess;


    @GetMapping("getRecette")
public List<CReqRecette> getArticles() throws SQLException, ClassNotFoundException {
    	
return reqRecetteDataAccess.findAll();
    }
    
    @GetMapping("/getNbr")
    public int getNbr() throws SQLException, ClassNotFoundException {

        return reqRecetteDataAccess.getNbr();
    }
    
    
    
    
    
}


