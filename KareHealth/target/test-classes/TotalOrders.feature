@tag
Feature: Click on TotalOrders
  

  @tag1
  Scenario: Click on TotalOrders
    Given user is logged in
    And user is on Dashboard screen
    When user clicks on TotalOrders
    Then Orders List is displayed
    
