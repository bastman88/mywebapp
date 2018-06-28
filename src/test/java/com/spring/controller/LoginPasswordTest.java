package com.spring.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class LoginPasswordTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		LoginController login =	Mockito.mock(LoginController.class);
		Mockito.when(login.checkPasswordLength("devops123")).thenReturn(true);
	}

}
