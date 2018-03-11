package com.abcc.user.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abcc.framework.response.model.RestResponse;
import com.abcc.user.model.User;


@RestController
@RequestMapping("/user")
public class UserController {

	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@RequestMapping(value="/{id}", method = RequestMethod.GET) 
	public RestResponse getUser(@PathVariable("id") final String userId) {
		
		User user = userDao.getUser("id", userId);
		// TODO
		return new RestResponse();
	}
}
