package mx.AIT.maven.userinterfaces;

import mx.AIT.maven.appium.BaseAppium;
import org.openqa.selenium.By;

public class CartPage extends BaseAppium {
    public void checkProduct(){
        driver.findElement(By.xpath("buttonCart")).click();
        //Click button Check
        driver.findElement(By.xpath("OptionCheck")).click();
    }

    public void finishCheck(){
        driver.findElement(By.xpath("nameUser")).clear();
        driver.findElement(By.xpath("nameUser")).sendKeys("nameUser");
        driver.findElement(By.xpath("lastName")).clear();
        driver.findElement(By.xpath("lastName")).sendKeys("LastName");
        driver.findElement(By.xpath("ZIP")).clear();
        driver.findElement(By.xpath("ZIP")).sendKeys("123456");
        driver.findElement(By.xpath("finishSale")).click();
    }
}
