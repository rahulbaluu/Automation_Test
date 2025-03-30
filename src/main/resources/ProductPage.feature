Feature: Verify all product and product detail page is Visible
  Scenario: Verify the Product and Product detail page
    Given Open the Chrome Browser
    And Navigate to home page
    When Click Products icon in the home page
    And Verify all product is displayed
    And Click on 'View Product' of first product
    And Once landed verify that detail is visible (product name, category, price, availability, condition, brand)
    Then Close the browser once completed