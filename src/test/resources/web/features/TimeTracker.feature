@timeTracker @regression
Feature:Time Tracker
  Background: Time Tracker
    Given el usuario esta logueado en la web Clockify.me

    @smoke
    Scenario: Registro de horas exitoso
    When ingresa el trabajo "Feature Login"
    And ingresa la hora de inicio "09:00"
    And ingresa la hora de fin "17:15"
    And ingresa la fecha "30/04/2024"
    And hace click en el boton "ADD"
    Then se visualiza el trabajo "Feature Login"

  Scenario: Registro de horas cancelado exitoso
    When ingresa el trabajo "Feature Login1"
    And ingresa la hora de inicio "09:00"
    And ingresa la hora de fin "17:15"
    And ingresa la fecha "30/04/2024"
    And cancela el trabajo
    Then no se visualiza el trabajo "Feature Login"

  Scenario Outline: Modificar entrada de horas existente exitosa
   When modifico el trabajo <Trabajo> y modifico la hora <Inicio> y <Fin>
    Then se actualiza el trabajo a <Trabajo>

    Examples:
      | Trabajo        | Inicio | Fin   |
      | Feature Login2 | 09:56  | 11:34 |