package page_factory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class Guru99Login_PageFactory {

    WebDriver driver;

    @FindBy(name="uid")
    WebElement user99GuruName;

    @FindBy(name="password")
    WebElement password99Guru;

    @FindBy(className = "barone")
    WebElement pageTitleText;

    @FindBy(name="btnLogin")
    WebElement loginButton;

    public Guru99Login_PageFactory(WebDriver driver) {
        this.driver = driver;

        //initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    //set user name in text box
    public void enterUserName(String strUserName) {
        user99GuruName.sendKeys(strUserName);
    }

    //set password in password textbox
    public void setPassword (String strPassword) {
        password99Guru.sendKeys(strPassword);
    }

    //click login button
    public void clickLogin()
    {
        loginButton.click();
    }

    //get title of login page
    public String getLoginPageTitle () {
       return pageTitleText.getText();
    }

    public void loginToGuru99Page (String strUserName, String strPassword){
        //fill user name
        this.enterUserName(strUserName);

        //fill in password
        this.setPassword(strPassword);

        //click login button
        this.clickLogin();
    }
}
