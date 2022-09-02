package com.fatec.petplus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="user_client")
public class UserClient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idClient;
	
	@NotNull
	@Size(min = 3, max= 18)
	private String name;
	
	
	@NotNull
	@Email(message = "O atributo Usuario deve ser um email válido")
	private String email;
	
	@NotNull
	@Size(min = 5)
	private String password;
	
	@Size(max = 5000, message = "The picture link can't be bigger than 5000 chars")
	private String picture;
	
	@Column(name = "street_name")
	private String streetName;
	
	private String district;
	
	private String city;
	
	private String uf;

	private String cpf;
	
	public UserClient() {
		
	}

	public UserClient(long idClient, @NotNull @Size(min = 3, max = 18) String name,
			@NotNull @Email(message = "O atributo Usuario deve ser um email válido") String email,
			@NotNull @Size(min = 5) String password,
			@Size(max = 5000, message = "The picture link can't be bigger than 5000 chars") String picture,
			String streetName, String district, String city, String uf, String cpf) {
		super();
		this.idClient = idClient;
		this.name = name;
		this.email = email;
		this.password = password;
		this.picture = picture;
		this.streetName = streetName;
		this.district = district;
		this.city = city;
		this.uf = uf;
		this.cpf = cpf;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
}
