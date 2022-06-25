package pageObjects;

import Base.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Base.Constants.*;

public class ManagerPage {
    WebDriver driver;
    WebDriverWait wait;

    //Initialize Locators
    private final By
            addCustomerBtn = By.xpath("//button[@ng-click='addCust()'] ");

    public ManagerPage(WebDriver driver){
        this.driver = driver;
    }
    public void openManagerPage() {
            driver.get(MAIN_URL + MANAGER);
    }

    public void i_clicked_on_the_add_customer_button() {
        WebElement clickOnButton = driver.findElement(addCustomerBtn);
        clickOnButton.click();
    }

    public String i_should_navigate_to_the_add_customer_page() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.urlContains(ADD_CUSTOMER));
        return driver.getCurrentUrl();
    }
}
