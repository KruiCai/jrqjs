package com.jr.qjs.service.impl;

import com.jr.qjs.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DemoServiceImpl implements DemoService {

	/*@Autowired
	private DemoMapper demoMapper;*/

	@Override
	public String hello(Long id) {
		//return "Hello " + demoMapper.getById(id).getText();
		return "hello maven";
	}
}
