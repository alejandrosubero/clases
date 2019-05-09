package com.Administrador.Pedidos.Restaurante.Pequeño;

/*  
 * 
 * 
 * Evaluación Programación Java Acelerado – Lun y Jue Noche

PRACTICA


1) Un restaurant nos contrató para crear un pequeño sistema que administre sus pedidos y ventas. 
Nosotros nos encargaremos de la parte de diseño y programación necesarias para este requerimiento. 

Tendremos una clase llamada Pedido que deberá reflejar cada Pedido realizado. 
Para esto, un pedido será conformado por un número de cliente (sin comas), un numero 
de mesa desde la cual se realiza el pedido, un nombre del cliente, la comida ordenada 
(cadena de caracteres), un indicador para saber si ya el cliente pagó o no,
y un monto total del pedido (puede contener coma). 

-	Crear dos constructores, uno que permita crear un Pedido sin valores y 
otro que nos pida completar obligatoriamente: 

	nombre del cliente, comida ordenada, monto total del pedido y el número de mesa. 

-	En el main, crear 3 Pedidos distintos, dos usando los constructores redefinidos y 
uno usando el constructor por defecto. 

-	Crear todos los getters y setters. 

-	Redefinir el método toString para poder imprimir por consola un cliente. 

-	Además, declarar dos métodos especiales:

pagar(boolean estaPago): que permite modificar el estado de pago del Pedido, si es que este 
no estaba pago anteriomente. 

agregarComida (String unaComida, double unMonto): la cual modifica el campo “comidaOrdenada” por el nuevo string y agregar 
el monto de este nuevo pedido al monto total de la cuenta. 


2) 
- Agregue dos clases que extiendan la funcionalidad de el Pedido, una para Pedido en el local y 
otra Para llevar. 

La opción para llevar deberá, permitirá agregar comida solamente si el monto de la comida pedida 
no supera los $100. 

- Sobreescriba los métodos toString() de cada hijo para que impriman correctamente el nombre del tipo de pedido 
(para llevar o para comer en el local).

*/
