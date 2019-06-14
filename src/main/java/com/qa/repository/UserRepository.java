package com.qa.repository;

import java.util.List;

import com.qa.model.Destination;
import com.qa.model.User;

public interface UserRepository {
	
	public User create(User user);

	public User read(int id);

}
