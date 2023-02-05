package com.usuario.service.entidades;


@javax.persistence.Entity
@javax.persistence.Table(name="\"user\"")
public class User {

	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private int userId;
	
	private String name;
	private String email;
	 
	public User() {
		super();
	}
	
	public int getId() {
		return userId;
	}
	public void setId(int id) {
		this.userId = id;
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
	
	
}
