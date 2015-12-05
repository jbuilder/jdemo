package com.jbuilder.master.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbuilder.master.dao.DemoDao;
import com.jbuilder.master.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao demoDao;

	@Transactional(rollbackFor=Exception.class)
	public boolean add(Integer id, String name) {
		return demoDao.add(id, name);
	}
	
	
}
