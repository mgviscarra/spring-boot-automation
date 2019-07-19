Feature: Blog Login
  Scenario:
    Given I go to "http://blog:8090"
    And I set user name with "invalid"
    And I set password with "invalid"
    And I click on login button
    Then I should see "Invalid username and password." message


  Scenario:
    Given I go to "http://blog:8090"
    And I set user name with "admin"
    And I set password with "admin"
    And I click on login button
    Then I should see "The HAL Browser (for Spring Data REST)" header
