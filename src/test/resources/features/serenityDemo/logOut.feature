Feature: Login to Application

	Scenario: Login with valid credentials
	Given user is on home page
	When user enter admin as username
	And user enter admin123 as password
	Then user should be able to login
	Then user should able to logout