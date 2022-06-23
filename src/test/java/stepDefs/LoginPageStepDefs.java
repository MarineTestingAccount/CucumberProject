package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class LoginPageStepDefs{
        WebDriver driver;
        WebDriverWait wait;

        //Initialize Locators
        private final By
            bankManagerLoginBtn = By.xpath("//button[@ng-click = 'manager()']");
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After()
    public void closeBrowser() {
        driver.quit();
    }


        //Cucumber Steps
        @Given("I am on the Login page")
        public void i_am_on_the_login_page() {
            driver.get(Constants.MAIN_URL+"login");
        }
        @When("I clicked on the Bank Manager Login button")
        public void i_clicked_on_the_bank_manager_login_button() {
            WebElement clickOnButton = driver.findElement(bankManagerLoginBtn);
            clickOnButton.click();
        }
        @Then("I should navigate to the Manager page")
        public String i_should_navigate_to_the_manager_page() {
            wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
            wait.until(ExpectedConditions.urlContains("manager"));
            return driver.getCurrentUrl();
        }

}

