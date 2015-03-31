package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Guru99HomePage {
    WebDriver driver;
    By homePageUserName = By.xpath("//table//tr[@class='heading3']");
    By newCustomerMenuOption = By.linkText("New Customer");


    public Guru99HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Get user name from home page
    public String getUserNamefromHomePage() {
        System.out.println(driver.findElement(homePageUserName).getText());
        return driver.findElement(homePageUserName).getText();

    }

    public void clickNewCustomer(){
        driver.findElement(newCustomerMenuOption).click();
    }
        
}
