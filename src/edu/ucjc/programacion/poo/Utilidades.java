package edu.ucjc.programacion.poo;

import java.util.Scanner;

public class Utilidades {
	
	private static void metodo1() {
		
	}
	public static int pideDatoEntero(String texto) {
		System.out.println(texto);

		Scanner scan=new Scanner(System.in);
		int numero=scan.nextInt();
		
		return numero;
	}
	
	public static String pideDatoString(String texto) {
		String dato="";
		System.out.println(texto);
		
		Scanner scan=new Scanner(System.in);
		dato=scan.nextLine();
		
		return dato;
		
	}
	
	public static void pintarMenu(String[] opciones) {
		for (String opcion : opciones) {
			System.out.println(opcion);
		}
	}
	
	static void validarEmail (String email) {
		metodo1();
		boolean isValid = true;
		String mensaje = "";
		email= email.trim();
		System.out.println(email);
		
		
		if (email.contains(" ")) {
			isValid = false;
			mensaje += " tiene un espacio en blanco";
		}
		
		if (!email.contains("@") || email.indexOf("@")!= email.lastIndexOf("@") ){
			isValid = false;
			mensaje += " debe tener una @";
		}else {
			int poscionArroba = email.indexOf("@");
			String dominio = email.substring(poscionArroba+1);
			if(!dominio.contains(".")) {
				isValid = false;
				mensaje += " debe contener un punto después de la @";
			}else {
				if (dominio.indexOf(".")<2) {
					isValid = false;
					mensaje += " La distancia entre la @ y el primer punto después de ésta tiene que ser superior a 2";
				}
				String subdominio = dominio.substring( dominio.lastIndexOf(".")+1 );
				if (subdominio.length()<2 || subdominio.length()>5) {
					isValid = false;
					mensaje += "El número de caracteres después del último punto debe estar entre 2 y 5";
				
				}
				
			}
		}
		
		
		
		if (!isValid) {
			System.out.println("El email "+ email + " no es valido " + mensaje);
		}
	}
}
