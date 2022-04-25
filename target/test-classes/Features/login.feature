Feature: Test the login functionality

  @Sanity @Regression
  Scenario: To login with valid email and valid password
    Given User open the website and go to login page
    When User fill email as "eslaaam" and password as "test@123" and click on login
    Then User should navigate to home page

  @Regression
  Scenario Outline: Login with invalid credentials
    Given User open the website and go to login page
    When User fill email as "<username>" and password as "<password>" and click on login
    Then Error message should appeared

    Examples: 
      | username | password |
      | eslaaam  | wrong    |
      | wrong    | test@123 |
      | wrong    | wrong    |
