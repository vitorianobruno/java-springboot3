package com.spring.microservices.jpa.controller;

import java.util.List;

import com.spring.microservices.jpa.model.User;
import com.spring.microservices.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="Users")
public class UsersController {

	@Autowired
	private UserRepository repository;
	
	//Consumes responses to header content-type
	//POST locahost:8080/Users
	@RequestMapping(method=RequestMethod.POST, consumes="application/json")
	public void insertPerson(@RequestBody User user){
		repository.save(user);
	}
	
	//produces responde a la header a Accept
	//GET locahost:8080/User?name=Victor
	@RequestMapping(method=RequestMethod.GET, produces="application/json")
	public List<User> findByName(@RequestParam String name){
		return repository.findByName(name);
	}
	
	//GET locahost:8080/Users/1
	@RequestMapping(path="/{id}", method=RequestMethod.GET, produces="application/json")
	public User findById(@PathVariable long id){
		return repository.findById(id);
	}
}
