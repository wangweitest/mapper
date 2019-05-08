package com.ww.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ww.service.UsersService;


@Controller
public class UsersController {
	
	@Autowired
	UsersService usersService;
	@RequestMapping("/user")
	@ResponseBody
	public String findcountry() throws Exception{
		return JSONObject.toJSONString(usersService.findAll());
	}
}
