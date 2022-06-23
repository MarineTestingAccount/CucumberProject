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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddCustomerStepDef{


    WebDriver driver;
    WebDriverWait wait;

    private final By
            fName = By.xpath("//input[@ng-model= 'fName']"),
            lName = By.xpath("//input[@ng-model= 'lName']"),
            postCode = By.xpath("//input[@ng-model= 'postCd']"),
            submitBtn = By.xpath("//button[@type= 'submit']");
            //customersTabBtn = By.xpath("//button[@ng-click = 'showCust()']");
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

    @Given("I am on the Add Customer page")
    public void i_am_on_the_add_customer_page() {
        driver.get(Constants.MAIN_URL+"addCust");
        wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        wait.until(ExpectedConditions.urlContains("addCust"));

    }
    @When("I fill First Name field with value")
    public void i_fill_first_name_field_with_value() {
        WebElement setFirstName = driver.findElement(fName);
        setFirstName.sendKeys("Marine");
    }
    @When("I fill Last Name field with value")
    public void i_fill_last_name_field_with_value() {
        WebElement setLastName = driver.findElement(lName);
        setLastName.sendKeys("Melk");

    }
    @When("I fill Post Code field with")
    public void i_fill_post_code_field_with() {
        WebElement setPostCode = driver.findElement(postCode);
        setPostCode.sendKeys("123456789");

    }
    @When("I clicked the Add customer button")
    public void i_clicked_the_add_customer_button() {
        WebElement clickOnTheBtn = driver.findElement(submitBtn);
        clickOnTheBtn.click();

    }
//    @When("I clicked on the Customers tab button")
//    public void i_clicked_on_the_customers_tab_button() {
//        WebElement clickOnTheBtn = driver.findElement(customersTabBtn);
//        clickOnTheBtn.click();
//    }
    @Then("I should Accept the alert popup")
    public void i_should_Accept_the_alert_popup() {
        driver.switchTo().alert().accept();

    }



}
