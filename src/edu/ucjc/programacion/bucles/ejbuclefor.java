package edu.ucjc.programacion.bucles;

public class ejbuclefor {
	
	public static void main(String[]args) {
		//Mostrar en la misma línea los números impares del 1 al 99 y los pares del 100 al 2 en la misma línea
		for (int i=1;i<101;i+=2) {
			System.out.println(i+"-"+(101-i));
		}
		System.out.println("Fin");
	}

}
