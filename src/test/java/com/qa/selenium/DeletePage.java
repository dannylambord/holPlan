package com.qa.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletePage {
	
	@FindBy(xpath = "//*[@id=\"id\"]")
	private WebElement id;
	
	@FindBy(xpath = "/html/body/button")
	private WebElement submit;
	
	public void enterId(String text) {
		id.sendKeys(text);
	}
	
	public void enter() {
		submit.click();
	}
	
	public String addSuccesfull() {
		return submit.getText();
	}

}
