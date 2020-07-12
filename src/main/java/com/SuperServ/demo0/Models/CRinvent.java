package com.SuperServ.demo0.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity
	@Table(name = "rinvent")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CRinvent {
	    public CRinvent() {

		}

		@Id
	    @Column(name="idrinvent",nullable = false, unique = true)
	    private int idrinvent;
	    @Column(name="idbarcode")
	    private String idbarcode;		
	    @Column(name="idinvent")
	    private String idinvent;
	    @Column(name="qteinvent")
	    private double qteinvent;
	    @Column(name="prixachat")
	    private double prixachat;
		public int getIdrinvent() {
			return idrinvent;
		}
		public void setIdrinvent(int idrinvent) {
			this.idrinvent = idrinvent;
		}
		public String getIdbarcode() {
			return idbarcode;
		}
		public void setIdbarcode(String idbarcode) {
			this.idbarcode = idbarcode;
		}
		public String getIdinvent() {
			return idinvent;
		}
		public void setIdinvent(String idinvent) {
			this.idinvent = idinvent;
		}
		public double getQteinvent() {
			return qteinvent;
		}
		public void setQteinvent(double qteinvent) {
			this.qteinvent = qteinvent;
		}
		public double getPrixachat() {
			return prixachat;
		}
		public void setPrixachat(double prixachat) {
			this.prixachat = prixachat;
		}
	    
	    


	}
