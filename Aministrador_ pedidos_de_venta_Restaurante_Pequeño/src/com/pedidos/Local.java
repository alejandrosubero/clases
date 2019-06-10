package com.pedidos;

public class Local extends Pedido {

	private String tipoOrden;
	
	
	public Local() {
		
		super();
		initialization2 ();
		
		// TODO Auto-generated constructor stub
	}

	public Local(String nombreCliete, String orden, double total, int numeroMesa) {
		super(nombreCliete, orden, total, numeroMesa);
		// TODO Auto-generated constructor stub
		initialization2 ();
		
		
	}

	
	private void initialization2 () { //inicializa variables.
		
		tipoOrden=" Para comer en el local";
		
	}


	@Override
	public String toString() {// toString clase para comer en local
		return "Pedido de la mesa: "+ this.getNumeroMesa()  + "\nNombre del cliente " + 
				this.getNombreCliente()+ "\nnumero  cliente : "+this.getNumeroCliente()+ 
				"\norden = " + this.getOrden()+ "\nla orden es para "+tipoOrden +
				"\ntotal a pagar = " + this.getTotal() + "\nla orden esta paga :"+ this.isPago();
	}
	
	
	
}
