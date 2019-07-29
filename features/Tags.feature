@FunctionalTest
Feature: ECommerce Application

@SmokeTest @RegressionTest
Scenario: Successful Login
Given This is a first test

@RegressionTest
Scenario: UnSuccessful Login
Given This is a second test

@SmokeTest 
Scenario: Add a product to bag
Given This is a thrid test

Scenario: Add multiple product to bag
Given This is a four test

@SmokeTest @RegressionTest
Scenario: Remove a product from bag
Given This is a five test

@RegressionTest
Scenario: Remove all products from bag
Given This is a six test

@SmokeTest @specialTest
Scenario: Increase product quantity from bag page
Given This is a seven test

Scenario: Decrease product quantity from bag page
Given This is a eight test

@SmokeTest @End2End
Scenario: Buy a product with cash payment
Given This is a nine test

@SmokeTest @End2End
Scenario: Buy a product with CC payment
Given This is a ten test
