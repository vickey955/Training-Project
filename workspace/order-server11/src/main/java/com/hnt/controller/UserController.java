package com.hnt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hnt.entity.User;
@RestController
public class UserController {
	
	@GetMapping
	String getUser() {
		return "test";
	}
	
	@PostMapping
	void saveUser(@RequestBody User user) {
			//log.debug(user.getName());
	}
	
 }

