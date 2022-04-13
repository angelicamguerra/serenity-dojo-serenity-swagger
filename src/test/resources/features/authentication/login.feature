Feature: Login
  Rule: Customers need tu provide valid credentials to access the product catalog

      Example: Colin logs in with valid credentials
        Given Colin is on the login page
        When Colin logs in with valid credential
        Then he should be presented with the product catalog