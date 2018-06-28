package com.spring.controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.springframework.ui.Model;

public class LoginControllerTest  {
	


	@Before
	public void setUp() throws Exception {
		System.out.println("Set up has Started");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSubmit() {
	
		LoginBean loginBean = new LoginBean();
		LoginController login =	Mockito.mock(LoginController.class);
		Mockito.when(login.checkUsername("devops", "devops123")).thenReturn(true);
	
		
		
	}

}
