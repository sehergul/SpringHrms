package com.example.hrmsSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsSpring.business.abstracts.UsersService;
import com.example.hrmsSpring.entities.concretes.Users;


//Controller, dis dunya ile sistemin iletisim kurdugu yer

@RestController			//Java olmayanlar da tanısın diye
@RequestMapping("/api/users")	//birden fazla controller olabilir
public class UsersController {

	private UsersService userService;

	@Autowired
	public UsersController(UsersService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public List<Users> getAll(){
		return this.userService.getAll();
	}
	
	
}
