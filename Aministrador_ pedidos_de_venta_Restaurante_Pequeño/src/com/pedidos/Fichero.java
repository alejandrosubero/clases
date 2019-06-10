package com.pedidos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fichero extends Pedido {

	private String direct;
	private String direccion;
	private String dire="C:\\Users\\Public\\menu.txt";
	
	
	File ar = new File(dire); // direccion del archivo de respaldo 
	
	
	public Fichero() {
		
	}

	public Fichero(String nombreCliete, String orden, double total, int numeroMesa) {
		super(nombreCliete, orden, total, numeroMesa);
		// TODO Auto-generated constructor stub
	}
	
	public void creacionDeNuevoFichero (String unstring) {// genera un nuevo fichero para guardar la orden
		
	       
		//String generador= unstring;  //= String.valueOf();           //String.valueOf((int)Math.round(Math.random()*1000000)); //generador de numero a la zar
		
//==========================================================================================================================
		
		   //Date fecha = new Date(); //genera fecha completa
		  Date date = Calendar.getInstance().getTime();  
          DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
          String strDate = dateFormat.format(date);  
         System.out.println(strDate);
		
//============================================================================================================================		
          //direccion = "C:\\Users\\Public\\"+"\\"+generador+"_"+strDate+".txt";
          
         // System.out.println(direccion);
		
          //NOTA:HAY QUE CREAR UNA VARIABLE QUE GENERE EN UN FICHERO O UNA FORMA DE ACCESAR AL FICHERO QUE GUARDO EL PEDIDO Y UN FICHERO COSINA DONDE SE CARGEN TODOS LOS FICHEROS.
          
          
          
          
          
          
	} // fin del genera un nuevo fichero para guardar la orden
	
	
	


	public void ficheros (String unaorden) {
		
	        BufferedWriter bw;
	        
	       try {
	    	   
	    	   if(ar.exists()) {
	        	
	        	bw = new BufferedWriter(new FileWriter(ar,true));
	            bw.write(unaorden);
	            bw.newLine();
	          
	        } else {
	        	   	
	            bw = new BufferedWriter(new FileWriter(ar));
	            bw.write("Acabo de crear el fichero de texto.");
	        }
	        
	        bw.close();
		
		}	catch (IOException e) {
			// TODO Auto-generated catch block
			
		}
	}   
	
	public void leerEnCosina () {// este metodo lee y muestra en pantalla de la cosina la orden
		
		if(!(new File(dire)).exists()) { //esta es la direccion de respaldo del fichero  "C:\\Users\\Public\\menu.txt"
			
			System.out.println("No he encontrado fichero.txt");
            return;
		}
		System.out.println("Leyendo fichero de texto...");
		
		try {
			
			BufferedReader bw = new BufferedReader(new FileReader(ar));
			
			String linea = null;  // String linea =bw.readLine();
			
			while ((linea = bw.readLine()) !=null) { //otra forma de hacerlo es while (linea !=null){
				
				 System.out.println(linea);  //linea =bw.readLine() 
		}
			bw.close();
			
		}catch (IOException errorDeFichero)  {
           
			System.out.println("Ha habido problemas: " +errorDeFichero.getMessage());
		}
	}
	
	public void ficherosclear () {
		
        BufferedWriter bw;
        
       try {
    	          	
        	bw = new BufferedWriter(new FileWriter(ar,false));
            bw.write("  ");
            bw.newLine();
             
            bw.close();
	
	       }catch (IOException e) {
	}
  }
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDire() {
		return dire;
	}
	public void setDire(String dire) {
		this.dire = dire;
	}
	public String getDirect() {
		return direct;
	}
	public void setDirect(String direct) {
		this.direct = direct;
	}
	
}
