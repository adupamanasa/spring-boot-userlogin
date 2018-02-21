package com.nrg.rest.controller;

import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.nrg.rest.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("qa")
public class UserLoginControllerIntegrationTest {
	
	/** The MockMvc. */
	private MockMvc mockMvc;

	@Test
	public void test_Valid_UserLogin() throws Exception {
		User user = new User("qaUser", "qaloginpwd");
		mockMvc.perform(post("/userlogin"))
				.andExpect(status().isOk());
		
	}
	
	@Test
	public void test_InValid_UserLogin() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Invalid_Password() {
		fail("Not yet implemented");
	}

}
