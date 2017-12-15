package com.fanj.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fanj.ssm.dao.UserDao;
import com.fanj.ssm.entity.User;
import com.fanj.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	/**
     * ��Ϊû����spring���ļ�����ʽ������userServiceʵ���ֱ࣬��ͨ��getBean�õ� userService ���Ҳ���
     *  ��Ҫ��ʽ���� @Service ("userService")��ָ��bean������
     *  �൱��<bean id="userService" class="com.jxust.ssm.service.impl.UserServiceImpl"></bean>
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
