package constants;

import base.BaseMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainConstants extends BaseMethod {
    public MainConstants(WebDriver driver) {
        super(driver);
    }
    public By More = By.className("lazy-load-button");

    //public By PRODUCT = By.className("sc-1nx8ums-0 chVxFF");
    //public By PRICETEXT = By.id("sp-price-discountPrice");
    //public By ADDBASKET = By.className("control-button gg-ui-button plr10 gg-ui-btn-default");
    //public By GOBASKET = By.className("notify-user basket-item-count");
    //public By BASKETPRICE = By.className("extra-discounted");

}
