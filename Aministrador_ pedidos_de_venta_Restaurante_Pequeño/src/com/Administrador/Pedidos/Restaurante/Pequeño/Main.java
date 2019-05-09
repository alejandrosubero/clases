package com.Administrador.Pedidos.Restaurante.Pequeño;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*Pedido p =new Pedido();
		p.numerodemesa(15);
		p.setNombreCliente("raul");
		p.setNumeroCliente(555555);
		p.comidaOrdenada();
		p.pagos();
		p.pagar();	
		
		/*Local l = new Local (); //String nombreCliete, String orden, double total, int numeroMesa
		
        l.numerodemesa(23);
        l.setNumeroCliente(256);
        l.setNombreCliente("Andres");
        l.comidaOrdenada();
        l.pagos();
        l.pagar();*/
        
		
       Llevar y = new Llevar ();
        
      y.numerodemesa(45);
      y.setNombreCliente("Alejandro");
      y.setNumeroCliente(152);
      y.comidaOrdenada();
      y.agregarComida("soda", 101);
      y.pagar();
       
		
		Fichero f = new Fichero();
		
		//f.ficheros("casabe");
		
	    //f.leerEnCosina();
		
		//f.ficherosclear();
		
	
		
        
       // System.out.println(p);
        //System.out.println(l);
        
		//System.out.println(y);
        
	}

}
