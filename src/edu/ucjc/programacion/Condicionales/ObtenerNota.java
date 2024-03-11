package edu.ucjc.programacion.Condicionales;

import java.util.Scanner;

public class ObtenerNota {
	public static void main(String[]args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Introduce una nota");
		int nota=scan.nextInt();
		/*
		 *  la línea scan = new Scanner(System.in); inicializa el objeto Scanner "scan" 
		 *  para que esté listo para leer la entrada del usuario desde la consola. Una vez 
		 *  inicializado, el objeto "scan" se utiliza para leer la entrada del usuario en el 
		 *  resto del programa, por ejemplo, con la función scan.nextInt() que se utiliza para 
		 *  obtener el valor numérico ingresado por el usuario.
		 */
		
		
		System.out.println();
		
		if (nota >0 && nota<5) {
			System.out.println("Suspenso");
		}else if (nota>=5 && nota<7) {
			System.out.println("Aprobado");
			
		}else if (nota>=7 && nota<9) {
			System.out.println("Notable");
			
		}else if (nota>=9 && nota<10) {
			System.out.println("Sobresaliente");
		}else {
			System.out.println("La nota introducida no es válida");
		}		
	
		
		switch(nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:System.out.println("Aprobado");break;
		case 6:
		case 7:System.out.println("Notable");break;
		case 8:
		case 9:System.out.println("Sobresaliente");break;
		case 10:
		case 11: System.out.println("La nota es incorrecta");break;
		}
	}
	
}


