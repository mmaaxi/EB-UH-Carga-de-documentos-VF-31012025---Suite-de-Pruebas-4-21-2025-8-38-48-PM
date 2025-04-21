Feature: Validar la funcionalidad de reintento de carga fallida

  Scenario: Reintentar carga de un documento PDF tras un fallo inicial
    Given que la primera carga de un documento PDF falla
    When el usuario presiona el botón de 'Reintentar carga'
    Then el sistema reanuda o reinicia el proceso de carga y se completa correctamente