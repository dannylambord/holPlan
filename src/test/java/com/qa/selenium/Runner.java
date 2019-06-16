package com.qa.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
	
	@Test
	public void DeleteTest() {
		
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/delete.html");
		
		DeletePage delete = 
				PageFactory.initElements(driver, DeletePage.class);

		delete.enterId("1");
		delete.enter();
		delete.addSuccesfull();		
	}
	
	@Test
	public void GetAllTest() {
		
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/view.html");
		
		ViewPage view = PageFactory.initElements(driver, ViewPage.class);
		
		view.getAll();
		view.submit();
		
		assertTrue(view.entryOne());
	}
	
	@Test
	public void getOneTest() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/view.html");
		
		ViewPage view = PageFactory.initElements(driver, ViewPage.class);
		
		view.idEnter("20");
		view.getOne();
		view.submit();
		
		assertEquals("Wrong Location ID returned", 20, view.getLocTable());
		
	}
	
	@After
	public void teardown() {
		driver.quit();
	}

}
