package com.pedidos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Pedido {

	
	private int numeroCliente;
	private int numeroMesa;
	private String nombreCliente;
	private String orden;
	private boolean pago;
	private double total;
	private boolean tipopedidos;
	
	
	
	
	Scanner sc =new Scanner (System.in);
	
	public Pedido() {
		initialization ();
		
	}

 
	public Pedido(String nombreCliete, String orden,  double total, int numeroMesa ) {
		
		initialization ();
		
		this.nombreCliente = nombreCliete;
		this.orden = orden;
		this.total = total;
		this.numeroMesa = numeroMesa;	
	}
	
	
	private void initialization () { //inicializa variables.
		
		nombreCliente = "cliente";
		orden = "";
		total=0.0;
		pago = false;
		numeroMesa = 0;
		tipopedidos=false;
	}
	
	public void comidaOrdenada () throws IOException {//metodo para solicitar una orden de comida adicional 
		
		ArrayList <String> cosinas = new ArrayList <String> ();
		Fichero cosina = new Fichero ();
		boolean flag =true;
		ArrayList <String> n = new ArrayList <String> ();
				
		do {
		
			System.out.println(" Escriba la orden del cliente del menu siguiente : "+"\ncombo1, combo2, combo3, soda; al finalizar dar enter"+ "Para salir enter 2 veces");
			
			String slc = sc.nextLine();
			
			if (slc.equals("combo1")) {
			
				
			double	price = 50.00;
			total+= price;
			String q = "Combo 1";
			cosinas.add(q);
			n.add(q+" = "+price+" ");
			
				
			}else if (slc.equals("combo2")) {
				
				String q = "Combo 2";
				double	price = 59.00;
				total+= price;
				n.add(q+" = "+price+" ");
				cosinas.add(q);
				
				
			}else if (slc.equals("combo3")) {
				
				String q = "Combo 3";
				double	price = 60.00;
				total+= price;
				n.add(q+" = "+price+" ");
				cosinas.add(q);
			
			}else if (slc.equals("soda")) {
				
				String q = "Soda";
				double	price = 35.50;
				total+= price;
				n.add( q+" = "+price+" ");
				cosinas.add(q);
				
			}else{
				
				flag=false;
			}
			
		}while (flag);
		
		for (int i=0; i< n.size();i++) {
			
			orden+= n.get(i);
			//cosina.ficheros(orden);
		}
		
		for (int i=0; i< cosinas.size();i++) {
			
			cosina.ficheros(cosinas.get(i));
		}
		
		//System.out.println(orden+" total = "+total);
		
		
	}
	
	public int numerodemesa (int numero) throws IOException {//metodo que genera o direcciona la orden a una mesa 
		
		
		
		Fichero cosina = new Fichero ();
		int entero = numero;
		String mesa = String.valueOf(entero);
		cosina.ficheros("Mesa numero: "+ mesa);
		cosina.creacionDeNuevoFichero(mesa);
		return numeroMesa=numero;
		
		
	}
	
	public boolean pagos () {// metodo que comprueba el pago de la orden de comida
		
		if ( pago == true && total !=0) {
			return pago =true;
		}else if (pago == false && total !=0){
			return pago= false;
		} else if (pago == true && total ==0){
			return pago= false;
		} else if (pago == false && total ==0){
			return pago= false;
		} 
		return pago; 
	}   
	
	public boolean pagar (){// metodo para generar el pago de la orden 
		
		System.out.println("Monto a pagar : "+ total);
		
		pagos ();
		
		if (pago == false) {
		
			System.out.println("Desea pagar si (s), no (n) ");
			
			String f = sc.nextLine();
			
			if (f.equals("s")) {
				
				pago = true;
				
			}else if (f.equals("n")) {
				
				System.out.println("Orden cancelada");
				pago =false;
			}
			
		}else {
			
			pago=true;
		}
		
		return pago;
	}
	
	
	
	public String agregarComida (String unaComida, double unMonto){// metodo para generar la orden de comida ya solicitada
		
		orden+=unaComida;
		total+=unMonto;
	
		return orden;	
	}
	
	
	@Override
	public String toString() {// metodo toString de la clase pedido
		
		
		return "Pedido de la mesa: "+ numeroMesa+ "\nNombre del cliente: " + 
				nombreCliente + "\nnumero  cliente : "+numeroCliente + "\norden = " + orden +
				"\ntotal a pagar = " + total + "\nLa orden esta paga :"+ pago;
	}


	public void tipoDeOrden () {
		
		if (tipopedidos==false) {
			
			Local L =new Local ();
			
			L.toString();
			
		}else {
			
			Llevar LL = new Llevar ();
			
			LL.agregarComida(orden,LL.getPrice());
			
		}	
	}
	
	
	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
