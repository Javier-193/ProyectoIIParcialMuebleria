Sistema de Mueblería – Java
Este proyecto es un sistema de consola en Java que permite administrar muebles y compras (clientes que adquieren muebles).
El sistema guarda la información en archivos de texto (Muebles.txt y Compras.txt) para persistencia de datos.

Funcionalidades
Menú Principal
El sistema ofrece dos opciones principales:

CRUD Muebles

CRUD Compras

Salir


funcionalidad del:
CRUD Muebles

Permite administrar los muebles en inventario:

Crear → Agregar un mueble (código, nombre, precio, material, tipo).

Leer → Mostrar lista de muebles registrados.

Actualizar → Modificar los datos de un mueble existente.

Eliminar → Eliminar un mueble por su código.

Los datos se guardan en Muebles.txt.


funcionalidad del:
CRUD Compras

Permite administrar compras realizadas por clientes:

Crear → Registrar una compra con:

DPI del cliente

Nombre

Teléfono

Cantidad de productos

Nombre del producto

Tipo de pago (efectivo, tarjeta, etc.)

Leer → Mostrar todas las compras registradas.

Actualizar → Modificar los datos de una compra según el DPI del cliente.

Eliminar → Eliminar una compra por DPI.

Los datos se guardan en Compras.txt.


Objetivo:

El programa busca facilitar la gestión de una mueblería, permitiendo llevar un control básico de:

Los muebles disponibles en el inventario.

Las compras realizadas por los clientes.

Todo esto desde una interfaz de consola sencilla y práctica.
