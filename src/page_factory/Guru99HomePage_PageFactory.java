package page_factory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class Guru99HomePage_PageFactory {

    WebDriver driver;

    @FindBy(xpath="//table//tr[@class='heading3']")
    WebElement homePageUserName;

    public Guru99HomePage_PageFactory(WebDriver driver) {
        this.driver = driver;

        //initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    //Get User name from home page

    public String getUserNameFromHomePage(){
        return homePageUserName.getText();
    }

}
