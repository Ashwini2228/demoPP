Feature:Login
	
	Scenario: Successful login with valid credentials
	Given User launch chromebrowser
	When User opens "http://automationpractice.com/index.php/login"
	And User enters a email address as "DumDummy77@gmail.com" and password as "Dum7Dum77"
	And click on login
	Then Page title will be "Your Logo"
	When User click on Sign out link
	Then Page title should be "Your logo.Sign in"
	And Close browser