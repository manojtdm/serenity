package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class PODemoHomePage extends PageObject{
	
	

	public void enterUsername() {
		// TODO Auto-generated method stub
		$(By.name("username")).type("admin");
	}

	public void enterPassword() {
		// TODO Auto-generated method stub
		$(By.name("password")).type("admin123");
	}
	
	public void clickOnLoginButton() {
		// TODO Auto-generated method stub
		$(By.xpath("//button[contains(@text(), Login)]")).click();
	}
	

}
