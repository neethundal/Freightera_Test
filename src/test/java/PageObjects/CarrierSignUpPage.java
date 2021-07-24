package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class CarrierSignUpPage extends BasePage{
	

	Element elements = new Element();
	
	public CarrierSignUpPage(WebDriver driver, String locator, String pageName) {
	    	super(driver, locator, pageName);
	    	}
	
	public void signUp(CarrierInfo carrierInfo) {
	
		//TODO
	}
	
	class Element {
		//Master Account Info
		By USER_NAME = By.xpath("");
		By CREATE_PASSWORD = By.xpath("");
		By RETYPE_PASSWORD = By.xpath("");
		By FIRST_NAME = By.xpath("");
		By LAST_NAME = By.xpath("");
		
		
		//Company Info
		By COMPANY_NAME = By.xpath("");
		By COMPANY_WEBSITE = By.xpath("");
		By ADDRESS_1 = By.xpath("");
		By ADDRESS_2 = By.xpath("");
		By CITY = By.xpath("");
		By POSTAL_CODE = By.xpath("");
		By COUNTRY = By.xpath("");
		By PROVINCE = By.xpath("");
		By PHONE = By.xpath("");
		By ALT_PHONE = By.xpath("");
		By AFTER_HOURS_PHONE = By.xpath("");
		By FAX = By.xpath("");
		By ACCOUNTING_CONTACT_NAME = By.xpath("");
		By ACCOUNTING_CONTACT_PHONE_NUMBER = By.xpath("");
		By ACCOUNTING_CONTACT_EMAIL = By.xpath("");
		By INSURANCE_EXPIRY_DATE = By.xpath("");
		By UPLOAD_INSURANCE = By.xpath("");
		By EXPIRY_DATE_OF_RATES_TARIFF = By.xpath("");
		By UPLOAD_RATES_TARIFF = By.xpath("");
		By UPLOAD_RULES_TARIFF = By.xpath("");
			
		//Contact Info
		By OPERATING_HOURS_FROM = By.xpath("");
		By OPERATING_HOURS_TO = By.xpath("");
		By DISPATCHING_HOURS_FROM = By.xpath("");
		By DISPATCHING_HOURS_TO = By.xpath("");
		By CURRENCY = By.xpath("");
		By TERMS = By.xpath("");
		
		//MORE  INFO
		By ESTABLISHED_DATE = By.xpath("");
		By YEARS_UNDER_CURRENT_MANAGEMENT = By.xpath("");
		By NUMBER_OF_EMPLOYEES = By.xpath("");
		By NUMBER_OF_TRUCKS = By.xpath("");
		
	}

}
