package com.appauto.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.appauto.constants.FrameWorkConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static WebDriver driver;


	public static void initDriver() {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		if(Objects.isNull(driver)) {
			//System.setProperty("webdriver.chrome.driver",FrameWorkConstants.getChromedriverPath());
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}
	}

	public static void quitDriver() {
		if (Objects.nonNull(driver)) {
			driver.quit();
			driver=null;	
		}
	}

}
