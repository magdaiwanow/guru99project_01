package pages;

import  org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99Login {
    WebDriver driver;
    By user99GuruName = By.name("uid");
    By user99GuruPassword = By.name("password");
    By titleText = By.className("barone");
    By loginButton = By.name("btnLogin");

    public Guru99Login (WebDriver driver) {
        this.driver = driver;
    }

    //set user name in user textbox
    public void setUserName (String strUserName){
        driver.findElement(user99GuruName).sendKeys(strUserName);
    }

    //set password in password textbox
    public void setPassword (String strPassword) {
        driver.findElement(user99GuruPassword).sendKeys(strPassword);
    }

     //click Login button
    public void clickLogin(){
       driver.findElement(loginButton).click();
    }

    //get Login page title
    public String getLoginPageTitle() {
        return driver.findElement(titleText).getText();
    }

    public void loginToGuru99 (String strUserName, String strPassword){
        //enter user name
        this.setUserName(strUserName);
        //enter password
        this.setPassword(strPassword);
        //click login button
        this.clickLogin();
    }
}
