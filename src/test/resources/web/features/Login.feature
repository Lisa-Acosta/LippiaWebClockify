@login @regression
Feature:Login
  Background: Login
    Given el usuario esta en la pagina Clockify.me
    And hace click en el link "Log in"

  @smoke @loginExitoso
  Scenario: Login Exitoso - Email registrado y password
    When hace click en el link "Log in manually"
    And ingresa con email y password validos
    And hace click en el boton "LOG IN"
    Then se ingresa a la home page

  @smoke
  Scenario: Envio exitoso de email a una cuenta
    When ingresa el email cualquiera@email.com
    And hace click en el boton "CONTINUE WITH EMAIL"
    Then se visualiza el mensaje Email sent

  @notAutomation @Ignore
  Scenario: Login exitoso con usuario de Google
    When hace click en el boton "Continue with Google"
    And ingresa con una cuenta de Google
    Then se ingresa a la home page

  @loginFallido
  Scenario Outline: Login Fallido - credenciales invalidas
    When hace click en el link "Log in manually"
    And ingresa el email <email>
    And ingresa la password <password>
    And hace click en el boton "LOG IN"
    Then se visualiza el mensaje <mensajeDeError>

    Examples:
      | email                   | password   | mensajeDeError            |
      | bellssystems@gmail      | bellpass01 | Email format is not valid |
      | bells.systems.com       | 123456789  | Email format is not valid |
      | bells.systems@gmail.com | &          | Password is not valid     |
      | bellssystems@gmail.com  | &22222     | Invalid email or password |


  @loginFallido  @Ignore
  Scenario: Login Fallido - bloqueo de cuenta exitoso
    When hace click en el link "Log in manually"
    And intenta loguearse por 4 veces
    Then se visualiza el mensaje Your account is temporarily locked. Check your email to proceed.

  @loginFallido
  Scenario Outline: Login fallido - email invalidos
    When ingresa el email <email>
    And hace click en el boton "CONTINUE WITH EMAIL"
    Then se visualiza el mensaje <mensajeDeError>

    Examples:
      | email          | mensajeDeError            |
      | cualquiera.com | Email format is not valid |
      | email@gmail    | Email format is not valid |

  @notAutomation @Ignore
  Scenario Outline: Login fallido con Google con credenciales invalidas
    When hace click en el boton "Continue with Google"
    And ingresa con email <email> y password <password>
    Then se visualiza el mensaje "Contraseña incorrecta."

    Examples:
      | email                   | password   |
      | bells.systems@gmail.com | cualquiera |
      | lisa.acosta@gmail.com   | ninguna    |