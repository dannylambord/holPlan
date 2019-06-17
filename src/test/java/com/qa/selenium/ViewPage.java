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
	
	@FindBy(xpath = "/html/body/button[2]")
	private WebElement viewText;
	
	@FindBy(xpath = "//*[@id=\"navbardrop\"]")
	private WebElement dropdownShow;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[3]")
	private WebElement addNav;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[2]")
	private WebElement updateNav;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[4]")
	private WebElement deleteNav;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/a")
	private WebElement homeNav;
	
	public void enter() {
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
	
	public String viewText() {
		return viewText.getText();
	}
	
	public void dropdownShow() {
		dropdownShow.click();
	}
	
	public void addNav() {
		addNav.click();
	}
	
	public void updateNav() {
		updateNav.click();
	}
	
	public void deleteNav() {
		deleteNav.click();
	}
	
	public void homeNav() {
		homeNav.click();
		
	}
}
