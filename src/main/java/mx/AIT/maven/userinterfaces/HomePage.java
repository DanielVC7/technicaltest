package mx.AIT.maven.userinterfaces;

import mx.AIT.maven.appium.BaseAppium;
import org.openqa.selenium.By;

public class HomePage extends BaseAppium {

    public void addProduct(){
        //Click product
        driver.findElement(By.xpath("nameProduct")).click();
    }
}
