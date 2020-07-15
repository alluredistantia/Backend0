package com.SuperServ.demo0.Models;



import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbarcode")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CbarCode {
    @Id
    @Column(name="idbarcode",nullable = false, unique = true)
    private String idbarcode;
    @Column(name="idarticle")
    private String idarticle;
    @Column(name="symbole")
    private String symbole;

    //@JsonInclude
    //@Transient
//    @JsonIgnore 
//    @ManyToOne(fetch = FetchType.LAZY)
    
//    @JoinColumn(name = "idarticle", insertable = false, updatable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    private Carticle carticle;


	

	public CbarCode() {
    }

    public CbarCode(String idbarCode, String idArticle, String symbole) {
        this.idbarcode = idbarCode;
        this.idarticle = idArticle;
        this.symbole = symbole;
    }


    
    public String getIdbarcode() {
		return idbarcode;
	}

	public void setIdbarcode(String idbarcode) {
		this.idbarcode = idbarcode;
	}

	public String getIdarticle() {
		return idarticle;
	}

	public void setIdarticle(String idarticle) {
		this.idarticle = idarticle;
	}

	public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }


}

