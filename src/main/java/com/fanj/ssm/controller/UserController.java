package com.fanj.ssm.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fanj.ssm.entity.User;
import com.fanj.ssm.service.UserService;

@Controller
public class UserController {
	@Resource
    private UserService userService;
	
	private static Logger log = Logger.getLogger(UserController.class);
	
	@RequestMapping("/showUser")
	public String showUser(@RequestParam("id")Integer id, Model model) {
		log.info("id:" + id);
		User user = userService.getUserById(id);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping("/insertUserPage")
	public String insertUserPage(Model model) {
		User user = userService.getUserById(1);
		model.addAttribute("user", user);
		return "insertUser";		
	}
	
	@RequestMapping("insertUser")
	public String insertUser(User user) {
		int count = userService.inser(user);
		return "showUser";
	}
}
