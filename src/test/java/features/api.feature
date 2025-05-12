Feature: Test de API

  Scenario: Obtener información del usuario
    Given la API está disponible
    When hago una petición GET al endpoint "/users/1"
    Then el código de respuesta debe ser 200
