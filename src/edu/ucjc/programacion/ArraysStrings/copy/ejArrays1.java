package edu.ucjc.programacion.ArraysStrings.copy;

import java.util.Scanner;

public class ejArrays1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        int tamanyoArray=scan.nextInt();
        
		int [] numeros= new int[tamanyoArray];
		
		//int[][] numerosBidimensional=new int [2][3] //HACERLO EN BIDIMENSIONAL
		
		for(int i=0; i<tamanyoArray;i++) {
			System.out.println("Introduce el valor de la posición"+i);
			numeros[i]=scan.nextInt();
		}
			
		for (int i=0; i>tamanyoArray;i++) {
			int numero=numeros[i];
			if (numero%2==0) {
				System.out.println(numero);
			}
		}
			
    }

}
