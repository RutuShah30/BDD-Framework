
Feature: Login page feature
  @tag1
  Scenario: login with correct credentials
    Given user is on login page
    When user enters username "admin"
    And user enters password "admin"
    And user clicks on login button
    Then user gets the title of the home page
    And page title should be "Admin|Dashboard"
	@tag2
    Scenario: Click on TotalOrders
    	Given user is on Dashboard page
    	When user clicks on TotalOrders button
    	Then user gets Order List