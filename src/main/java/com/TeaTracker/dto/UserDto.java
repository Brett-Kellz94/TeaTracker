package com.TeaTracker.dto;

import com.TeaTracker.pojos.User;

public class UserDto implements Dto<User>{
	
	private int userId;
	
	private String firstName;
	
	private String lastName;
	
	private String userName;
	
	private String passPhrase;
	
	private int authLevel;
	
	

	public UserDto(int userId, String firstName, String lastName, String userName, String passPhrase, int authLevel) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passPhrase = passPhrase;
		this.authLevel = authLevel;
	}

    public UserDto(User user) {
    	this.userId = user.getUserId();
    	this.firstName = user.getFirstName();
    	this.lastName = user.getLastName();
    	this.userName = user.getUserName();
    	this.passPhrase = user.getPassPhrase();
    	this.authLevel = user.getAuthLevel();
    }

	@Override
	public User toPojo() {
		User user = new User();
		
		return user;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassPhrase() {
		return passPhrase;
	}

	public void setPassPhrase(String passPhrase) {
		this.passPhrase = passPhrase;
	}

	public int getAuthLevel() {
		return authLevel;
	}

	public void setAuthLevel(int authLevel) {
		this.authLevel = authLevel;
	}
	
	   @Override
	    public String toString() {
	        return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", passPhrase="
	                + passPhrase + ", authLevel=" + authLevel + "]";
	    }

}
