package edu.ucjc.programacion.bucles;

import java.util.Scanner;

public class ejmenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Mostrar matriz");
            System.out.println("2. Pintar cuadrado");
            System.out.println("3. Serie Fibonacci");
            System.out.println("4. Salir");
           
            System.out.println("");
            
            System.out.print("Seleccione una opción: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                	for (int i=1;i<10;i++) {
                		System.out.print(i+"\t");
                		if (i%3==0) {
                			//System.out.println();
                			System.out.print("\n");
                		}
                	}
                    System.out.println("\n");
                    break;
                    
                case 2:
                	int tamanyo=4;
                	for (int i=0;i<tamanyo;i++) {
                		for (int j=0;j<tamanyo;j++) {
                			if (i==0 || i==tamanyo-1) {
                				System.out.print("* ");
                			}else {
                				if (j==0 || j==tamanyo-1) {
                					System.out.print("* ");
                				}else {
                					System.out.print("  ");
                				}
                			}
                		}
                		System.out.println();
                	}
                    System.out.println("\n");
                    break;
                    
                case 3:
                    System.out.println("Introduce números a mostrar de la serie de Fibonacci:");
                    int cantidadNumeros=scan.nextInt();
                    
                    int num1=0;
                    int num2=1;
                    System.out.println(num1);
                    System.out.println(num2);
                    for (int i=0; i<cantidadNumeros-2; i++) {
                    	
                    	int suma=num1+num2;
                    	System.out.println(suma);
                    	num1=num2;
                    	num2=suma;
                    }
                    
                    System.out.println("\n");
                    break;
                    
                case 4:
                    System.out.println("Adiós");
                    break;
                    
                default:
                    System.out.println("La opción es incorrecta, elige otra opción");
                    System.out.println("");
            }
        } while (opcion != 4);
    }

   
}
