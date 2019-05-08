package com.ww.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.ww.pojo.Country;
import com.ww.service.CountryService;


@Controller
public class CountryController {
	
	@Autowired
	CountryService countryService;
	@RequestMapping("/findcountry")
	@ResponseBody
	public String findcountry() throws Exception{
		return JSONObject.toJSONString(countryService.findCountryById(6));
	}
	@RequestMapping("/delectCountryById")
	public  void delectCountryById() throws Exception{
		countryService.delectCountryById(1);
	}
	@RequestMapping("/insertCountry")
	public  void insertCountry() throws Exception{
		Country country=new Country();
		country.setCountryname("asdfasdf");
		country.setCountrycode("asdfasdf");
		countryService.insertCountry(country);
	}
	@RequestMapping("/updateCountry")
	public  void updateCountry() throws Exception{
		Country country=new Country();
		country.setId(3);
		country.setCountryname("asdfasdf");
		country.setCountrycode("asdfasdf");
		countryService.updateCountry(country);
	}

}
