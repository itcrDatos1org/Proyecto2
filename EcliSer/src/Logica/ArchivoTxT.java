package Logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import EstructuraDeDatos.LinkedList;

public class ArchivoTxT {
	
	//--------------------------------------------------
	public BufferedReader getBuffered(String link){

	    FileReader lector  = null;
	    BufferedReader br = null;
	    try {
	         File Arch=new File(link);
	        if(!Arch.exists()){
	           System.out.println("No existe el archivo");
	        }else{
	           lector = new FileReader(link);
	           br = new BufferedReader(lector);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return br;
	}
	
	//----------------------------------------------------
	
	public void readTxt(){
	    try {
	        //ruta de tu archivo
	        String ruta = "archivo.txt";
	        BufferedReader br = getBuffered(ruta);
	        //leemos la primera linea
	        String linea =  br.readLine();
	        //creamos la matriz vacia
	        //char[][] = new char[8][11];
	        LinkedList lChar = new LinkedList();
	        //contador
	        int contador = 0;
	        while(linea != null){
	            String[] values = linea.split(",");
	            //recorremos el arrar de string
	            for (int i = 0; i<values.length; i++) {
	                //se obtiene el primer caracter de el arreglo de strings
	                //char[contador][i] = values[i].charAt(0);
	            }
	            contador++;
	            linea = br.readLine();
	        }
	    } catch (IOException | NumberFormatException e) {
	        e.printStackTrace();
	    }
	}

}
