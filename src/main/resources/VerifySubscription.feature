Feature: Verify the Subscription
  Scenario: Verify user is subscribed or not
    Given Open the Chrome Browser
    When Navigate to home page
    And Scroll down to footer
    And Verify text 'SUBSCRIPTION'
    And Enter email address in input and click arrow button
    And Verify success message 'You have been successfully subscribed!' is visible
    Then Close the browser once completed