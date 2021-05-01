package com.zup.orange.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zup.orange.models.AdressDTO;
import com.zup.orange.models.UserAdress;
import com.zup.orange.services.AdressService;

@RestController
@RequestMapping("api/adress")
public class AdressController {
	@Autowired
	private AdressService service;
	
	@PostMapping("/{userId}")
	public ResponseEntity<UserAdress> create(
			@RequestBody @Valid AdressDTO adressDTO,
			@PathVariable Long userId,
			BindingResult results) {
		
		UserAdress adress = service.save(adressDTO.parseToAdress(), userId,results);
		return ResponseEntity.status(HttpStatus.CREATED).body(adress);
	}

}
