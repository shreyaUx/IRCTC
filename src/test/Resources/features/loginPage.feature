Feature: Login functionality for Open Cart Application

  Background:
    Given I am on OpenCart login Page

    Scenario: Successful login with valid credentials
      Given I have entered valid username and password
      When I click on login button
      Then I should be able to login successfully

