package com.jbuilder.master.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping(value="demo/get.do", method = RequestMethod.GET)
	public Map<String, Object> get(HttpServletRequest request , HttpServletResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isSuccess", 1);
		map.put("message", "土豪新标准天天吃若干青岛大虾!");
		return map;
	}
}
