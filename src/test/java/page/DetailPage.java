package page;

import constants.DetailConstants;
import org.openqa.selenium.WebDriver;

public class DetailPage extends DetailConstants {
    public DetailPage(WebDriver driver) {
        super(driver);
    }


    public DetailPage ChoseSize(){

        getElementBy(SIZE).click();
        return this;

    }



    public BasketPage AddBasket() {
        String product_price = driver.findElement(PRICETEXT).getText();
        getElementBy(GOBASKET).click();

        String basket_price = driver.findElement(BASKETPRICE).getText();
        if(product_price.equalsIgnoreCase(basket_price))
            System.out.println("Urun fiyati urun sayfasindaki ile aynı");
        else
            System.out.println("Urun fiyati urun sayfasindaki ile aynı degil");
        getElementBy(ADDBASKET).click();


        return new BasketPage(driver);
    }


}
