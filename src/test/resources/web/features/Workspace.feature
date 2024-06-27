@workspace @regression
Feature: Workspaces

  Background: Workspace
    Given el usuario esta en la pagina de Workspace

  @workspaceExitoso @smoke
  Scenario: Crear Workspace exitoso
    When hace click en el boton "CREATE A NEW WORKSPACE"
    And ingresa el nombre del workspace "Prueba Crowdar"
    And hace click en el boton "CREATE"
    Then se visualiza el workspace "Prueba Crowdar"

  Scenario: Cancelar creacion de Workspace exitoso
    When hace click en el boton "CREATE A NEW WORKSPACE"
    And ingresa el nombre del workspace "Prueba Cancel"
    And hace click en el link "Cancel"
    Then no se visualiza el workspace "Prueba Cancel"

  @workspaceFallido
  Scenario Outline: Crear Workspace fallido - Nombres inválidos -
    When hace click en el boton "CREATE A NEW WORKSPACE"
    And ingresa el nombre del workspaces <nombre>
    And hace click en el boton "CREATE"
    Then se visualiza el mensaje <mensajeDeError>

    Examples:
      | nombre                                                                                                                                                                                                                                                      | mensajeDeError                                            |
      | qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqoqpqpqpqpq9558585858((((((((((===&&6&&&&&&&&&OOOooooooooooooooooooooooo54546464747%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%00000003333333333333333333333333333wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww | Workspace name has to be between 1 and 50 characters long |

  @ActualizarWorkspace
  Scenario Outline: Actualizar Workspace exitoso
    When elije el workspace <workspace>
    And actualiza el workspace <workspaceActualizado>
    Then se visualiza el nombre del workspace <workspaceActualizado>

    Examples:
      | workspace     | workspaceActualizado |
      | WORKSPACE WEB | WORKSPACE WEBACT     |