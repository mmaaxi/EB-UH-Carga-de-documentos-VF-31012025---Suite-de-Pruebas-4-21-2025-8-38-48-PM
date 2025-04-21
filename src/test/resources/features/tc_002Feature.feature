Feature: Validar rechazo de carga con formato de documento inválido

  Scenario: Documento con formato no válido
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona un archivo en formato no válido
    Then el sistema detecta el formato no válido y deshabilita la carga
    When el usuario intenta presionar el botón "Cargar documento"
    Then el sistema no permite la carga y muestra un mensaje de error indicando el formato incorrecto