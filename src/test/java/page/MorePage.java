package page;

import base.BaseMethod;
import constants.MorePageConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class MorePage extends MorePageConstants {
    public MorePage(WebDriver driver) {
        super(driver);
    }

    public DetailPage selectRandomProduct(){

        List<WebElement> productElems = driver.findElements(PRODUCT);
        int maxProducts = productElems.size();
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        productElems.get(randomProduct).click();
        return new DetailPage(driver) ;
    }





}
