package com.jr.qjs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
@RequestMapping("/demo")
public class DemoController {
	/*@Autowired
	private DemoService demoService;*/
	@ApiOperation(value = "测试方法", notes = "测试方法详细描述")
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public String index(@PathVariable Long id) {
		//return demoService.hello(id);
		return "订单";
	}
}
