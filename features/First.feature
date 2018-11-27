Feature: Login feature

  Scenario: Validate Login feature with valid credentails
    Given user on login page
    When user enter username as "admin " password as "admin"
    Then user click on submit button
