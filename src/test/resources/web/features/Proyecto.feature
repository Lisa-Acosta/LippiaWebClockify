@proyecto @regression
Feature: Proyecto
  Background: Proyecto
    Given el usuario esta en la pagina de Proyectos
    And hace click en el boton "CREATE NEW PROJECT"

  @smoke
  Scenario Outline: Crear Projects exitoso
    When ingresa el nombre para el proyecto <nombre>
    And selecciona el cliente <cliente>
    And elige la visibilidad <visibilidad>
    And elige un color <color>
    And hace click en el boton "Create"
    Then se muestra el mensaje de proyecto creado

    Examples:
      | nombre   | cliente  | visibilidad | color                                      |
      | Proyecto | Personal | Public      | background: var(--default-picker-color-1); |
      | Proyecto | Claro    | Private     | background: var(--default-picker-color-5); |


  Scenario Outline: Cancelar creacion de Proyecto exitoso
    When ingresa el nombre del proyecto <nombre>
    And hace click en el link "Cancel"
    Then no se visualiza el proyecto <nombre>

    Examples:
      | nombre              |
      | Otra Prueba Crowdar |


  Scenario Outline: Crear Proyecto Fallido
    When ingresa el nombre del proyecto <nombre>
    And selecciona el cliente <cliente>
    And elige la visibilidad <visibilidad>
    And elige un color <color>
    And hace click en el boton "Create"
    Then se visualiza el mensaje <mensajeDeError>

    Examples:
      | nombre                                                                                                                                                                                                                                                      | cliente  | visibilidad | color                                      | mensajeDeError                                            |
      | Prueba Crowdar                                                                                                                                                                                                                                              | Personal | Public      | background: var(--default-picker-color-2); | Prueba Crowdar project for client Personal already exists |
      | *                                                                                                                                                                                                                                                           | Movistar | Public      | background: var(--default-picker-color-8); | Project name has to be between 2 and 250 characters long  |
      | qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqoqpqpqpqpq9558585858((((((((((===&&6&&&&&&&&&OOOooooooooooooooooooooooo54546464747%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%00000003333333333333333333333333333wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww | Personal | Public      | background: var(--default-picker-color-4); | Project name has to be between 2 and 250 characters long  |