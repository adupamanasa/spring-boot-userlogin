package com.nrg.rest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nrg.rest.model.MessageResponse;
import com.nrg.rest.model.User;
import com.nrg.rest.service.UserLoginService;

@RestController
public class UserLoginController {
	
	@Autowired
	private UserLoginService userLoginService;

	@RequestMapping(value = "/userlogin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public MessageResponse userLogin(@RequestBody User user, HttpServletRequest request) {
		return userLoginService.validateUser(user);
	}

}
