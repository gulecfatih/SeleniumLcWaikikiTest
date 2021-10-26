package constants;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPageConstants extends BaseMethod {
    public BasketPageConstants(WebDriver driver) {
        super(driver);

    }
    public By UP =  By.cssSelector(" .oq-up");
    public By NUMBERUNITS =  By.cssSelector(".item-quantity-input");
    public By DELETE =  By.className("cart-square-link");
    public By POPDELETE =  By.className("inverted-modal-button sc-delete ins-init-condition-tracking");
    public By CHECKEMPTYBASKET =  By.className("cart-empty-title");


}
