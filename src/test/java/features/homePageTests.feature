Feature: Valido home page

  Scenario: Valido url de automationteststore
    Given que estoy en la home page
    Then la url contiene automationteststore "automationteststore"

  Scenario: Valido que se pueda realizar una busqueda en automationteststore
    Given que estoy en la home page
    When ingreso el texto "Armani Code Sport" en el cuadro de busqueda
    Then se muestra "Armani Code Sport" como resultado de la busqueda

  Scenario: Me dirijo a la página de login
    Given que estoy en la home page
    When  presiono el boton de login
    Then la url contiene login "login"