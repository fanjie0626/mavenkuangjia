package com.fanj.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fanj.ssm.dao.UserDao;
import com.fanj.ssm.entity.User;
import com.fanj.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	/**
     * 因为没有在spring的文件中显式的声明userService实现类，直接通过getBean得到 userService 会找不到
     *  需要显式配置 @Service ("userService")，指定bean的名称
     *  相当与<bean id="userService" class="com.jxust.ssm.service.impl.UserServiceImpl"></bean>
     */
	@Resource
	private UserDao userDao;
	
	@Override
	public User getUserById(Integer id) {
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public int inser(User user) {
		return userDao.insert(user);
	}
}
