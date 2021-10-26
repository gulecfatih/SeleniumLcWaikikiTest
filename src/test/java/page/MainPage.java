package page;

import constants.MainConstants;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class MainPage extends MainConstants {
    public MainPage(WebDriver driver) {
        super(driver);


    }

    public MorePage More(){
        scrollElementBy(More);
        getElementBy(More).click();
        Assert.assertTrue("2. sayfa gorulmedi", driver.findElement(More).isDisplayed());
        return new MorePage(driver);
    }

}
