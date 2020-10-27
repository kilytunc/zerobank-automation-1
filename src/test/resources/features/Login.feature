Feature: Authorized user should be able to login

  @wip
  Scenario Outline: Login with different credentials
    Given the user is on the login page
    When the user enters to "<username>" "<password>"
    Then the user should be able to see "<result>"
    Examples:
      | username | password | result                           |
      | username | password | account-summary                  |
      | username | melala   | Login and/or password are wrong. |
      | aimkal   | password | Login and/or password are wrong. |
      | password | username | Login and/or password are wrong. |
      |          |          | Login and/or password are wrong. |
      |          | password | Login and/or password are wrong. |
      | username |          | Login and/or password are wrong. |
