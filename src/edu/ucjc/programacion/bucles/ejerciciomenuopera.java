package edu.ucjc.programacion.bucles;

import java.util.Scanner;

public class ejerciciomenuopera {
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
                    mostrarMatriz();
                    System.out.println("");
                    break;
                case 2:
                    pintarCuadrado();
                    System.out.println("");
                    break;
                case 3:
                    serieFibonacci();
                    System.out.println("");
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

   
    public static void mostrarMatriz() {
        int count = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
  
    

    public static void pintarCuadrado() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int tamano = scan.nextInt();

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == 0 || i == tamano - 1 || j == 0 || j == tamano - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void serieFibonacci() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese cuántos números de la serie Fibonacci desea mostrar: ");
        int n = scan.nextInt();

        int a = 0, b = 1;
        System.out.print(a + ", " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}

