package com.nrg.rest.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserLoginControllerIntegrationTest {
	
	@Value("${user.userName}")
	public String userName;
	
	@Value("${user.pwd}")
	public String pwd;
	
	/** The MockMvc. */
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void test_Valid_UserLogin() throws Exception {
		this.mockMvc.perform(post("/userlogin")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"userName\" : \"" + userName +"\",\"password\" : \"" + pwd +"\"}"))
				.andExpect(status().isOk())
		.andExpect(jsonPath("$.returnMessage").value("Login Successfull"));
		
	}
	
	@Test
	public void test_InValid_UserLogin() throws Exception {
		String invalidUserName = "invalidUser";
		this.mockMvc.perform(post("/userlogin")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"userName\" : \"" + invalidUserName +"\",\"password\" : \"" + pwd +"\"}"))
				.andExpect(status().isOk())
		.andExpect(jsonPath("$.returnMessage").value("Invalid Username"));
	}
	
	@Test
	public void test_Invalid_Password() throws Exception {
		String invalidPasword = "invalidPwd";
		this.mockMvc.perform(post("/userlogin")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"userName\" : \"" + userName +"\",\"password\" : \"" + invalidPasword +"\"}"))
				.andExpect(status().isOk())
		.andExpect(jsonPath("$.returnMessage").value("Invalid password"));
	}

}
