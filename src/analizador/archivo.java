package analizador;

import java.io.*;
import java.util.StringTokenizer;

public class archivo {
		
	public String leertxt(String direcc){
		//recibe la direccion del archivo
		String tex = "";
		try{
			BufferedReader bf = new BufferedReader(new FileReader(direcc));
			//Leer direccion, fileReader recibe dirr del archivo
			String temp ="";
			//temp guardara el texto
			String bfread;
			//leer el archivo
			
			while((bfread = bf.readLine()) != null ){
				//leer cada linea
				temp= temp+ " " + bfread;//temp concatenara el archivo
				//temp= temp + bfread.split("");
			}
			tex = temp;
		}catch(Exception e){
			System.err.println("No se encontro archivo");
			
		}
		return tex;
	}
	
}