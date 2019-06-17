package com.qa.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPage {

	@FindBy(xpath = "//*[@id=\"city\"]")
	private WebElement city;
	
	@FindBy(xpath = "//*[@id=\"country\"]")
	private WebElement country;
	
	@FindBy(xpath = "/html/body/button[1]")
	private WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"para\"]")
	private WebElement status;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[4]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//*[@id=\"navbardrop\"]")
	private WebElement dropdown;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[2]")
	private WebElement updateButton;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[1]")
	private WebElement viewButton;
	
	@FindBy(xpath = "/html/body/h1")
	private WebElement addText;
	
	public void enterCity(String text) {
		city.sendKeys(text);
	}
	
	public void enterCountry(String text) {
		country.sendKeys(text);
	}
	
	public void enter() {
		submit.click();
	}
	
	public String addSuccesfull() {
		return status.getText();
	}
	
	public void deleteNav() {
		deleteButton.click();
	}
	
	public void updateNav() {
		updateButton.click();
	}
	
	public void viewNav() {
		viewButton.click();
	}
	
	public void dropdownShow() {
		dropdown.click();
	}
	
	public String addText() {
		return addText.getText();
	}
	
	
	
}
