Feature: Title of the pages

  Background: Given the user is on the login page
              And the user enters the valid credentials

  Scenario: Account Summary page title
    When user navigates to "Account_Summary" page
    Then the title should contain "Zero-Account Summary"

    Then the user should be able to see following options
      | Cash Accounts      |
      | Investment Account |
      | Credit Accounts    |
      | Loan Accounts      |

  Scenario: :Account Activity page title
    When user navigates to "Account_Activity" page
    Then the title should contain "Zero-Account Activity"

  Scenario:Account type
    When user navigates to "Account_Activity" page
    And clicks on "Account Type"
    Then the user should be able to see following options
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |

  Scenario: Transactions Table
    When user navigates to "Account_Activity" page
    Then "Transactions Table" column names should be following options
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |

  Scenario: Pay Bills page title
    When user navigates to "Pay_Bills" page
    Then the title should contain "Zero-Pay Bills"
