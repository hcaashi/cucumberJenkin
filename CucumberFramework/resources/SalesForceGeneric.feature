Feature: Login Features 

Scenario: Login with valid username and valid password
Given User is on "LoginPage"
When User enter into text box "Username" "jnanesh.m@tekarch.com"
When User enter into text box "Password" "Test@123"
Then User Clicks on CheckBox "RememberM"
Then User Clicks on Button "Login"


Scenario: Login with valid username and Invalid password
Given User is on "LoginPage"
When User enter into text box "Username" "jnanesh.m@tekarch.com"
When User enter into text box "Password" "Test@1231"
Then User Clicks on CheckBox "RememberMe"
Then User Clicks on Button "Login"