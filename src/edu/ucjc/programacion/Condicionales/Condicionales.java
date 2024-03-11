package edu.ucjc.programacion.Condicionales;

public class Condicionales {
	
	public static void main(String[]args) {
		int numero=8;
		System.out.println(numero++);
		System.out.println(numero+=10);
		boolean cumpleCondicion= numero>9;
		
		if (cumpleCondicion) {
			System.out.print("Número mayor 9");
			
		}else if (numero>6 && numero<7 ) {
			System.out.println("Número mayor que 6");
		}else if (numero>4 || numero==2) {
			System.out.println("Número mayor que 4 o 2");
		}else {
			System.out.println("otro resultado");
		}
		System.out.println("===============================");
		int opcion=3;
			
		switch (opcion) {
			case 3: System.out.println("El valor es 3");
			case 9: System.out.println("El valor es 9");break;
			default:System.out.println("El valor es otro");
		}
		
		}
	}
}
