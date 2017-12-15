package com.fanj.ssm.dao;

import org.springframework.stereotype.Repository;

import com.fanj.ssm.entity.User;

@Repository
public interface UserDao {
	int deleteByPrimaryKey(Integer id);
	
	int insert(User user);
	
	int insertSelective(User user);
	
	User selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKey(User user);
	
	int updateByPrimaryKeySelective(User user);
}
