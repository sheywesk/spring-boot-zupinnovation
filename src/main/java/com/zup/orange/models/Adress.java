package com.zup.orange.models;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	private String logradouro;
	private String numberOfHouse;
	private String complement; 
	private String neighborhood;
	private String city; 
	private String state;
	private String cep;
	
	public Adress() {}
	public Adress(
			String logradouro,
			String numberOfHouse, 
			String complement,
			String neighborhood,
			String city,
			String state, String cep) {
	
		this.logradouro = logradouro;
		this.numberOfHouse = numberOfHouse;
		this.complement = complement;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumberOfHouse() {
		return numberOfHouse;
	}
	public void setNumberOfHouse(String numberOfHouse) {
		this.numberOfHouse = numberOfHouse;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
