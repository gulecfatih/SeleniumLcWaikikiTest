package test;

import base.BaseTest;
import org.junit.Test;
import page.BeforeLoginPage;

public class LcwaikikiTest extends BaseTest {
    @Test
    public void searchTest(){
        new BeforeLoginPage(driver)
                .clickLogin()
                .successLogin()
                .searchProduct()
                .More()
                .selectRandomProduct();



    }

}
