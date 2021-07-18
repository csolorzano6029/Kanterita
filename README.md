Como gerente de proyectos, solicito la implementación de una aplicación de simulación de pedidos en un Restaurante, con la finalidad de poder evaluar habilidades, conocimientos y aptitudes de los aspirantes a desarrolladores en Kruger Corp Ecuador.

El reto está dividido en 2 partes:


1. (Back-end) Se les entregará una aplicación simple REST creada con Spring Boot (restaurant-order-main.zip).  Actualmente, la aplicación puede traer una orden ejecutando un request GET en `/orders/{id}`, donde `{id}` es el identificador de la orden. (Se está
utilizando la base de datos “H2” de desarrollo)


Su tarea es añadir detalles a la orden con id{1}, por lo que  la aplicación debe soportar estos requests:
a) POST a /orders/{1}/details - que debería guardar un nuevo detalle para la orden con el {id} enviado.
b) GET a /orders/{1}/details - que debería retornar todos los detalles de una orden con el {id} enviado.

2. (Front-end) Elaborar una aplicación web o móvil para visualizar un pedido con todos sus detalles ingresando como criterio de búsqueda el {id} de la orden. Pueden usar tecnologías de vanguardia como Angular, Reactjs, Vuejs, etc.

Criterios de evaluación:
Objetivos cumplidos
Limpieza de código, separación de capas
Calidad de documentación
Calidad de código
Pruebas unitarias (importante aplicar TDD)
Estética
Desenvolvimiento en la presentación del producto
¿Cómo envío el reto?

Adjuntar el link del repositorio subido en Github o Bitbucket tanto de backend como de frontend.
Recordar dar clic en el botón "Marcar como tarea completada", al finalizar la tarea.