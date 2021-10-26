package constants;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MorePageConstants extends BaseMethod {
    public MorePageConstants(WebDriver driver) {
        super(driver);
    }
    public By PRODUCT = By.className("a_model_item");



}
