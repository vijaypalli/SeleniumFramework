package com.appauto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.appauto.driver.Driver;

public final class HomePage extends BaseTest{
	
	private HomePage() {
		
	}
	
	@Test
	public void test2() {
		try {
		driver.findElement(By.name("q")).sendKeys("Automation123",Keys.ENTER);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
