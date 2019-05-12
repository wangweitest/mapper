package com.ww.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.ww.entity.Country;
import com.ww.service.CountryService;


@Controller
public class CountryController {
	
	@Autowired
	CountryService countryService;
	@RequestMapping("/country")
	@ResponseBody
	public String find() throws Exception{
		Country country= new Country();
		country.setCountrycode("CN");
		return JSONObject.toJSONString(countryService.findOne(country));
	}
}
