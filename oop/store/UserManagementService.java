package com.it.berdeja.oop.store;

public interface UserManagementService {
	String registerUser(User user);
	
	User[] getUsers();

	User getUserByEmail(String userEmail);
}