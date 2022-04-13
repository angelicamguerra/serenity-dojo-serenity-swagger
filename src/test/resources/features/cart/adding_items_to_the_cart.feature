Feature: Adding items to the cart
  #Rule: Item added from the catalog page should appear in the cart
    #Example: Colin adds some items to his cart
  Background:
        Given Colin is on the login page
        When Colin logs in with valid credential
  Scenario: prueba
      #And Colin has logged on to the application
      And he is browsing the catalog
      When he adds the following items to the cart:
      | Sauce Labs Backpack |
      | Sauce Labs Fleece Jacket |
      #Then the shopping cart count should be 2
      #And items should appear in the cart