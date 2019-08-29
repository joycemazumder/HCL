package com.jm.eshoppe.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jm.eshoppe.vo.User;

@Controller
public class LoginController {
	
	
	@PostMapping(path="/login",consumes = "application/x-www-form-urlencoded")
	public String login( User user)
	{
		
		System.out.println("user:"+user.getUserId());
		
		return "/final";
		
	}
	
	
	@GetMapping({"/","/index",""})
	public String index()
	{
		
		System.out.println("index.html");
		
		return "/index";
		
	}
	@GetMapping("/error")
	public String error()
	{
		
		System.out.println("index");
		
		return "index";
		
	}
}
