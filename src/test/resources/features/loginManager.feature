Feature: As a Bank manager, I want to be able login into app

  Scenario: Navigate to the Manager page
    Given I am on the Login page
    When I clicked on the Bank Manager Login button
    Then I should navigate to the Manager page

  Scenario: Navigate to the Add Customer page
    Given I am on the Manager page
    When I clicked on the Add Customer button
    Then I should navigate to the Add Customer page

