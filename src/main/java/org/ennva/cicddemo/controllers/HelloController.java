package org.ennva.cicddemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@Autowired
	private BuildProperties buildProperties;
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Welcome to Spring Boot. " + buildProperties.getName() + "-" + buildProperties.getVersion();
	}
	
	@RequestMapping("/hello/{name}")
	@ResponseBody
	public String hello(@PathVariable String name) {
		return "Hello " + name;
	}

}
