package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Guru99NewCustomer {
    WebDriver driver;
    By newCustomerPageHeading = By.className("heading3");
    By customerName = By.name("name");
    By genderMale = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
    By genderFemale = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
    By dateOfBirth = By.name("dob");
    By address = By.name("addr");
    By city = By.name("city");
    By state = By.name("state");
    By mobileNo =  By.name("telephoneno");
    By email = By.name("emailid");
    By pin= By.name("pinno");
    By password=By.name("password");
    By btnSubmit = By.name("sub");


    public Guru99NewCustomer (WebDriver driver) {
        this.driver =driver;
    }

    //Get page heading
    public String getNewCustomerPageHeading () {
        System.out.println(driver.findElement(newCustomerPageHeading).getText());
        return driver.findElement(newCustomerPageHeading).getText();
    }

    //fill in the new customer details
    //customer name
    public void setCustomerName(String strCustomerName){
        driver.findElement(customerName).sendKeys(strCustomerName);
    }

    //gender
    public void setGenderToMale(){
        driver.findElement(genderMale).click();
    }

    public void setGenderToFemale(){
        driver.findElement(genderFemale).click();
    }

    //date of birth
    public void setDateOfBirth(String strDob) {
        driver.findElement(dateOfBirth).sendKeys(strDob);
    }

    //enter whole address
    public void setAddress (String strAddress, String strCity, String strState){
        driver.findElement(address).sendKeys(strAddress);
        driver.findElement(city).sendKeys(strCity);
        driver.findElement(state).sendKeys(strState);
    }

    //enter contact details
    public void setContactDetails(String strMobileNo, String strEmail){
        driver.findElement(mobileNo).sendKeys(strMobileNo);
        driver.findElement(email).sendKeys(strEmail);
    }

    //enter password and PIN
    public void setPinAndPassword(String strPin, String strPassword){
        driver.findElement(pin).sendKeys(strPin);
        driver.findElement(password).sendKeys(strPassword);
    }

    public void submiitNewCustomer(){
        driver.findElement(btnSubmit).click();
    }

}


