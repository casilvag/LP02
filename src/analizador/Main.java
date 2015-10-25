package analizador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		archivo a = new archivo();
		String t = a.leertxt("C:\\Users\\jhonattan\\workspace\\AnalizadorLexico\\texto\\HOLA.txt");
		
		String patron = ("(while)|(else)|(if)|(class)|(return)|(for)|([0-9]+)|([<|>|=]+)|(;)|([+|*|-|/]+)|([(|)|{|}]+)|([a-zA-Z]+)"); //patron (expresion regular) 
		
		String texto =  t.toLowerCase();
		
		
		Pattern p = Pattern.compile(patron); // enviamos la expresion regular de la que nos vamos a guiar
		//compila nuestra expresión regular (patron)
		
		
		//matcher hara el analisis compilando el patron y capturando el texto 
		Matcher matc = p.matcher(texto);

		//hash table para almacenar variables con un id para su futura comparación
		Hashtable<String , Integer> palabra = new Hashtable<String, Integer>();
		
		while (matc.find()){
			//encontrar las coincidencias con find
			
			String tokenTipo1 = matc.group(1);
			String tokenTipo2 = matc.group(2);
			String tokenTipo3 = matc.group(3);
			String tokenTipo4 = matc.group(4);
			String tokenTipo5 = matc.group(5);
			String tokenTipo6 = matc.group(6);
			String tokenTipo7 = matc.group(7);
			String tokenTipo8 = matc.group(8);
			String tokenTipo9 = matc.group(9);
			String tokenTipo10 = matc.group(10);
			String tokenTipo11 = matc.group(11);
			String tokenTipo12 = matc.group(12);
			
			
			if(tokenTipo1 != null){
				System.out.println("<Pal_reser_while, "+ tokenTipo1 +" >");
				//devuelve  token
				}
			if(tokenTipo2 != null){
			System.out.println("<pal_reser_else, "+ tokenTipo2 +" >");
			}
			if(tokenTipo3 != null){
			System.out.println("<pal_reser_if, "+ tokenTipo3 + " >");
			}
			if(tokenTipo4 != null){
				System.out.println("<pal_reser_class, "+ tokenTipo4 + " >");
				}
			if(tokenTipo5 != null){
				System.out.println("<pal_reser_return, "+ tokenTipo5 + " >");
				}
			if(tokenTipo6 != null){
				System.out.println("<pal_reser_for, "+ tokenTipo6 + " >");
				}
			if(tokenTipo7 != null){
				System.out.println("<constante, "+ tokenTipo7 + " >");
				}
			if(tokenTipo8 != null){
				System.out.println("<ope_comparacion, "+ tokenTipo8 + " >");
				}
			if(tokenTipo9 != null){
				System.out.println("<final_linea, "+ tokenTipo9 + " >");
				}
			if(tokenTipo10 != null){
				System.out.println("<ope_aritmetico, "+ tokenTipo10 + " >");
				}
			if(tokenTipo11 != null){
				System.out.println("<final_sentencia, "+ tokenTipo11 + " >");
				}
			if(tokenTipo12 != null){
				System.out.println("<variable, "+ tokenTipo12 + " >");
				palabra.put(tokenTipo12, id++);
				//guarda variable en hash table
				}
		}
		System.out.println("palabras almacenadas en hash table");
		System.out.println(palabra+ "\n");
		}
		
	
	static String delimitador=" <>(){};"; 
	static int Panterior=-1,Pactual=-1,linea=0;
	static Integer id =0;
	}

