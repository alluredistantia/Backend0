package com.SuperServ.demo0.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tarticle")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Carticle {
    @Id
    @Column(name="idarticle",nullable = false, unique = true)
    private String idarticle;
    @Column(name="desarticle",nullable = true)
    private String desarticle;
    @Column(name="prixvente",nullable = true)
    private Double prixvente;
    @Column(name="lastprixachat",nullable = true)
    private Double lastprixachat;
    @Column(name="lastqteachat",nullable = true)
    private Double lastqteachat;
    @Column(name="qtestock",nullable = true)
    private Double qtestock;
    @Column(name="uart",nullable = true)
    private String uart;


 //   @JsonIgnore 
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idarticle")
//    private List<CbarCode> barCodes ;

//	public List<CbarCode> getBarCodes() {
//		return barCodes;
//	}
	//public void setBarCodes(List<CbarCode> barCodes) {
//		this.barCodes = barCodes;	}
	public Carticle() {
    }
    public String getIdarticle() {
		return idarticle;
	}
	public void setIdarticle(String idarticle) {
		this.idarticle = idarticle;
	}
	public String getDesarticle() {
		return desarticle;
	}
	public void setDesarticle(String desarticle) {
		this.desarticle = desarticle;
	}
	public Double getPrixvente() {
		return prixvente;
	}
	public void setPrixvente(Double prixvente) {
		this.prixvente = prixvente;
	}
	public Double getLastprixachat() {
		return lastprixachat;
	}
	public void setLastprixachat(Double lastprixachat) {
		this.lastprixachat = lastprixachat;
	}
	public Double getLastqteachat() {
		return lastqteachat;
	}
	public void setLastqteachat(Double lastqteachat) {
		this.lastqteachat = lastqteachat;
	}
	public Double getQtestock() {
		return qtestock;
	}
	public void setQtestock(Double qtestock) {
		this.qtestock = qtestock;
	}
	public String getUart() {
		return uart;
	}

	public void setUart(String uart) {
		this.uart = uart;
	}

  

}
