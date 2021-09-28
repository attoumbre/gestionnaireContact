package com.example.gestioncontact.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestioncontact.dto.LoginData;
import com.example.gestioncontact.dto.UsersDTO;
import com.example.gestioncontact.model.Users;
//import com.example.gestioncontact.repository.UsersRepository;
import com.example.gestioncontact.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	
	@PostMapping(path = "users/login/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	// on recois un logidata en requestbody
	public Boolean login(@RequestBody LoginData logdata, @PathVariable("id") Integer id, @RequestParam("classe") String classe) {
		
		System.out.println(id);
		System.out.println(classe);
		
		if ("".equals(logdata.login)) {
			return false;
		} else {
			return true;
		}

	}
	
	@PostMapping(path = "users/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Users save(@RequestBody UsersDTO user) {
		
		return service.ajouter(user);
	}
	
	@GetMapping(path="users/get/{key}")
	public Users getById(@PathVariable("key") Integer id) {
		return service.getOne(id);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping(path="users")
	public List<Users> getAll() {
		
		return service.getAll();
	}

}