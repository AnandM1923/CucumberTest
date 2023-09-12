Feature: Login to the Application

Scenario: OrangeHRM Application Login

  Given Open the browser
  When Enter the URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And Enter the username and password
  And Click on the Login button
  Then Verify that login is successful
  And Close the browser
	

