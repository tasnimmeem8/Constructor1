package com.Runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pages.CreateLeadPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.WelcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner {
public ChromeDriver driver;
	
@Test
public void leafTaps() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLoginBtn();
		
		WelcomePage wp = new WelcomePage(driver);
		wp.clickCRMSFALink();
		
		HomePage hp = new HomePage(driver);
		hp.clickCrealLeadLinkBtn();
		
		CreateLeadPage cp = new CreateLeadPage(driver);
		cp.enterCompanyName();
		cp.enterFirstName();
		cp.enterLastName();
		cp.chooseSource();
		cp.chooseMarketingCampaign();
		cp.enterTite();

	}

}
