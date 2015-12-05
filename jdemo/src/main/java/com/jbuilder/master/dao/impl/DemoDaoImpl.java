package com.jbuilder.master.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jbuilder.master.dao.DemoDao;

@Repository
public class DemoDaoImpl implements DemoDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean add(Integer id, String name) {
		String sql = "insert into `test1` (`id`, `name`, `createdate`) values ("+id+", '"+name+"', '2015-12-17 19:38:48')";
		boolean result=jdbcTemplate.update(sql)==1;
		if(id%2==0) {
			throw new RuntimeException("偶数不可以插入result["+result+"]!");
		}
		return result;
	}

}
