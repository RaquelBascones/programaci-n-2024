package edu.ucjc.programacion.bucles;

public class BucleWhileDoWhile {

	public static void main(String[]args) {
		//Bucle while
		
		int numero=10;
		
		while (numero-->=10) {
			System.out.println(numero);
			numero--;
		}
		
		//Bucle do-while
		int numero2=numero;
		
		do {
			System.out.println(numero2);
			numero2+=2;
		}while(numero2<9);
	}
	
}