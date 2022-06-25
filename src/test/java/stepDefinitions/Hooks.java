package stepDefinitions;


import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.ManagerPage;
import java.time.Duration;

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    public class Hooks {
        protected WebDriver driver;
        protected LoginPage loginPage;
        protected ManagerPage managerPage;
        protected AddCustomerPage addCustomerPage;

    @BeforeAll
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterAll()
    public void closeBrowser() {
        driver.quit();
    }
}
