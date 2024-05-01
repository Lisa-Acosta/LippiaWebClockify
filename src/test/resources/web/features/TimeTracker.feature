@timeTracker @regression
Feature:Time Tracker
  Background: Time Tarcker
    Given el usuario esta logueado en la web Clockify.me

    @smoke
    Scenario: Registro de horas exitoso
    When ingresa el trabajo "Feature Login"
    And ingresa la hora de inicio "09:00"
    And ingresa la hora de fin "17:15"
    And ingresa la fecha "30/04/2024"
    And hace click en el boton "ADD"
    Then se visualiza el trabajo "Feature Login"

