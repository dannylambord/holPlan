package com.qa.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletePage {
	
	@FindBy(xpath = "//*[@id=\"id\"]")
	private WebElement id;
	
	@FindBy(xpath = "/html/body/button")
	private WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"Para\"]")
	private WebElement status;
	
	@FindBy(xpath = "/html/body/h1")
	private WebElement pageName;
	
	@FindBy(xpath = "//*[@id=\"navbardrop\"]")
	private WebElement dropdown;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[1]")
	private WebElement viewNav;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[2]")
	private WebElement updateNav;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/ul/li/div/a[3]")
	private WebElement addNav;
	
	@FindBy(xpath = "//*[@id=\"collapsibleNavbar\"]/a")
	private WebElement homeNav;
	
	@FindBy(xpath = "//*[@id=\"Para\"]")
	private WebElement deleteStatus;
	
	public void enterId(String text) {
		id.sendKeys(text);
	}
	
	public void enter() {
		submit.click();
	}
	
	public String deleteSuccesfull() {
		return deleteStatus.getText();
	}
	
	public String getPageName() {
		return pageName.getText();
	}
	
	public void dropdownShow() {
		dropdown.click();
	}
	
	public void viewNav() {
		viewNav.click();
	}
	
	public void addNav() {
		addNav.click();
	}
	
	public void updateNav() {
		updateNav.click();
	}
	
	public void homeNav() {
		homeNav.click();
	}
	
	

}
