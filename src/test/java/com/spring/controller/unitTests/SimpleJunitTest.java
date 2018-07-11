package com.spring.controller.unitTests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.spring.controller.LoginController;

public class SimpleJunitTest {

	@Test
	public void testCheckUsername() {
		LoginController login = new LoginController();
		assertTrue(login.checkUsername("devops", "devops123"));
	}
	
}
