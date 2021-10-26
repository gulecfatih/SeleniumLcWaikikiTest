package test;

import base.BaseTest;
import org.junit.Test;
import page.BeforeLoginPage;

public class LcwaikikiTest extends BaseTest {
    @Test
    public void searchTest(){
        new BeforeLoginPage(driver)
                .ClickLogin()
                .SuccessLogin()
                .SearchProduct()
                .More()
                .SelectRandomProduct()
                .ChoseSize()
                .AddBasket()
                .ChooseProduct()
                .DeleteProduct();
    }

}
