package page;

import constants.BeforeLoginConstants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BeforeLoginPage extends BeforeLoginConstants {
    public BeforeLoginPage(WebDriver driver) {super(driver);
    }

    public BeforeLoginPage ClickLogin() {

        getElementBy(NAVBARLOGIN).click();


        return this;
    }

    public LoginPage SuccessLogin(){

        getElementBy(EMAIL).sendKeys("gulec8062@gmail.com");
        getElementBy(PASSWORD).sendKeys("fatih.12345");
        getElementBy(SUBMIT).click();
        Assert.assertTrue("Hesabim goruldu", driver.findElement(MYACCOUNT).getText().equals("Hesabım"));
        return new LoginPage(driver);
    }

}
