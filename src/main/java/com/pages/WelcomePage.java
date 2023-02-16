package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
WebDriver driver;	
	By crmsfaLink = By.linkText("CRM/SFA");
	
	
	public WelcomePage(WebDriver driver) {
		this.driver=driver;
	}
	

	public void clickCRMSFALink() {
		
		driver.findElement(crmsfaLink).click();
	}
}
