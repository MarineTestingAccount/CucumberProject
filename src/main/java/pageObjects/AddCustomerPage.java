package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Base.Constants.*;
import java.time.Duration;
public class AddCustomerPage {
    WebDriver driver;
    WebDriverWait wait;
    private final By
            fName = By.xpath("//input[@ng-model='fName']"),
            lName = By.xpath("//input[@ng-model='lName']"),
            postCode = By.xpath("//input[@ng-model='postCd']"),
            submitBtn = By.xpath("//button[@type='submit']"),
            customersTabBtn =By.xpath("//button[@ng-click ='showCust()']");

    public AddCustomerPage(WebDriver driver){
        this.driver = driver;
    }
    public void i_am_on_the_add_customer_page() {
        driver.get(MAIN_URL + ADD_CUSTOMER);
        wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.urlContains(ADD_CUSTOMER));
    }

    public void setFName() {
        WebElement setFirstName = driver.findElement(fName);
        setFirstName.sendKeys("Marine");
    }

    public void setLName() {
        WebElement setLastName = driver.findElement(lName);
        setLastName.sendKeys("Melk");

    }

    public void setPostCode() {
        WebElement setPostCode = driver.findElement(postCode);
        setPostCode.sendKeys("123456789");

    }
     public void clickOnSubmitBtn() {
      WebElement clickOnTheBtn = driver.findElement(submitBtn);
        clickOnTheBtn.click();

    }
        public void clickOnCustomersTabBtn() {
        WebElement clickOnTheBtn = driver.findElement(customersTabBtn);
        clickOnTheBtn.click();
    }
        public void acceptPopUp() {
        driver.switchTo().alert().accept();

    }
}
