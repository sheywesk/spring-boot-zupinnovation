package com.zup.orange.models;

import java.util.ArrayList;
import java.util.List;

public class UserAndAdress {
	private User user;
	private List<Adress> adressList;
	
	
	public UserAndAdress(User user, List<Adress> adressList) {
		super();
		this.user = user;
		this.adressList = adressList;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Adress> getAdress() {
		return adressList;
	}
	public void setUserAdress(List<Adress> adressList) {
		this.adressList = adressList;
	}
}
