@report @regression
Feature:Report
  Background:
    Given el usuario esta logueado en la web Clockify.me

    Scenario: Reporte exitoso
    When hace click en el link "Reports"
    And hace click en el boton "Weekly"
    And hace click en el boton "Export"
    And hace click en el boton "Save as PDF"
    Then se visualiza la descarga del Pdf

