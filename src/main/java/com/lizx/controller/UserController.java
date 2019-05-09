package com.lizx.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lizx.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("list")
	@ResponseBody
	public List<Map<String, Object>> list(){
		System.out.println("我是ssssssss另个端dd口");
		List<Map<String, Object>> list = userService.list();
		return list;
	}
	
	@RequestMapping("listValue")
	@ResponseBody
	public List<Map<String, Object>> listValue(){
		System.out.println("我是另个端口");
		List<Map<String, Object>> list = userService.list();
		return list;
	}
	
}
