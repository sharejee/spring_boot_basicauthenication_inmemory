package com.demospringsecurity2.demospringsecurity2.domain.controllers;

import com.demospringsecurity2.demospringsecurity2.domain.models.Role;
import com.demospringsecurity2.demospringsecurity2.domain.models.SecUser;
import com.demospringsecurity2.demospringsecurity2.domain.repositories.RoleRepository;
import com.demospringsecurity2.demospringsecurity2.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 1/2/2018
*/
@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@RequestMapping(value={"/login"}, method = RequestMethod.GET)
	public ModelAndView login(){
		List<Role> roles = (List<Role>) roleRepository.findAll();
		List<SecUser> secUsers = userService.findAllUsers();

		if (roles == null || roles.size() <= 0) {
			Role role = new Role();
			role.setRole("ADMIN");
			roleRepository.save(role);
		}

		if (secUsers == null || secUsers.size()<=0){
			SecUser secUser = new SecUser();
			secUser.setName("Rith");
			secUser.setLastName("Ron");
			secUser.setEmail("rithronlkh@gmail.com");
			secUser.setActive(1);
			secUser.setPassword("123456");
			userService.saveUser(secUser);
			System.out.println(bCryptPasswordEncoder.encode(secUser.getPassword()));
		}
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String home() throws Exception{
		return "/hello";
	}

}
