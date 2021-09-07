package mx.AIT.maven.userinterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import mx.AIT.maven.appium.BaseAppium;

public class Login extends BaseAppium {
	public void login() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//Click option the name user
		driver.findElement(By.id("nameUser")).click();
		//Click option the name user
		driver.findElement(By.id("buttonSubmit")).click();
	}
}
