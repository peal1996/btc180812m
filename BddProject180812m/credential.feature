Feature: Login Validation

Scenario Outline:Login Crendentails 
Given open browser
And navigate to facebook url
When user type "<userid>" on userid box
And user type "<password>" on password box
And user click on login button
Then  user should be in profile page
Examples: 
|userid |password|
|user1|12345|
|user2|94999|
