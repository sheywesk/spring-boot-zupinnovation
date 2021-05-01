package com.zup.orange.models;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserAdress{
	@Id
	private Long id; 

	@ElementCollection
	private List<Adress> adress;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public List<Adress> getAdress() {
		return adress;
	}
	
	public void setAdress(List<Adress> adress) {
		this.adress = adress;
	}
	
	
}