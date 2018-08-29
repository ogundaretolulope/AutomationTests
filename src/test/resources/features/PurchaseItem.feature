@UI
Feature: As a customer I want purchase 2 items

@Test-1
Scenario: Purchasing 2 items successfully
  Given I am logged in customer on homepage
  When I search for an item 'Blouse'
  And I quick view the item from the search results page
  And I change the size to 'M'
  And I add the item to basket
  And I search for another item 'Printed Dress'
  And I quick view the item from the search results page
  And I add the item to basket
  And I proceed to basket summary
  Then I verify that the items sizes are correct
  And I verify that the items prices are correct
  And I am able to complete my order successfully

@Test-2 @Test-3
Scenario: Review previous orders and add a message
  Given I am logged in customer on homepage
  And I navigate to my account section
  And I click to view orders history
  And I select an item from my previous order
  When I add a comment
  Then I verify the comment appears under message
  And I verify colour of item selected is 'red'


