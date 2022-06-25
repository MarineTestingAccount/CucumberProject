package pageObjects;

import Base.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Base.Constants.*;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    //Initialize Locators
    private final By
            bankManagerLoginBtn = By.xpath("//button[@ng-click = 'manager()']");

    public void openLoginPage() {
        driver.get(Constants.MAIN_URL+LOGIN);
    }
    public void clickOnTheLoginBtn() {
        WebElement clickOnButton = driver.findElement(bankManagerLoginBtn);
        clickOnButton.click();
    }
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public String navigateToTheManagerPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.urlContains(MANAGER));
        return driver.getCurrentUrl();
    }
}
