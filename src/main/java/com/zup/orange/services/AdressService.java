package com.zup.orange.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.zup.orange.exceptions.UserBadRequestException;
import com.zup.orange.exceptions.UserNotFoundException;
import com.zup.orange.models.Adress;
import com.zup.orange.models.UserAdress;
import com.zup.orange.models.User;
import com.zup.orange.repositories.AdressRepository;
import com.zup.orange.repositories.UserRepositoy;


@Service
public class AdressService {
	@Autowired
	private AdressRepository adressRepository;
	@Autowired
	private UserRepositoy userRepository;
	
	public UserAdress save(Adress adress,Long userId ,BindingResult results) {
		List<Adress> adressArrayList = new ArrayList<Adress>();
		
		if(results.hasErrors()) {
			throw new UserBadRequestException();
		}
		
		Optional<User> userResult = userRepository.findById(userId);
		Optional<UserAdress> adressEntity= adressRepository.findById(userId);
		UserAdress adressList;
		
		if(!userResult.isPresent()) {
			throw new UserNotFoundException();
		}
		
		if(userResult.isPresent() && adressEntity.isPresent()) {
			adressList = adressEntity.get();
			adressList.getAdress().add(adress);
			return adressRepository.save(adressList);
		}
		
		adressArrayList.add(adress);
		adressList = new UserAdress();
		adressList.setId(userId);
		adressList.setAdress(adressArrayList);
		return adressRepository.save(adressList);

	}
	
	public UserAdress findById(Long userId) {
		Optional<UserAdress> adress = adressRepository.findById(userId);
		return adress.get();
	}

}










