Feature: Validar visualización de la barra de progreso y tiempos de respuesta

  Scenario: Carga de un documento PDF y visualización de barra de progreso
    Given El usuario inicia la carga de un documento PDF de tamaño mediano
    Then El sistema debe mostrar una barra de progreso visible y actualizable
    And La barra de progreso debe actualizarse de forma continua 
    And El tiempo de respuesta entre actualizaciones debe ser adecuado