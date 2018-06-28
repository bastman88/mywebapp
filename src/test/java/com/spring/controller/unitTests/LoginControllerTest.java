package com.spring.controller.unitTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.spring.controller.LoginController;

public class LoginControllerTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Set up has Started");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSubmit() {
		LoginController login = Mockito.mock(LoginController.class);
		Mockito.when(login.checkUsername("devops", "devops123")).thenReturn(true);
	}

}
