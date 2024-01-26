Feature: Scenario outline

  @Qoute6
  Scenario Outline: E2E
    Given I open url "http://quote-stage.portnov.com/"
    Then I enter "<fullname>" into the field with xpath"//input[@name='name']"
    And I enter "<username>" into the field with xpath"//input[@name='username']"
    And I enter "<email>" into the field with xpath"//input[@name='email']"
    And I enter "<password>" into the field with xpath"//input[@name='password']"
    And I enter "<password>" into the field with xpath"//input[@name='confirmPassword']"
    And I click on element with xpath "//input[@name='agreedToPrivacyPolicy']"
    And I click on element with xpath "//button[@name='formSubmit']"
    Then I wait for 4 sec


    Examples:
    |fullname        |username| email             | password
    | Anna Kurkia    |AnnaBB  |anna@example.com   |123456
    | Boris Skoric   |bbBoris |boris@example.com  |123456&^%
    | Jyothi Godja   |jj12Joi |Joi12@example.com  |dfFDH123
    | Maria Forest   |mary123 |Mary123@example.com|@@jgkdouf0