Feature: Feature to test login functionality

  Scenario Outline: User login into the application with valid credentials
    Given User is on login page
    When User enters valid <username> and <password>
    And User clicks on login button
    Then User is able to navigate homepage

    Examples: 
      | username                | password     |
      | rohithpatilmu@gmail.com | Rohithmu@123 |
