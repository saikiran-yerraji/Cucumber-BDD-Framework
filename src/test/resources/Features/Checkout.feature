Feature: Checkout
  Scenario Outline: I placed an order in cart page
    Given I am on Store Page
    And I add a "<product_name>" to the cart
    And I navigated to checkout Page
    When I entered my billing details
      | firstName| LastName| Country| streetAddress| City | State | ZipCode| Email|
      |  Test    | work    |India   |ABC           |Chennai|Andhra Pradesh |530033  |ABC@gmail.com|
    And I place an Order
    Then the order should be placed successfully
    Examples:
     |product_name|
     |Blue Shoes  |
