package com.SuperServ.demo0.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity
	@Table(name = "rbonliv")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CRbonLiv {
	   

		@Id
	    @Column(name="idrbonliv",nullable = false, unique = true)
	    private int idrbonliv;
		@Column(name="idbonliv")
		private Integer idbonliv;
		@Column(name="idbarcode")
	    private String idbarcode;		
	    @Column(name="qtebonliv")
	    private double qtebonliv;
	    @Column(name="prixbonliv")
	    private double prixbonliv;
		
	    public CRbonLiv() {

		}

		public int getIdrbonliv() {
			return idrbonliv;
		}

		public void setIdrbonliv(int idrbonliv) {
			this.idrbonliv = idrbonliv;
		}

		public Integer getIdbonliv() {
			return idbonliv;
		}

		public void setIdbonliv(Integer idbonliv) {
			this.idbonliv = idbonliv;
		}

		public String getIdbarcode() {
			return idbarcode;
		}

		public void setIdbarcode(String idbarcode) {
			this.idbarcode = idbarcode;
		}

		public double getQtebonliv() {
			return qtebonliv;
		}

		public void setQtebonliv(double qtebonliv) {
			this.qtebonliv = qtebonliv;
		}

		public double getPrixbonliv() {
			return prixbonliv;
		}

		public void setPrixbonliv(double prixbonliv) {
			this.prixbonliv = prixbonliv;
		}
	    
	  
	    


	}
