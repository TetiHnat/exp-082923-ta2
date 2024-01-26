Feature: WebDriver feature

  Scenario: LogIn
    Given I open url "http://quote-stage.portnov.com/"
    Then I wait for 2 sec
    And I type "111" into all input fields
    Then I wait for 2 sec
    And I type "408-1111" into all input fields
    Then I wait for 2 sec


