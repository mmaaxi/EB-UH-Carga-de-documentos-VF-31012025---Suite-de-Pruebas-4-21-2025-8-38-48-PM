Feature: Validar rechazo de carga cuando el archivo excede el tamaño permitido

  Scenario: Intentar cargar un archivo demasiado grande
    Given el usuario selecciona un archivo PDF que excede el tamaño permitido
    When el usuario intenta cargar el archivo
    Then el sistema presenta un mensaje de error indicando tamaño excesivo del archivo