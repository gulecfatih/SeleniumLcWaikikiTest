package page;

import constants.MainConstants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class MainPage extends MainConstants {
    public MainPage(WebDriver driver) {
        super(driver);


    }

    public MainPage More(){
        scrollElementBy(MORE);
        getElementBy(MORE).click();
        Assert.assertTrue("Daha fazla butonu gorulmedi", driver.findElement(MORE).isDisplayed());
        return this;
    }

    public DetailPage SelectRandomProduct(){

        List<WebElement> productElems = driver.findElements(PRODUCT);
        int maxProducts = productElems.size();
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        productElems.get(randomProduct).click();
        return new DetailPage(driver) ;
    }


}
