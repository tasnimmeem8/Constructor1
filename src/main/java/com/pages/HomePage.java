package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	By creatLeadLinkBtn = By.linkText("Create Lead");
	
	
	public HomePage (WebDriver driver ){
		this.driver=driver;
	}
	
	public void clickCrealLeadLinkBtn() {
		driver.findElement(creatLeadLinkBtn).click();
	}

}
