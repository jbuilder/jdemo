package com.jbuilder.master.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jbuilder.master.service.DemoService;

@Controller
public class DemoController {
	
	private static final Log log = LogFactory.getLog(DemoController.class);
	
	@Autowired
	private DemoService demoService;

	@ResponseBody
	@RequestMapping(value="demo/get.do", method = RequestMethod.GET)
	public Map<String, Object> get(HttpServletRequest request , HttpServletResponse response) {
		log.debug("收到请求开始执行......");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("isSuccess", 1);
		map.put("message", "土豪新标准天天吃若干青岛大虾!");
		for(int i=0; i < 10; i++) {
			try{
				demoService.add(i, i+"-name");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		log.debug("请求处理结束......");
		return map;
	}
}
