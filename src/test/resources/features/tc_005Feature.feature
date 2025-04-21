Feature: Validar manejo de carga de documento duplicado

  Scenario: Cargar un archivo PDF y luego intentar cargarlo nuevamente
    Given el usuario está en la página de carga de documentos
    When el usuario carga un archivo PDF válido
    Then el documento se carga correctamente y se almacena en el sistema
    When el usuario intenta cargar nuevamente el mismo archivo PDF
    Then el sistema detecta que el documento ya existe y muestra un mensaje de advertencia o error