Feature: Login to Invue Admin Application

  Scenario: Login with valid Credentials
    Given User launches chrome browser
    When User opens URL "https://invue-live-admin-qa.web.app/"
    And User enters valid username "qa@gmail.com" and password "12345"
    And User clicks on login button
    Then Page title should be "LIVE Display"
    And User clicks logout button
    And Close browser
