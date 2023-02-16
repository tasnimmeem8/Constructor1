package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPage {
	
	WebDriver driver;
	
	By CompanyName = By.id("createLeadForm_companyName");
	By FirstName = By.id("createLeadForm_firstName");
	By LastName = By.id("createLeadForm_lastName");
	By Source = By.id("createLeadForm_dataSourceId");
	By MarketingCampaign = By.id("createLeadForm_marketingCampaignId");
	By Title = By.id("createLeadForm_generalProfTitle");
	
	
	
    public	CreateLeadPage (WebDriver driver){
		this.driver=driver;
	}

       public void enterCompanyName() {
	      driver.findElement(CompanyName).sendKeys("ABC");
}
       public void enterFirstName() {
	      driver.findElement(FirstName).sendKeys("Hema");
}
       public void enterLastName() {
	      driver.findElement(LastName).sendKeys("Mali");
}
       public void chooseSource() {
	     WebElement ele = driver.findElement(Source);
	     Select dd = new Select(ele);
	     dd.selectByVisibleText("Direct Mail");
}
       public void chooseMarketingCampaign() {
    	   WebElement ele1 = driver.findElement(MarketingCampaign);
    	   Select dd1 = new Select(ele1);
    	   dd1.selectByVisibleText("Car and Driver");
       }
       public void enterTite() {
    	   driver.findElement(Title).sendKeys("Mrs.");
       }
       

}
