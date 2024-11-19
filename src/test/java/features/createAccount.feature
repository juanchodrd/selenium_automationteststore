Feature: Register Tests

  Scenario: Registro de nuevo usuario
    Given que estoy en la home page
    When presiono el boton de login or register
    And verifico que la url contiene login "login"
    And en la pagina de login presiono el radio button register account
    And luego presiono continue

    And ingreso mis datos personales
      | campo      | valor                 |
      | First Name | Juan                  |
      | Last Name  | Tognoli               |
      | E-Mail     | juantognoli@gmail.com |
      | Telephone  |                       |
      | Fax        |                       |

#    And ingreso mi dirección
#      | campo       | valor               |
#      | Address 1   | Pi y Margall        |
#      | City        | Buenos Aires        |
#      | ZIP Code    | 1704                |
#      | Country     | Argentina           |
#
#    And ingreso mis datos de inicio de sesión
#      | campo             | valor           |
#      | Login name        | juantognoli     |
#      | Password          | mysecurepassword |
#      | Password Confirm  | mysecurepassword |
#
#    And acepto la Política de Privacidad
#    And selecciono la opción "No" para la suscripción al boletín
#    And presiono el botón "Continue"
#
#    Then veo el mensaje de confirmación de creación de cuenta
