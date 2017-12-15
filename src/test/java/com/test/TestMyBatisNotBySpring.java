package com.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fanj.ssm.entity.User;
import com.fanj.ssm.service.UserService;

public class TestMyBatisNotBySpring {
	private ApplicationContext ac = null;
	
	private UserService userService = null;
	
	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
		userService = (UserService) ac.getBean("userService");
	}
	
	@Test
	public void test1() {
		User user = userService.getUserById(1);
		System.out.println(user);
	}
	
	@Test
	public void test2() {
		User user = new User();
		user.setUserName("王维");
		user.setPassword("223344");
		user.setAge(23);
		int count = userService.inser(user);
		System.out.println("插入"+count+"条数据成功");
	}
}
