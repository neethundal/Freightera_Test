package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.LoginPage.Element;



public class ShipperSignUpPage extends BasePage {
	

	Element elements = new Element();
	
	public ShipperSignUpPage(WebDriver driver, String locator, String pageName) {
	    	super(driver, locator, pageName);
	    	}
	
	class Element{
		
		private final By NAME = By.xpath("//*[@id=\"SignInFirstName\"]");
		private final By LASTNAME = By.xpath("//*[@id=\"SignInLastName\"]");
		private final By COMPANY_NAME = By.xpath("//*[@id=\"SignInCompany\"]");
		private final By COMPANY_WEBSITE = By.xpath("//*[@id=\"CompanyWebsite\"]");
		private final By BUSINESS_EMAIL = By.xpath("//*[@id=\"SignInEmail\"]");
		private final By PHONE_NUMBER = By.xpath("//*[@id=\"SignInPhone\"]");
		private final By SIGNUP = By.xpath("//*[@id=\"RegisterAccount\"]/div[4]/div/button");
				
				
		
	}
	
	public void signUp(ShipperInfo shipperInfo)
	{
       //TODO
	}

}
