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


    @GetMapping("/getFoursLike/{id}")
    public List<Cfour> getFoursLike(@PathVariable String id){
    	return  fourDataAccess.getfourLike(id);
    }
   
    
    
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

    @GetMapping("/getNbrLike/{id}")
    public int getNbrLike(@PathVariable String id) throws SQLException, ClassNotFoundException {

        return fourDataAccess.getNbrLike(id);
    }
  
    
    @PostMapping("/setFour")
    public void setFour(@RequestBody Cfour cfour){

        this.fourDataAccess.save(cfour);
}
    @PostMapping("/delFour")
    public void delfour(@RequestBody Cfour cfour){

        this.fourDataAccess.delete(cfour);
}
  

    @GetMapping("getMaxIdFour")
    public Integer getMaxIdFour() throws SQLException, ClassNotFoundException {
    	// Integer max=0;
     	//List<Cfour> aList=fourDataAccess.findAll();
      	// for(int i=0; i<aList.size(); i++) {
            //   if (aList.get(i).getIdfour() && aList.get(i).getIdfour()>max)
            //   {max=Integer.parseInt(aList.get(i).getIdfour());}
      	// }
    	  return fourDataAccess.getMaxId();
      } 
    
    
    
}
