package com.ww.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.ww.entity.PubUserBase;
import com.ww.service.PubUserBaseService;


@Controller
public class PubUserBaseController {
	
	@Autowired
	PubUserBaseService pubUserBaseService;
	
	@RequestMapping("/pubUserBase")
	@ResponseBody
	public String find() throws Exception{
		PubUserBase pubUserBase = new PubUserBase();
		pubUserBase.setId(103408);
		return JSONObject.toJSONString(pubUserBaseService.findOne(pubUserBase));
	}
}
