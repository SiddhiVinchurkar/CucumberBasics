Feature: Login Feature



Scenario Outline: Login fail - possible combinations
    Given user is on Application landing page
    When user click on Sign In button
    Then user is displayed login screen
    When user enters "<Username>" in username field
    And user enters "<Password>" in password field
    Then user gets login failed error message

    Examples: 
      | Username  | Password      |
      | usrnm1    |     Test@123  |
      | usrnm2    |     Test@123  |
