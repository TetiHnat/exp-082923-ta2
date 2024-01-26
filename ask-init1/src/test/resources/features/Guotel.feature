Feature: WebDriver feature
@guete5
Scenario: (Smoke Test) Fill out the Reguired Fields of Quote and arrive on the Confirmation Page
  Given I visit Quote Page in the "QA" Enviroment
  When I enter "username" for the Username field
  And I enter "first" for first name field
  And I enter "email" for the Email field
  When I enter "password" for the Password field
  When I enter "password" for the Confirm Password field
  And I "check" the Privacy Policy checkbox
  When I click on the "Submit" button at the bottom of the page
  Then I verify we see the Submitted Application Page