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
		return submit.getText();
	}
	
	
	
}
