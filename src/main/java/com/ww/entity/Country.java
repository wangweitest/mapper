package com.ww.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.Serializable;


public class Country implements Serializable{

	private static final long serialVersionUID = 1L;
    
	/**
	 * 
	 */
    private String countrycode;
	/**
	 * 
	 */
    private String countryname;
	/**
	 * 
	 */
    private Integer id;
    
		    
    public Country(){}

    public String getCountrycode() {
        return this.countrycode;
    }
    
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
    public String getCountryname() {
        return this.countryname;
    }
    
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
	
	}