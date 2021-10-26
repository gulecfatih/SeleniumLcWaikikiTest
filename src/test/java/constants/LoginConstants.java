package constants;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.MainPage;

public class LoginConstants extends BaseMethod {
    public LoginConstants(WebDriver driver) {
        super(driver);
    }

    public By SEARCHINPUT = By.id("search_input");
    public By FIND = By.className("searchButton");

}
