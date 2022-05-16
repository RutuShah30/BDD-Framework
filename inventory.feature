Feature: Inventory Test

  Scenario Outline: Add Brand and Test record

    Given admin is in add brand page
    When he adds brand with fields "<Brand Name>", "<Brand Image>"
    #And Submit to add Brand
    Then the brand should be added
    Then adminuser should Logout

    Examples:
    | Brand Name | Brand Image|
    | Brand1       |  C:\Users\mrman\OneDrive - Phoenix Accountancy Service Ltd\Pictures|

Scenario: Verify filter option on Inventory Brand

  Given admin is in brand list page
  When he clicks on Filter button
  And selects only Id column
  Then the list with ID and Action column should be displayed
  Then the user should Logout


