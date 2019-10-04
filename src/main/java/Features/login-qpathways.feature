Feature: Login To Qpathways 

Scenario: Test Login With Valid Credintials 
	Given open chrome and start qpathways 
	When i enter valid username and password 
	Then user should be able to login sucsessfully 
