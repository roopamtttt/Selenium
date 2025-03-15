package base;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.LoginPage;

public class BaseTest {

    WebDriver driver;
    DriverFactory df;
    protected LoginPage loginpage;

    @BeforeTest
    public void setup(){
        df = new DriverFactory();
        driver = df.initDriver("Chrome");
        loginpage = new LoginPage(driver);

    }

    @AfterTest
    public void tesrDown(){
        driver.quit();
    }

}
