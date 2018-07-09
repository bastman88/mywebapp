package com.spring.controller.userInterfaceTests;

import static org.junit.Assert.assertTrue;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;	

public class SimpleUserInterfaceTest {		
	    private WebDriver driver;
	    private String BASE_URL = "http://localhost:";
	    private String HOST_PORT = "8090";
	    private String VM_PORT = "9090";
	    private String TEST_URL = "/test/mywebapp/login";
	    
	    private String HOST_URL = BASE_URL + HOST_PORT + TEST_URL;
	    private String VM_URL = BASE_URL + VM_PORT + TEST_URL;
	    
	    private String USERNAME = "devops";
	    private String PASSWORD = "devops123";
	    
		@Test				
		public void testLogin() throws UnknownHostException {	
			String hostname = InetAddress.getLocalHost().getHostName();
			
			if ("ci-server".equals(hostname)) {
				driver.get(VM_URL);  
			}
			else {
				driver.get(HOST_URL);
			}
			
			WebElement name = driver.findElement(By.cssSelector("[name=\"userName\"]"));
			WebElement password = driver.findElement(By.cssSelector("[name=\"password\"]"));			
			WebElement submit = driver.findElement(By.cssSelector("[type=\"submit\"]"));

			name.sendKeys(USERNAME);
			password.sendKeys(PASSWORD);
			submit.submit();
			
			String title = driver.getTitle();				 
			assertTrue("Could not access to application", title.contains("Success Form")); 			
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