package com.qa.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.model.Destination;

public class Runner {
	
WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/danny/OneDrive/Desktop/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void addTest() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/");
		
		AddPage add = 
				PageFactory.initElements(driver, AddPage.class);
		
		add.enterCity("London");
		add.enterCountry("England");
		add.enter();
		
		
	}
	
	@After
	public void teardown() {
		driver.quit();
	}

}
