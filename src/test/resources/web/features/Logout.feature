@logout @regression
Feature:Logout
  Background: Logout
    Given el usuario esta logueado en la web Clockify.me

  @smoke @logoutExitoso
    Scenario: Logout
    When hace click en el boton del avatar
    And hace click en el link "Log out"
    Then se visualiza la pagina del Login

