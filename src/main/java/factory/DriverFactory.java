package factory;

import exceptions.BrowserException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class DriverFactory {

    WebDriver driver;

    public WebDriver initDriver(String browser){
        System.out.println("browser name "+ browser);

        switch (browser.toLowerCase().trim()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;

            default:
                System.out.println("please pass the right browaer"+ browser);
                throw new BrowserException("INVALID BROWSER NAME "+ browser);
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://automationintesting.com/selenium/testpage/");

        return driver;
    }
}
