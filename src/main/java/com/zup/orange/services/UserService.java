package com.zup.orange.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import com.zup.orange.exceptions.UserBadRequestException;
import com.zup.orange.exceptions.UserConflictException;
import com.zup.orange.exceptions.UserNotFoundException;
import com.zup.orange.models.Adress;
import com.zup.orange.models.User;
import com.zup.orange.models.UserAdress;
import com.zup.orange.models.UserAndAdress;
import com.zup.orange.repositories.AdressRepository;
import com.zup.orange.repositories.UserRepositoy;

@Service
public class UserService {
	@Autowired
	private UserRepositoy userRepository;
	
	@Autowired 
	private AdressRepository adressRepository;
	
	public User save(User user, BindingResult results) {
		if(results.hasErrors()) {
			throw new UserBadRequestException();
		}
		
		List<User> clientsResults = userRepository.findAll();
		
		for(var item : clientsResults) {
			if(item.getEmail().equals(user.getEmail())) {
				throw new UserConflictException();
			}
		}
		
		for(var item : clientsResults) {
			if(item.getCpf().equals(user.getCpf())) {
				throw new UserConflictException();
			}
		}
		
		return userRepository.save(user);
	}
	
	public UserAndAdress findById(Long userId) {
		Optional<User> user = userRepository.findById(userId);
		Optional<UserAdress> userAdress = adressRepository.findById(userId);
		List<Adress> adressList = Collections.emptyList();
		if(!user.isPresent()) {
			throw new UserNotFoundException();
		}
		if(userAdress.isPresent()) {
			adressList = userAdress.get().getAdress();
		}
		
		UserAndAdress userAndAdress = new UserAndAdress(user.get(),adressList);
		return userAndAdress;
	}
}

