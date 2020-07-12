package com.SuperServ.demo0.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity
	@Table(name = "tinvent")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Cinvent {
		@Id
	    @Column(name="idinvent",nullable = false, unique = true)
	    private Integer idinvent;
	    @Column(name="desinvent")
	    private String desinvent;
		@Column(name="date_")
	    private Date date_;
		
	    public Cinvent() {

		}

		public Integer getIdinvent() {
			return idinvent;
		}
		public void setIdinvent(Integer idinvent) {
			this.idinvent = idinvent;
		}
		public String getDesinvent() {
			return desinvent;
		}
		public void setDesinvent(String desinvent) {
			this.desinvent = desinvent;
		}

		public Date getDate_() {
			return date_;
		}

		public void setDate_(Date date_) {
			this.date_ = date_;
		}

	    
	
	    
}
