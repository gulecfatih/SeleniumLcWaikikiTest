package constants;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BeforeLoginConstants extends BaseMethod {
    public BeforeLoginConstants(WebDriver driver) { super(driver); }

    public By NAVBARLOGIN = By.className("dropdown-toggle");


    public By EMAIL = By.id("LoginEmail");
    public By PASSWORD = By.id("Password");
    public By SUBMIT = By.id("loginLink");
    public By MYACCOUNT = By.className("dropdown-label"); //index 0

}
