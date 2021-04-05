Feature: User Registration
  I want to use this template for my feature file

Scenario: User Registration with different data
    Given User is on registration page
    When User enters following details
      | Tom | Harris |  tom123@gmail.com  |  12345 | Sweden |
      | Jenny | Bing |  jenny123@gmail.com  |  54321 | Germany |
      | Joe | Stinson |  stinson123@gmail.com  |  098765 | LA  |
    Then User registarion should be successful


Scenario: User Registration with different data with columns
    Given User is on registration page
    When User enters following details with columns
      | firstName | lastName | email | phone | city |
      | Tom | Harris |  tom123@gmail.com  |  12345 | Sweden |
      | Jenny | Bing |  jenny123@gmail.com  |  54321 | Germany |
      | Joe | Stinson |  stinson123@gmail.com  |  098765 | LA  |
    Then User registarion should be successful
