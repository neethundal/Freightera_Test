package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {
	

	Element elements = new Element();
	
	public LoginPage(WebDriver driver, String locator, String pageName) {
	    	super(driver, locator, pageName);
	    	}
	
	class Element {
		
		private final By LOGIN_EMAIL = By.xpath("//*[@id=\"LoginFormEmail\"]");
		private final By PASSWORD = By.xpath("//*[@id=\"LoginFormPassword\"]");
		
		private final By LOGIN_BUTTON = By.xpath("//*[@id=\"LoginForm\"]/div[4]/button");
		private final By FORGOT_PASSWORD = By.xpath("//*[@id=\"LoginForm\"]/div[5]/a");
		
		private final By  INCORRECT_INFO_ERROR  = By.xpath("//*[@id=\"LoginForm\"]/div[1]/span");
			
	}
		
		public void signInWith(UserAccount userAccount) {		
			
			WebElement username = driver.findElement(elements.LOGIN_EMAIL);
			username.clear();
			username.sendKeys(userAccount.getUserName(), Keys.TAB);

			WebElement password = driver.findElement(elements.PASSWORD);
			username.clear();
			password.sendKeys(userAccount.getPassword(), Keys.TAB);

			WebElement login = driver.findElement(elements.LOGIN_BUTTON);
			login.click();		
					 
		}
		
		public boolean incorrectUserNameOrPassword() {
			WebElement label = driver.findElement(elements.INCORRECT_INFO_ERROR);
			return label.isDisplayed();
		}
	}
			 
	
	

