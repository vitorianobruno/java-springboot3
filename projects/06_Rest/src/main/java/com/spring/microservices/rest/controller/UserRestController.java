package com.spring.microservices.rest.controller;

import java.util.List;

import com.spring.microservices.rest.model.User;
import com.spring.microservices.rest.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserRestController {

	UserRepository userRepository;

	@Autowired
	public UserRestController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	// Create
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<User> post(@RequestBody User user){

		userRepository.save(user);
		return userRepository.findAll();
	}
	
	// Find by ID
	@RequestMapping(path="/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public User get(@PathVariable long id){

		return userRepository.findById(id);
	}
	
	// Find by name - all
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> get(@RequestParam(required=false) String name){
		
		if(name != null){
            return userRepository.findByName(name);
		} else {
			return userRepository.findAll();
		}
    }
	
	//Consult relation between address y user
	@RequestMapping(path="/{id}/addresses", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAddresses(@PathVariable long id){
		return null;
	}
	
	// Edit
	@RequestMapping(method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void put(@RequestBody User user){
		
	}
	
	// Delete
	@RequestMapping(path="/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable long id){
		
	}
}
