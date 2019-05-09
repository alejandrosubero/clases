package com.Administrador.Pedidos.Restaurante.Pequeño;

import java.util.ArrayList;
import java.util.Scanner;

public class Llevar extends Pedido {

	private String tipoOrden;
	private double totalllevar;
	private String orden1;
	private double price;
	
	
	public Llevar() {
		super();
		initialization3 ();
		
		// TODO Auto-generated constructor stub
	}

	public Llevar(String nombreCliete, String orden, double total, int numeroMesa) {
		
		super(nombreCliete, orden, total, numeroMesa);
		// TODO Auto-generated constructor stub
		
		initialization3 ();
	}
	
	private void initialization3 () { //inicializa variables.
		
		tipoOrden=" Para llevar";
		totalllevar=0.0;
		String orden1="";
		price =0.0;
		
	}
	
	public String agregarComida (String unaComida, double unMonto){// este codigo agrega una comida para llevar
		
		Scanner sc3 =new Scanner (System.in);//inicializa el escaner
		
		boolean flag =true;
		
		ArrayList <String> M = new ArrayList <String> ();//para cargar la orden
				
		System.out.println("=== Menu para llevar : "+" combo1, combo2, combo3, soda ===");
		
		System.out.println("\n");
		
		//System.out.println(unaComida+this.getOrden());
	
		
		do {
				
			//System.out.println("agregar");
			
			totalllevar=unMonto;
			
			double check = this.getTotal()+totalllevar;
			
			
			if (check>=100) {
				
					System.out.println("No se puede agregar mas a la orden para llevar");
					System.out.println("");
					//this.setOrden(unaComida);
					//this.setTotal(unMonto);
					flag =false;
					
			}else if (check < 100) {
				
				
							do {
								
								System.out.println(" Escriba la orden del cliente que desa agregar : "+" combo1, combo2, combo3, soda");
								
								String slc2 = sc3.nextLine();
								
									if (slc2.equals("combo1")) {
									
									price = 50.00;
									totalllevar+= price;
									M.add("Combo 1"+" = "+price+" ") ;
									
									}else if (slc2.equals("combo2")) {
										
										price = 59.00;
										totalllevar+= price;
										M.add("Combo 2"+" = "+price+" ");
										
									}else if (slc2.equals("combo3")) {
										
										price = 60.00;
										totalllevar+= price;
										M.add("Combo 3"+" = "+price+" ");
									
									}else if (slc2.equals("soda")) {
										
										price = 35.50;
										totalllevar+= price;
										M.add("Soda"+" = "+price+" ");
									
									}else {
									
										flag=false;
									}
								
							}while (flag);
							
			}else {
						
				 flag =false;
			}
					
		}while (flag);
		
		orden1=unaComida+" ";
		
		for (int i=0; i< M.size();i++) {
					
			orden1+=M.get(i);	
		}
	
		this.setTotal(getTotal()+totalllevar);
		this.setOrden(orden1+this.getOrden());
		return this.getOrden();
   }
	
	@Override
	public String toString() {//toString de comoda para llevar
		
				return "Pedido de la mesa: "+ this.getNumeroMesa()  + " Nombre del cliente " + 
				this.getNombreCliente()+ " numero  cliente : "+this.getNumeroCliente()+ 
				"\nOrden = " + this.getOrden()+ "\nla orden es para "+tipoOrden +
				"\nTotal a pagar = " + this.getTotal() + " La orden esta paga : "+ this.isPago();
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}

