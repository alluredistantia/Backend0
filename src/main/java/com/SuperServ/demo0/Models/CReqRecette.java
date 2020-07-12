package com.SuperServ.demo0.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "reqrecette")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CReqRecette {

	    @Id
	    @Column(name="Date_",nullable = false, unique = true)
	    private String Date_;
	    @Column(name="recette")
	    private Double recette;
		public String getDate_() {
			return Date_;
		}
		public Double getRecette() {
			return recette;
		}
		public CReqRecette() {
			super();
		}
}
