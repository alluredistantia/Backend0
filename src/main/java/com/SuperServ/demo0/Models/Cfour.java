package com.SuperServ.demo0.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tfour")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Cfour {
    @Id
    @Column(name="idfour",nullable = false, unique = true)
    private int idfour;
    @Column(name="desfour",nullable = true)
    private String desfour;
    @Column(name="tel",nullable = true)
    private String tel;
    
    
	public Cfour() {
		//super();
	}
	public int getIdfour() {
		return idfour;
	}
	public void setIdfour(int idfour) {
		this.idfour = idfour;
	}
	public String getDesfour() {
		return desfour;
	}
	public void setDesfour(String desfour) {
		this.desfour = desfour;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
   


 //   @JsonIgnore 
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idarticle")
//    private List<CbarCode> barCodes ;

//	public List<CbarCode> getBarCodes() {
//		return barCodes;
//	}
	//public void setBarCodes(List<CbarCode> barCodes) {
//		this.barCodes = barCodes;	}
	

  

}
