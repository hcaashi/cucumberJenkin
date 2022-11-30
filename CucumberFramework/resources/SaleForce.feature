Feature: Login Scenarions of Saleforce Application

Scenario: Login into saleforce with valid username and password
Given User Launch the saleforce application
When user enter username "jnanesh.m@tekarch.com"
And user enter password "Test@123"
And Click on RememberMe
Then Click on login button 

Scenario: Login into saleforce with valid username and password
Given User Launch the saleforce application
When user enter username "jnanesh.m1@tekarch.com"
And user enter password "Test@123"
And Click on RememberMe
Then Click on login button 