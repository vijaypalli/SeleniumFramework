package com.appauto.tests;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.appauto.utils.ReadProps;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected BaseTest() {
		
	}
	
	public WebDriver driver;
	
	@BeforeMethod
	protected void setUp() {
		System.out.println("Before Test");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		if(Objects.isNull(driver)) {
			//System.setProperty("webdriver.chrome.driver",FrameWorkConstants.getChromedriverPath());
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			System.out.println(ReadProps.getValue("url"));
			driver.get(ReadProps.getValue("url"));
		}
		//driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	protected void tearDown() {
		System.out.println("After Test");
		if (Objects.nonNull(driver)) {
			driver.quit();
			driver=null;	
		}
	}
}
