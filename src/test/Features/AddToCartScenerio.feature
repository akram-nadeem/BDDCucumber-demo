Feature: Add product to cart

  Scenario: Add a product to cart

    Given User is on login page
    When  Click on add to cart option
    Then product added to cart successfully
    And Click on Cart
    Then Item should be shown in cart