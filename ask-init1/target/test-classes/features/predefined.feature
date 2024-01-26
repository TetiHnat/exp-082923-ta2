@predefined
Feature: Smoke steps

  @predefined1
  @regression
  Scenario: Predefined steps for Google
   # Given I open url "https://google.com"
   # Then I should see page title as "Google"
   # Then I type "Cucumber" into element with xpath "//input[@name='q']"
    #Then I click on element using JavaScript with xpath "(//input[@name='btnK'])[1]"
    # Then I wait for 2 sec
    #Then I wait for element with xpath "//*[@id='res']" to be present
    #Then I should see page title contains "- Google Search"
    #Then element with xpath "//*[@id='res']" should contain text "Cucumber"


  Scenario: My scenario
    #Given I open url "https://google.com"
    #Then I should see page title as "Google"
    #Then I type "Cucumber" into element with xpath "//textarea[@name='q']"
    #Then I click on element using JavaScript with xpath "(//input[@name='btnK'])[1]"
    # Then I wait for 2 sec
    #Then I wait for element with xpath "//*[@id='res']" to be present
    #Then I should see page title contains "- Google Search"
    #Then element with xpath "//*[@id='res']" should contain text "Cucumber"

  @gibiru
  Scenario Outline: Gibiru scenario
    Given I open url "<url>"
    And element with xpath "<xpath>" should be displayed
    Then I type "<text>" into element with xpath "<xpath1>"
    Then I click on element using JavaScript with xpath "<xpath2>"
    Then I wait for <sec> sec
    Examples:
      | url                 | xpath                                   | text                        | xpath1           | xpath2                   | sec |
      | https://gibiru.com/ | //div/*[contains(text(), 'Mobile App')] | Behavior Driven Development | //input[@id='q'] | //button[@type='submit'] | 3   |


  @
