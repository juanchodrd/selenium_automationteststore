Feature: LoginPage Tests

  Scenario: Valido url de automationteststore
    Given que estoy en la home page
    When  presiono el boton de login
    And la url contiene login "login"