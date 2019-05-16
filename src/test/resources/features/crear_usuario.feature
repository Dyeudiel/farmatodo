Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Registrar usuario plataforma Farmatodo
    Given Aun no estoy registrado en la plataforma de Farmatodo
    When Realizo el registro en la aplicación
      | nombres | apellidos | correo    | contraseña | numCedula | numCelular | sexo      |
      | Yeudiel | Diaz      | a@aaaa.cl | Test123    |   1369154 | 3017152247 | Masculino |
    And Adiciono el producto Oferta chapStick tripack al Carrito
    Then Visualizo el producto seleccionado en el carrito

  Scenario: Agregar Productos al carrito
    Given Omito el Registro
    And Adiciono el producto Oferta chapStick tripack al Carrito
    Then Visualizo el producto seleccionado en el carrito
