package com.ww.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.ww.entity.Users;
import com.ww.service.UsersService;


@Controller
public class UsersController {
	
	@Autowired
	UsersService usersService;
	@RequestMapping("/user")
	@ResponseBody
	public String find() throws Exception{
		Users users= new Users();
		users.setId(1L);
		users.setUsername("2");
		return JSONObject.toJSONString(usersService.findOne(users));
	}
}
