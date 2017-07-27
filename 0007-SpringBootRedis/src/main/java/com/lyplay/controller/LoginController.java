package com.lyplay.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@EnableAutoConfiguration
public class LoginController {

	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	
	@RequestMapping(value = "/api/hello1", method = RequestMethod.GET)
	@ResponseBody
	public String home() {
		stringRedisTemplate.opsForValue().set("stringKey2", "stringValue2");
        return "Hello M1y World1!";
    }
	
	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	@ResponseBody
	public String todos() {
		stringRedisTemplate.opsForValue().set("stringKey", "stringValue");
        return "Hello M1y World1!";
    }
	
	// 显示用户json数据
	@ApiOperation(value = "获取用户列表，支持分页", notes = "json方法获取用户列表")
	@ApiImplicitParams({ @ApiImplicitParam(name = "page", value = "当前页码", required = true, dataType = "int"),
			@ApiImplicitParam(name = "rows", value = "每页条数", required = true, dataType = "int") })
	@RequestMapping(value = "/api/json", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> json(@RequestParam(name = "page", defaultValue = "1") int page,
			@RequestParam(name = "rows", defaultValue = "10") int rows) {

		return new HashMap<String, Object>();
	}

}
