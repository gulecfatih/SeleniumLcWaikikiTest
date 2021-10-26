package page;

import constants.BasketPageConstants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BasketPage extends BasketPageConstants {
    public BasketPage(WebDriver driver) {
        super(driver);


    }

    public BasketPage ChooseProduct() {

        getElementBy(UP).click();

        String checkunit = getElementBy(NUMBERUNITS).getText();
        if(checkunit.equalsIgnoreCase("2"))
            System.out.println("Urun miktarı 2 dir");
        else
            System.out.println("Urun miktarı 2 değildir");
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        return this;
    }
    public BasketPage DeleteProduct() {

        getElementBy(DELETE).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(POPDELETE).click();
        Assert.assertTrue("Urun silinmedi", driver.findElement(CHECKEMPTYBASKET).getText().equals("Sepetinizde ürün bulunmamaktadır."));
        return this;
    }



}
