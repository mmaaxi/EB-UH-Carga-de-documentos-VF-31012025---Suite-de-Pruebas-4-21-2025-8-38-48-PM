Feature: Validar la carga concurrente de múltiples documentos

  Scenario: Carga concurrente de documentos PDF
    Given el usuario tiene varios archivos PDF listos para cargar
    When el usuario inicia la carga de los archivos PDF en diferentes pestañas
    Then el sistema debe permitir la carga concurrente sin afectar el rendimiento general
    And verificar que cada carga se realice correctamente con barras de progreso separadas
    And mostrar mensajes de confirmación individuales para cada documento