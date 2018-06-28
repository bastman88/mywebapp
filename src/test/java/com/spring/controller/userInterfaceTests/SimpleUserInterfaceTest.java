package com.spring.controller.userInterfaceTests;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;	

public class SimpleUserInterfaceTest {		
	    private WebDriver driver;
	    private String TEST_URL = "http://localhost:8090/";
	    private String USERNAME = "devops";
	    private String PASSWORD = "devops123";
	    
		@Test				
		public void testLogin() {	
			driver.get(TEST_URL);  
			
			WebElement name = driver.findElement(By.name("userName"));
			WebElement password = driver.findElement(By.name("password"));			
			WebElement submit = driver.findElement(By.name("submit"));
			
			name.sendKeys(USERNAME);
			password.sendKeys(PASSWORD);
			submit.submit();
			
			String title = driver.getTitle();				 
			assertTrue("Login test failed", title.contains("Success Form")); 		
		}	
		
		@BeforeTest
		public void beforeTest() {	
		    driver = new HtmlUnitDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	