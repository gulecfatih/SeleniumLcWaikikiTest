package page;

import constants.LoginConstants;
import org.openqa.selenium.WebDriver;

public class LoginPage extends LoginConstants {
    public LoginPage(WebDriver driver) {
        super(driver);

    }
    public MainPage searchProduct(){
        getElementBy(SEARCHINPUT).click();
        getElementBy(SEARCHINPUT).sendKeys("pantolon");
        getElementBy(FIND).click();
        return new MainPage(driver);
    }
}
