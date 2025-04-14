package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class PODemoDashboardPage extends PageObject {

	
	public void enterUsername() {
		// TODO Auto-generated method stub
		$(By.name("username")).type("admin");
	}

//	public void enterPassword() {
//		// TODO Auto-generated method stub
//		$(By.name("password")).type("admin123");
//	}
	
	
	public void loginVerified() {
		// TODO Auto-generated method stub
			System.out.println(getDriver().getTitle());
	}
	
	public void logoutVerified() {
		// TODO Auto-generated method stub
			$(By.xpath("//p[@class='oxd-userdropdown-name' and text()='Arthur Antunes']")).click();
			$(By.xpath("//a[text()='Logout']")).click();
			$(By.xpath("//h5[text()='Login']")).isDisplayed();
			System.out.println("logout verified");
	}
	
	
}
