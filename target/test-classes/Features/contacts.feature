Feature: Contact page feature
  @Regression
  Scenario: Make sure that the email text field is visible
    Given  User open the website and go to login page
    When   User fill email as "eslaaam" and password as "test@123" and click on login
    And    Clicks on contacts
    Then   Email text field should be visible

  @Regression @Sanity
  Scenario: Add new contact
    Given  User open the website and go to login page
    When   User fill email as "eslaaam" and password as "test@123" and click on login
    And    Clicks on contacts
    And    Clicks on add new contact
    And    Fill the first name and password
    Then   a new contact should be added