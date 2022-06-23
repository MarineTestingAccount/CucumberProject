package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ManagerPageLStepDef{

    WebDriver driver;
    WebDriverWait wait;

    //Initialize Locators
    private final By
            addCustomerBtn = By.xpath("//button[@ng-click= 'addCust()'] ");

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
    @Given("I am on the Manager page")
    public void i_am_on_the_manager_page() {
        driver.get(Constants.MAIN_URL+"manager");
    }
    @When("I clicked on the Add Customer button")
    public void i_clicked_on_the_add_customer_button() {
        WebElement clickOnButton = driver.findElement(addCustomerBtn);
        clickOnButton.click();
    }
    @Then("I should navigate to the Add Customer page")
    public String i_should_navigate_to_the_add_customer_page() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.urlContains("addCust"));
        return driver.getCurrentUrl();
    }


}
