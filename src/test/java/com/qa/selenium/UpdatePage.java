package com.qa.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatePage {
	

	@FindBy(xpath = "//*[@id=\"para\"]")
	private WebElement status;
	
	@FindBy(xpath = "//*[@id=\"id\"]")
	private WebElement id;
	
	@FindBy(xpath = "//*[@id=\"city\"]")
	private WebElement city;
	
	@FindBy(xpath = "//*[@id=\"country\"]")
	private WebElement country;
	
	@FindBy(xpath = "/html/body/button")
	private WebElement update;
	
	@FindBy(xpath = "/html/body/button")
	private WebElement updateText;
	
	@FindBy(xpath = "//*[@id=\"navbardrop\"]")
	private WebElement dropdown;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[3]")
	private WebElement addNav;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[1]")
	private WebElement viewNav;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[4]")
	private WebElement deleteNav;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/a")
	private WebElement homeNav;
	
	public void setId(String text) {
		
		id.sendKeys(text);
	}
	
	public void setCity(String text) {
		city.sendKeys(text);
	}
	
	public void setCountry(String text) {
		country.sendKeys(text);
	}
	
	public void submit() {
		update.click();
	}
	
	public String updateSuccesfull() {
		return status.getText();
	}
	
	public String updateText() {
		return updateText.getText();
	}

	public void dropdownShow() {
		dropdown.click();
	}
	
	public void addNav() {
		addNav.click();
	}
	
	public void deleteNav() {
		deleteNav.click();
	}
	
	public void viewNav() {
		viewNav.click();
	}
	
	public void homeNav() {
		homeNav.click();
	}
}
