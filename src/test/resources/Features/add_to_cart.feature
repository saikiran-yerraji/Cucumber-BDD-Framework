Feature: Add to Cart
  Scenario Outline: Add one quantity from store
    Given I am on Store Page
    When I add a "<product_name>" to the cart
    Then I should be see 1 "<product_name>" in the cart
    Examples:
      | product_name|
    | Blue Shoes  |
    |Anchor Bracelet|