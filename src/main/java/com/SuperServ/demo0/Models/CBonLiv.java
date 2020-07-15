package com.SuperServ.demo0.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "tbonliv")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CBonLiv {
	@Id
    @Column(name="idbonliv",nullable = false, unique = true)
    private Integer idbonliv;
    @Column(name="desbonliv")
    private String desbonliv;
	@Column(name="date_")
    private Date date_;
	@Column(name="idfour")
    private int idfour;
	
	public CBonLiv() {

	}

	

	public Integer getIdbonliv() {
		return idbonliv;
	}
	public void setIdbonliv(Integer idbonliv) {
		this.idbonliv = idbonliv;
	}
	public String getDesbonliv() {
		return desbonliv;
	}
	public void setDesbonliv(String desbonliv) {
		this.desbonliv = desbonliv;
	}
	public Date getDate_() {
		return date_;
	}
	public void setDate_(Date date_) {
		this.date_ = date_;
	}
	public int getIdfour() {
		return idfour;
	}
	public void setIdfour(int idfour) {
		this.idfour = idfour;
	}
	
   
    

}
