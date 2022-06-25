Feature: As a Bank manager, I want be able
         add new customer into the app

  Scenario Outline: Fill form fields with values
    Given I am on the Add Customer page
    When I fill the First Name field with {fName} value
    And I fill the Last Name field with {lName} value
    And I fill the Post Code field with {postCd} value
    And I clicked on the Add customer button
    Then I should Accept the opened alert popup

    Examples:
      |fName  |lName|postCd
      |Alex   |Harry|123456


