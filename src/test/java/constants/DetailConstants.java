package constants;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailConstants extends BaseMethod {
    public DetailConstants(WebDriver driver) {
        super(driver);
    }
    public By SIZE = By.cssSelector(".hidden-mobile [key='1']");
    public By GOBASKET = By.id("pd_add_to_cart");
    public By PRICETEXT = By.className("price");
    public By BASKETPRICE = By.id("cartLastTotal");
    public By ADDBASKET = By.className("header-cart");



}
