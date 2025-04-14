package pages;

import net.serenitybdd.annotations.Step;

public class HomePage {

		PODemoHomePage homePage;
	
	@Step
	public void openApplication() {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
		homePage.open();
		
	}
	
	@Step
	public void enterUsername() {
		// TODO Auto-generated method stub
		homePage.enterUsername();
	}
	
	@Step
	public void enterPassword() {
		// TODO Auto-generated method stub
		homePage.enterPassword();
	}
	
	@Step
	public void clickOnLoginButton() {
		// TODO Auto-generated method stub
		homePage.clickOnLoginButton();
	}
	
}
