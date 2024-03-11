package edu.ucjc.programacion.ArraysStrings;

public class PruebaArrays {
	
	public static void main(String[]args) {
		
		int [] numeros= {1,2,3,4,5};
		
		int [] numeros2= new int[6];
		
		numeros2[3]=8;
		
		System.out.println(numeros[2]); //para acceder a la posición de memoria
		System.out.println(numeros2[3]);
		
		System.out.println(numeros.length);
	}

}