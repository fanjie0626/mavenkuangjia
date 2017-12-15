package com.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.fanj.ssm.entity.User;
import com.fanj.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatisBySpring {
    private static Logger log = Logger.getLogger(TestMyBatisBySpring.class);
    
    @Resource
    private UserService userService = null;
    
    @Test
    public void test1() {
    	User user = userService.getUserById(2);
    	log.info("值："+user.getUserName());
    	log.info(JSON.toJSONString(user));
    }
    
    @Test
    public void test2() {
    	User user = new User();
    	user.setUserName("李清照");
    	user.setPassword("135790");
    	user.setAge(23);
    	int count = userService.inser(user);
    	log.info("count:" + count);
    }
}
