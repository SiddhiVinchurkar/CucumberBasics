Feature: Calculate billing amount
  I want to use this template for my feature file


  Scenario Outline: Billing amount
    Given user is on billing page
    When user enters billing amount "<billingAmount>"
    When user enters tax amount <taxAmount>
    And user clicks on calculate button
    Then it gives the final amount <finalAmount>

    Examples: 
      | billingAmount  | taxAmount | finalAmount  |
      | 1000 					 |	10			 | 1010         |
      | 5000					 |  20			 | 520          |
      | 100					   |  5.5			 | 105.5        |
       	
