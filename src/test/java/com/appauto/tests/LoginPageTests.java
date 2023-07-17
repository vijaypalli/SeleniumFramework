package com.appauto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.appauto.driver.Driver;

public final class LoginPageTests extends BaseTest{
	
	private LoginPageTests() {
		
	}
	
	@Test
	public void test1() {
		try {
		driver.findElement(By.name("q")).sendKeys("Selenium123",Keys.ENTER);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
