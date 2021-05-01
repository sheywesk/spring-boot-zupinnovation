package com.zup.orange.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AdressDTO {
	@NotNull
	@NotEmpty
	@NotBlank
	private String logradouro;
	@NotNull
	@NotEmpty
	@NotBlank
	private String numberOfHouse;
	@NotNull
	@NotEmpty
	@NotBlank
	private String complement; 
	@NotNull
	@NotEmpty
	@NotBlank
	private String neighborhood;
	@NotNull
	@NotEmpty
	@NotBlank
	private String city;
	@NotNull
	@NotEmpty
	@NotBlank
	private String state;
	@NotNull
	@NotEmpty
	@NotBlank
	private String cep;
	
	public Adress parseToAdress() { 
		return new Adress(
				this.logradouro,
				this.numberOfHouse,
				this.complement,
				this.neighborhood,
				this.city,
				this.state,
				this.cep);
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
