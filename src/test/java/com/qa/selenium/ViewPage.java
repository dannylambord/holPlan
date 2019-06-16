package com.qa.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewPage {
	
	@FindBy(xpath="/html/body/button[2]")
	private WebElement getAll;
	
	@FindBy(xpath="/html/body/button[3]")
	private WebElement submit;
	
	@FindBy(xpath="//*[@id=\"table\"]/thead/tr[2]")
	private WebElement tableEntryOne;
	
	@FindBy(xpath="//*[@id=\"user\"]")
	private WebElement id;
	
	@FindBy(xpath = "/html/body/button[1]")
	private WebElement idEnter;
	
	@FindBy(xpath ="//*[@id=\"table\"]/thead/tr[2]/td[2]")
	private WebElement locIdVal;
	
	public void submit() {
		submit.click();
	}

	public void getAll() {
		getAll.click();
	}
	public void getOne() {
		idEnter.click();
	}
	
	public void idEnter(String text) {
		id.sendKeys(text);
	}
	
	public int getLocTable() {
		String text = locIdVal.getText();
		int num = Integer.parseInt(text);
		return num;
	}
	
	public Boolean entryOne() {
		
		return tableEntryOne.isDisplayed();
	}
}
