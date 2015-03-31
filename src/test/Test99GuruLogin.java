
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.Guru99HomePage;

import pages.Guru99Login;
import pages.Guru99NewCustomer;


public class Test99GuruLogin {
    WebDriver driver;
    Guru99HomePage objHomePage;
    Guru99Login objLogin;
    Guru99NewCustomer objNewCustomer;


    @BeforeTest
    public void setup () {
        //System.setProperty("webdriver.chrome.driver", "C:/Users/miwanow/Desktop/chromedriver_win32/chromedriver.exe");
        //driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
        driver.manage().window().maximize();
    }

    @Test(priority=0)
    public void testHomePageAppearsCorrectly(){

        // create login page object
        objLogin = new Guru99Login(driver);

        //verify login page title
        String loginPageTitle = objLogin.getLoginPageTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

        // login to the application
        objLogin.loginToGuru99("mngr10111","mavUsUr");

        //go to the next(home) page
        objHomePage = new Guru99HomePage(driver);

        //verify home page
        Assert.assertTrue(objHomePage.getUserNamefromHomePage().toLowerCase().contains("manger id : mngr10111"));

        //click New Customer option
         objHomePage.clickNewCustomer();

        //verify new customer page
        objNewCustomer = new Guru99NewCustomer(driver);
        String newCustomerPageTitle = objNewCustomer.getNewCustomerPageHeading();
        Assert.assertTrue(newCustomerPageTitle.toLowerCase().contains("add new customer"));

        //setName
        objNewCustomer.setCustomerName("name");

        //setGender
        objNewCustomer.setGenderToFemale();

        //set contact details
        objNewCustomer.setContactDetails("000000","123@er.pl");

        //set address
        objNewCustomer.setAddress("ulica 20", "Miasto", "Stan");

        //set date of birth
        objNewCustomer.setDateOfBirth("12"+"-"+"03"+"-"+"1980");

        //set pin and password
        objNewCustomer.setPinAndPassword("145556", "password12!");

        //submit new customer
        objNewCustomer.submiitNewCustomer();



        //close web browser
       // driver.quit();
    }
}


