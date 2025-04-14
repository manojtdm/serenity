package pages;

import net.serenitybdd.annotations.Step;

public class DashboardPage {

	PODemoDashboardPage dashboardPage;
	
	@Step
	public void verifyLogin() {
		// TODO Auto-generated method stub
			dashboardPage.loginVerified();
	}
	
	@Step
	public void verifyLogout() {
		// TODO Auto-generated method stub
			dashboardPage.logoutVerified();
	}

}
