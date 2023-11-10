package com.example.dto;


public class UserDto {
    private String firstName;
    private String email;
    private String password;
    
    
    
    public UserDto() {
		super();
	}
	public UserDto(String firstName, String email, String password) {
		super();
		this.firstName = firstName;
		this.email = email;
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	
}