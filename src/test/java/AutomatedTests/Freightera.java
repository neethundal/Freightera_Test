package AutomatedTests;

import PageObjects.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Freightera {

    private WebDriver driver;

    BasePage basePage;
    CarrierInfo carrierInfo;
    CarrierSignUpPage carrierSignUpPage;
    LoginPage loginPage;
    RecoverCredentialsPage recoverCredentialsPage;
    ShipperInfo shipperInfo;
    ShipperSignUpPage shipperSignUpPage;
    UserAccount userAccount;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver, "https://www.freightera.com/login", "Login Page");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void cannotLogInWithIncorrectAccount() {
        loginPage.get();
        loginPage.signInWith(new UserAccount("username", "password"));

        assertTrue(loginPage.incorrectUserNameOrPassword() == true);
    }

    private void assertTrue(boolean b) {
    }

    public void signUp() {
        shipperSignUpPage.signUp(new ShipperInfo());
        loginPage.get();
        loginPage.signInWith(new UserAccount("",""));
    }

    public void forgotUserName() {
    }

    public void forgotPassword() {

    }


}


