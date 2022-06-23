Feature: Add new customer, search and delete

  Scenario: Navigate to the Manager page
    Given I am on the Login page
    When I clicked on the Bank Manager Login button
    Then I should navigate to the Manager page


  Scenario: Navigate to the Add Customer page
    Given I am on the Manager page
    When I clicked on the Add Customer button
    Then I should navigate to the Add Customer page

  Scenario: Add Customer
    Given I am on the Add Customer page
    When I fill First Name field with value
    And I fill Last Name field with value
    And I fill Post Code field with
    And I clicked the Add customer button
    Then I should Accept the alert popup