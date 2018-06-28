package com.spring.controller.unitTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.spring.controller.LoginController;

public class LoginPassword1Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		LoginController login =	Mockito.mock(LoginController.class);
		Mockito.when(login.checkNumber("devops")).thenReturn(true);
	}

}
