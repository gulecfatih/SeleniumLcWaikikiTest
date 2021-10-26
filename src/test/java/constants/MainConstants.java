package constants;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainConstants extends BaseMethod {
    public MainConstants(WebDriver driver) {
        super(driver);
    }

    public By MORE = By.className("lazy-load-button");
    public By PRODUCT = By.className("a_model_item");

}
