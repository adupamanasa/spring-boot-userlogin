package com.nrg.rest.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nrg.rest.model.MessageResponse;
import com.nrg.rest.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserLoginServiceJunitTest {

	@Autowired
	private UserLoginService userLoginService;
	
	@Value("${user.userName}")
	public String userName;
	
	@Value("${user.pwd}")
	public String pwd;
	
	@Test
	public void testValidLogin() {
		System.out.println("User Name ===== " + userName);
		User user = new User();
		user.setUserName(userName);
		user.setPassword(pwd);
		MessageResponse resp = userLoginService.validateUser(user);
		
		assertEquals("Login Successfull", resp.returnMessage);
	}
	
	@Test
	public void testInValidUserLogin() {
		System.out.println("User Name ===== " + userName);
		User user = new User();
		user.setUserName("invalidUserName");
		user.setPassword(pwd);
		MessageResponse resp = userLoginService.validateUser(user);
		
		assertEquals("Invalid Username", resp.returnMessage);
	}
	
	@Test
	public void testInValidPasswordLogin() {
		System.out.println("User Name ===== " + userName);
		User user = new User();
		user.setUserName(userName);
		user.setPassword("invalidPassword");
		MessageResponse resp = userLoginService.validateUser(user);
		
		assertEquals("Invalid password", resp.returnMessage);
	}
}
