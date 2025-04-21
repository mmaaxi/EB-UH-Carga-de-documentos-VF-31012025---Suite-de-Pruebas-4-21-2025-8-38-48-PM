Feature: Verificar comportamiento ante fallo de red durante la carga

  Scenario: Interrupción de red durante la carga de un PDF
    Given que el usuario tiene un archivo PDF válido para cargar
    When el usuario inicia el proceso de carga
    Then el sistema comienza la carga del documento
    When hay una interrupción en la red
    Then el sistema detecta la interrupción y pausa el proceso de carga
    And se muestra un mensaje de error pertinente indicando fallo de red
    And la carga se cancela o se reinicia