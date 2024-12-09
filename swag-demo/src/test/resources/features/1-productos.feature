#language:es

  @Suite
  Característica: CP-1 - Validar carrito de compras

    Antecedentes: Realizar flujo de comprar agregar producto

      Escenario: 1 - Listar los productos en el carrito

        Dado el usuario navega al sitio web
        Cuando agrega productos al carrito de compras
        Entonces el sistema debería mostrar pagina para finalizar compra


