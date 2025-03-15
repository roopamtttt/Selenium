package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    @Test
    public void loginpagetitleTest(){
        String actualTitle = loginpage.getTitle();
        Assert.assertEquals(actualTitle,"Selenium Test Page | Automation in Testing");
    }
}


// WEbDriver  driver = new ChromeDriver;
// driver.getTitle();