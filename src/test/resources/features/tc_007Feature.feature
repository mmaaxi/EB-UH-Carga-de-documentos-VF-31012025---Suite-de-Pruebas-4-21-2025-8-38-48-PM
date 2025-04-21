Feature: Validar la funcionalidad de cancelación durante la carga

  Scenario: Usuario inicia carga de un archivo y la cancela
    Given el usuario ha iniciado sesión y está en la página de carga de archivos
    When el usuario inicia la carga de un archivo PDF largo
    Then el proceso de carga inicia mostrando la barra de progreso
    
    When el usuario presiona el botón 'Cancelar Carga'
    Then el sistema interrumpe el proceso de carga y muestra un mensaje confirmando la cancelación

    When el archivo busca en el sistema
    Then el archivo no debe quedar registrado en el sistema
    And el sistema debe liberar cualquier recurso asignado