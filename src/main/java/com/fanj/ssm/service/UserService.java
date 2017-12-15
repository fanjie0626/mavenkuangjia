package com.fanj.ssm.service;

import com.fanj.ssm.entity.User;

public interface UserService {
	public User getUserById(Integer id);
	
	public int inser(User user);
}
