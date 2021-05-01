package com.zup.orange.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup.orange.models.User;
import com.zup.orange.models.UserAndAdress;
import com.zup.orange.models.UserDTO;
import com.zup.orange.services.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {
	@Autowired
	private UserService service;
	
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody @Valid UserDTO userDTO, BindingResult results){
		User user = service.save(userDTO.parseToUser(), results);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserAndAdress> getUser(@PathVariable Long userId){
		return ResponseEntity.status(HttpStatus.OK).body(service.findById(userId));
	}
}
