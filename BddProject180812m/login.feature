Feature: Validate Login Credential
Background: 
Given open browser
And navigate to facebook url
@Smoke
Scenario: Login to Profile Page with valid Credentials


When user type userid on userid box
And user type password on password box
And user click on login button
Then  user should be in profile page
@Reg
Scenario: Login with invalid Credentials


When user type invalid userid on userid box
And user type invalid password on password box
And user click on login button
Then user should not  be in profile page
@Integration
Scenario: verify login button in enable 
When user will check is enable or not
Then if not user should get false return if yes user should get true return
 

