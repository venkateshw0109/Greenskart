Feature: User buy some vegetables

Scenario: User order vegetables
    Given User launch the browser and url
    When User search cucumber vegetable in searchbox
    And User click the add to cart button
    And User Click the items icon
    And User click the proceed to checkout
    Then payment page shown
    
Scenario: User placed the order
  When user enter the promo code
  And user click the apply button
  And user click the place order button

Scenario: User details page
    When User select the country
    And User click the agree button
    And user click the proceed button
   