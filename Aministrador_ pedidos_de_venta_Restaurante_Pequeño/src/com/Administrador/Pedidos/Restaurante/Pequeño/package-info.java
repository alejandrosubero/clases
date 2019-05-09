package com.Administrador.Pedidos.Restaurante.Peque�o;

/*  
 * 
 * 
 * Evaluaci�n Programaci�n Java Acelerado � Lun y Jue Noche

PRACTICA


1) Un restaurant nos contrat� para crear un peque�o sistema que administre sus pedidos y ventas. 
Nosotros nos encargaremos de la parte de dise�o y programaci�n necesarias para este requerimiento. 

Tendremos una clase llamada Pedido que deber� reflejar cada Pedido realizado. 
Para esto, un pedido ser� conformado por un n�mero de cliente (sin comas), un numero 
de mesa desde la cual se realiza el pedido, un nombre del cliente, la comida ordenada 
(cadena de caracteres), un indicador para saber si ya el cliente pag� o no,
y un monto total del pedido (puede contener coma). 

-	Crear dos constructores, uno que permita crear un Pedido sin valores y 
otro que nos pida completar obligatoriamente: 

	nombre del cliente, comida ordenada, monto total del pedido y el n�mero de mesa. 

-	En el main, crear 3 Pedidos distintos, dos usando los constructores redefinidos y 
uno usando el constructor por defecto. 

-	Crear todos los getters y setters. 

-	Redefinir el m�todo toString para poder imprimir por consola un cliente. 

-	Adem�s, declarar dos m�todos especiales:

pagar(boolean estaPago): que permite modificar el estado de pago del Pedido, si es que este 
no estaba pago anteriomente. 

agregarComida (String unaComida, double unMonto): la cual modifica el campo �comidaOrdenada� por el nuevo string y agregar 
el monto de este nuevo pedido al monto total de la cuenta. 


2) 
- Agregue dos clases que extiendan la funcionalidad de el Pedido, una para Pedido en el local y 
otra Para llevar. 

La opci�n para llevar deber�, permitir� agregar comida solamente si el monto de la comida pedida 
no supera los $100. 

- Sobreescriba los m�todos toString() de cada hijo para que impriman correctamente el nombre del tipo de pedido 
(para llevar o para comer en el local).

*/
