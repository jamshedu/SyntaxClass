package com.syntaxclass26;

public class RegisterClass {
	
	private String email;
	private	String userName;
	private	String password;
	
	public String getEmail() {
		return email;
	}
    public String getuserName() {
	return userName;
}

public String getPassword() {
	return password;
}

public void setEmail(String email) {
	
	if (email.contains("gmail.com")) {
		this.email=email;
	}else {
		System.out.println("Please enter only gmail");
	}
}
public void setUserName(String userName) {
	if (!userName.isEmpty() && userName.length()>6) {
		this.userName=userName;
	}else {
		System.out.println("User name cant be empty and more than 6 charector");
	}
}
public void setPassword(String password) {
	if (!password.isEmpty() && password.length()>6) {
		this.password=password;
	}else {
		System.out.println("It is too short");
	}
}
}
