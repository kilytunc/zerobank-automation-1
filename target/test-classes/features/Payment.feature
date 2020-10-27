Feature: Payments
  Background: Given the user is on the login page
              And the user enters the valid credentials

    Scenario: Successful Payment
      When user navigates to "Pay_Bills" page
      And user completes a successful pay operation
      Then user should see the message "the payment was successfully submitted"

      Scenario: Unsuccessful Payment with no amount
        When user navigates to "Pay_Bills" page
        And user makes a payment without entering the "amount"
        Then user should see the message "please fill out this field"

  Scenario: Unsuccessful Payment with no date
    When user navigates to "Pay_Bills" page
    And user makes a payment without entering the "date"
    Then user should see the message "please fill out this field"

    Scenario: Entering Alphabetical Characters in Date Field
      When user navigates to "Pay_Bills" page
      And user enters alphabetical characters
      Then Date Field should not accept these information

  Scenario: Entering Special Characters in Date Field
    When user navigates to "Pay_Bills" page
    And user enters special characters
    Then Date Field should not accept these information
