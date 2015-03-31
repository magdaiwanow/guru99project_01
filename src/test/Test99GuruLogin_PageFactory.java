import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import page_factory.Guru99HomePage_PageFactory;

import page_factory.Guru99Login_PageFactory;



public class Test99GuruLogin_PageFactory {

    WebDriver driver;
    Guru99Login_PageFactory objLogin;
    Guru99HomePage_PageFactory objHomePage;

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
    }
    @Test
    public void testHomePageAppearsCorrect(){

        // create Login page object
        objLogin = new Guru99Login_PageFactory(driver);

        //verify login page
        String loginPageTitle = objLogin.getLoginPageTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

        //login to application, credentials valid until 24/03/15
        objLogin.loginToGuru99Page("mngr10111","mavUsUr");

        //go to the next page
        objHomePage = new Guru99HomePage_PageFactory(driver);

        //verify home page
        Assert.assertTrue(objHomePage.getUserNameFromHomePage().toLowerCase().contains("manger id : mngr10111"));

        //close the browser
        driver.quit();
    }



}
