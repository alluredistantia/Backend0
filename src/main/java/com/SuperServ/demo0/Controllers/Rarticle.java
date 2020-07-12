package com.SuperServ.demo0.Controllers;

import com.SuperServ.demo0.Database.IArticleDataAccess;
import com.SuperServ.demo0.Models.Carticle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.reactive.PathRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("rest/Article")
public class Rarticle {
    @Autowired
    private IArticleDataAccess articleDataAccess;

    @GetMapping("getArticlesByPage/{page}/{size}")
public Page<Carticle> getArticlesByPage(@PathVariable int page,@PathVariable int size) throws SQLException, ClassNotFoundException {
    	Page<Carticle> affiche=articleDataAccess.findAll(PageRequest.of(page, size));
return affiche;
    }
    
    @GetMapping("getArticlesSort/{page}/{size}")
public Page<Carticle> getArticlesSort(@PathVariable int page,@PathVariable int size) throws SQLException, ClassNotFoundException {
    	Page<Carticle> affiche=articleDataAccess.findAll(PageRequest.of(page, size, Sort.by(Direction.ASC,"desarticle")));
return affiche;
    }    
    
    
    
    
    @GetMapping("getArticles")
public List<Carticle> getArticles() throws SQLException, ClassNotFoundException {
    	List<Carticle> affiche=articleDataAccess.findAll();
return affiche;
    }

    @GetMapping("getArticleMax")
    public float getArticleMax() throws SQLException, ClassNotFoundException {

        return articleDataAccess.findArtMax();
    }

    @GetMapping("/getNbr")
    public int getNbr() throws SQLException, ClassNotFoundException {

        return articleDataAccess.getNbr();
    }
    
    @GetMapping("/getNbrLike/{id}")
    public int getNbrLike(@PathVariable String id) throws SQLException, ClassNotFoundException {

        return articleDataAccess.getNbrLike(id);
    }
    
    
    @GetMapping("/getArticleById/{id}")
    public Optional<Carticle> getArticleById(@PathVariable String id){
        return articleDataAccess.findById(id);
    }

    @GetMapping("/getArticlesLike/{id}")
    public List<Carticle> getArticlesLike(@PathVariable String id){
    	return  articleDataAccess.getArticlesLike(id);
    }
  
    
    @PostMapping("/setArticle")
    public void setArticle(@RequestBody Carticle carticle){

        this.articleDataAccess.save(carticle);
}
    @PostMapping("/delArticle")
    public void delArticle(@RequestBody Carticle carticle){

        this.articleDataAccess.delete(carticle);
}
  
    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
  
    @GetMapping("getMaxIdArticle")
    public Integer getMaxIdArticle() throws SQLException, ClassNotFoundException {
     	 Integer max=0;
     	List<Carticle> aList=articleDataAccess.findAll();
      	 for(int i=0; i<aList.size(); i++) {
               if (isInteger(aList.get(i).getIdarticle()) && Integer.parseInt(aList.get(i).getIdarticle())>max)
               {max=Integer.parseInt(aList.get(i).getIdarticle());}
      	 }
      		
  		 return max; 
      }
    
    
    
    
}
