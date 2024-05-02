@workspace @regression
Feature: Workspaces
  Background: Workspace
    Given el usuario esta en la pagina de Workspace
    And hace click en el boton "CREATE A NEW WORKSPACE"

  @workspaceExitoso @smoke @prueba
  Scenario: Crear Workspace exitoso
    When ingresa el nombre del workspace "Prueba Crowdar"
    And hace click en el boton "CREATE"
    Then se visualiza el workspace "Prueba Crowdar"


  Scenario: Crear Workspace existente fallido -
    When ingresa el nombre del workspace "HOME_WORKSPACE"
    And hace click en el boton "CREATE"
    Then se muestra el mensaje "Workspace with name 'HOME_WORKSPACE' already exists"

  Scenario: Cancelar creacion de Workspace exitoso
    When ingresa el nombre del workspace "Prueba Cancel"
    And hace click en el link "Cancel"
    Then no se visualiza el workspace "Prueba Cancel"

  @workspaceFallido
  Scenario Outline: Crear Workspace fallido - Nombres inválidos -
    When ingresa el nombre del workspaces <nombre>
    And hace click en el boton "CREATE"
    Then se visualiza el mensaje <mensajeDeError>
    Examples:
      | nombre                                                                                                                                                                                                                                                      | mensajeDeError                                             |
      | a                                                                                                                                                                                                                                                           | Workspace name has to be between 2 and 250 characters long |
      | qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqoqpqpqpqpq9558585858((((((((((===&&6&&&&&&&&&OOOooooooooooooooooooooooo54546464747%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%00000003333333333333333333333333333wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww | Workspace name has to be between 2 and 250 characters long |

