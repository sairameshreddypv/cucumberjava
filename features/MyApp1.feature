Feature: Test App features

  Scenario: Test login with valid credentials
    Given open chrome and start application
    When user enter valid "username" and "password"
    Then user should be able to login successfully
