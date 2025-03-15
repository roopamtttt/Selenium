package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // 1 private By locators : PageObject

    private By Username = By.id("firstname");
    private By Password = By.id("surname");
    private By lodingButton = By.xpath("//button[@id='submitbutton']");

    // 2 Constructor

    public LoginPage(WebDriver driver){
        this.driver = driver;

    }
    //3
    public String getTitle(){
        String title =  driver.getTitle();
        System.out.println("LoginPage"+title);
        return title;
    }

    public String getLoginPageUrl(){
        String url =  driver.getCurrentUrl();
        System.out.println("LoginPage"+url);
        return url;
    }

    public String doLogin(String username , String password){
        driver.findElement(Username).sendKeys(username);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(lodingButton).click();
        return driver.getTitle();
    }
}
