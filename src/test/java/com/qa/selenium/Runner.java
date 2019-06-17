package com.qa.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

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
		
		driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
		assertEquals("Destination wasn't added", "successful", add.addSuccesfull());
		
		
	}
	
	@Test
	public void DeleteTest() {
		
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/delete.html");
		
		DeletePage delete = 
				PageFactory.initElements(driver, DeletePage.class);

		delete.enterId("22");
		delete.enter();
		
		driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
		assertEquals("Destination wasn't deleted", "successful", delete.deleteSuccesfull());
		
	}
	
	@Test
	public void GetAllTest() {
		
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/view.html");
		
		ViewPage view = PageFactory.initElements(driver, ViewPage.class);
		
		//view.getAll();
		view.enter();
		
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		assertTrue(view.entryOne());
	}
	
	@Test
	public void GetOneTest() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/view.html");
		
		ViewPage view = PageFactory.initElements(driver, ViewPage.class);
		
		view.idEnter("20");
		view.getOne();
		view.enter();
		
		driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
		assertEquals("Wrong Location ID returned", 20, view.getLocTable());
		
	}
	
	@Test 
	public void UpdateDestination() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/update.html");
		
		UpdatePage update = PageFactory.initElements(driver, UpdatePage.class);
		
		update.setId("14");
		update.setCity("Dublin");
		update.setCountry("Ireland");
		update.submit();
		
		driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
		assertEquals("Destination not updated", "successful", update.updateSuccesfull());
		
		
	}
	
	@Test
	public void navigationTest1() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/");
		
		AddPage add = 
				PageFactory.initElements(driver, AddPage.class);
		
		add.dropdownShow();
		add.deleteNav();
		
		DeletePage delete = 
				PageFactory.initElements(driver, DeletePage.class);
		
		String text = delete.getPageName();
		assertEquals("Wrong page reached", "Delete a destination", text);
	}
	
	@Test
	public void navigationTest2() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/");
		
		AddPage add = 
				PageFactory.initElements(driver, AddPage.class);
		
		add.dropdownShow();
		add.updateNav();
		
		UpdatePage update = 
				PageFactory.initElements(driver, UpdatePage.class);
		
		String text = update.updateText();
		assertEquals("Wrong page reached", "Update Details", text);
	}
	
	@Test
	public void navigationTest3() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/");
		
		AddPage add = 
				PageFactory.initElements(driver, AddPage.class);
		
		add.dropdownShow();
		add.viewNav();
		
		ViewPage view = 
				PageFactory.initElements(driver, ViewPage.class);
		
		String text = view.viewText();
		assertEquals("Wrong page reached", "Get all records", text);
	}
	
	@Test 
	public void navigationTest4() {
		
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/view.html");
		
		ViewPage view = 
				PageFactory.initElements(driver, ViewPage.class);
		
		view.dropdownShow();
		view.addNav();
		
		AddPage add = 
				PageFactory.initElements(driver, AddPage.class);
		
		String text = add.addText();
		assertEquals("Wrong page reached", "Add a destination", text);
		
	}
	
	@Test
	public void navigationTest5() {
		
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/view.html");
		
		ViewPage view = 
				PageFactory.initElements(driver, ViewPage.class);
		
		view.dropdownShow();
		view.updateNav();
		
		UpdatePage update = 
				PageFactory.initElements(driver, UpdatePage.class);
		
		String text = update.updateText();
		assertEquals("Wrong page reached", "Update Details", text);
		
	}
	
	@Test
	public void navigationTest6() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/view.html");
		
		ViewPage view = 
				PageFactory.initElements(driver, ViewPage.class);
		
		view.dropdownShow();
		view.deleteNav();
		
		
		DeletePage delete = 
				PageFactory.initElements(driver, DeletePage.class);
		
		String text = delete.getPageName();
		assertEquals("Wrong page reached", "Delete a destination", text);
	}
	
	@Test
	public void navigationTest7() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/delete.html");
		
		DeletePage delete = 
				PageFactory.initElements(driver, DeletePage.class);
		
		delete.dropdownShow();
		delete.viewNav();
		
		
		ViewPage view = 
				PageFactory.initElements(driver, ViewPage.class);
		
		String text = view.viewText();
		assertEquals("Wrong page reached", "Get all records", text);
	}
	
	@Test
	public void navigationTest8() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/delete.html");
		
		DeletePage delete = 
				PageFactory.initElements(driver, DeletePage.class);
		
		delete.dropdownShow();
		delete.updateNav();
		
		
		UpdatePage update = 
				PageFactory.initElements(driver, UpdatePage.class);
		
		String text = update.updateText();
		assertEquals("Wrong page reached", "Update Details", text);
	}
	
	@Test
	public void navigationTest9() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/delete.html");
		
		DeletePage delete = 
				PageFactory.initElements(driver, DeletePage.class);
		
		delete.dropdownShow();
		delete. addNav();
		
		
		AddPage add = 
				PageFactory.initElements(driver, AddPage.class);
		
		String text = add.addText();
		assertEquals("Wrong page reached", "Add a destination", text);
	}
	
	@Test
	public void navigationTest10() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/update.html");
		
		UpdatePage update = 
				PageFactory.initElements(driver, UpdatePage.class);
		
		update.dropdownShow();
		update.addNav();
		
		
		AddPage add = 
				PageFactory.initElements(driver, AddPage.class);
		
		String text = add.addText();
		assertEquals("Wrong page reached", "Add a destination", text);
	}
	
	@Test
	public void navigationTest11() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/update.html");
		
		UpdatePage update = 
				PageFactory.initElements(driver, UpdatePage.class);
		
		update.dropdownShow();
		update.viewNav();
		
		
		ViewPage view = 
				PageFactory.initElements(driver, ViewPage.class);
		
		String text = view.viewText();
		assertEquals("Wrong page reached", "Get all records", text);
	}
	
	@Test
	public void navigationTest12() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/update.html");
		
		UpdatePage update = 
				PageFactory.initElements(driver, UpdatePage.class);
		
		update.dropdownShow();
		update.deleteNav();
		
		
		DeletePage delete = 
				PageFactory.initElements(driver, DeletePage.class);
		
		String text = delete.getPageName();
		assertEquals("Wrong page reached", "Delete a destination", text);
	}
	
	@Test
	public void homeNavigationTest1() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/update.html");
		
		UpdatePage update = 
				PageFactory.initElements(driver, UpdatePage.class);
		
		update.homeNav();
		
		
		AddPage add = 
				PageFactory.initElements(driver, AddPage.class);
		
		String text = add.addText();
		assertEquals("Wrong page reached", "Add a destination", text);
	}
	
	@Test
	public void homeNavigationTest2() {
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/delete.html");
		
		DeletePage delete = 
				PageFactory.initElements(driver, DeletePage.class);
		
		delete.homeNav();
		
		
		AddPage add = 
				PageFactory.initElements(driver, AddPage.class);
		
		String text = add.addText();
		assertEquals("Wrong page reached", "Add a destination", text);
	}
	
	@Test 
	public void homeNavigationTest4() {
		
		driver.manage().window().maximize();
		driver.get("http://35.246.36.67:8080/holPlanner-1.0/view.html");
		
		ViewPage view = 
				PageFactory.initElements(driver, ViewPage.class);
		
		view.dropdownShow();
		view.addNav();
		
		AddPage add = 
				PageFactory.initElements(driver, AddPage.class);
		
		String text = add.addText();
		assertEquals("Wrong page reached", "Add a destination", text);
		
	}
	
	
	@After
	public void teardown() {
		driver.quit();
	}

}
