package com.zup.orange.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class UserDTO {
	@NotNull
	@NotEmpty
	@NotBlank
	private String name;
	@NotNull
	@NotEmpty
	@NotBlank
	@Email
	private String email;
	@NotNull
	@NotEmpty
	@NotBlank
	private String cpf;
	@NotNull
	@NotEmpty
	@NotBlank
	private String birthDay;
	
	public User parseToUser() {
		return new User(this.name,this.email,this.cpf,this.birthDay);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
}
