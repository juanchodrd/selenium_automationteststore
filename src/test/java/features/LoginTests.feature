Feature: Login Tests

  @only
  Scenario: Login correcto con usuario existente
    Given que estoy en la home page
    When presiono el boton de login or register
    And verifico que la url contiene login "login"
    And ingreso credenciales del usuario "juantognoli" "Test0010!!"
    And presiono el boton de login
    Then veo el mensaje de bienvenida