package com.example.demo.conrtoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		String message = "hello world!!";
		return message;
	}
	@RequestMapping("/list")
	public String list() {
		String message = "list test2";
		return message;
	}
}
