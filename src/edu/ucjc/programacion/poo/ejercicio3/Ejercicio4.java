package edu.ucjc.programacion.poo.ejercicio3;

import edu.ucjc.programacion.poo.Alumno.Alumno;

/*
 * Definir método que eleve un numero a la potencia pasada
 * Definir un método que le cambie la edad a un alumno elevándole al cubo
 * En el main,
 * 		+ elevar un número a la 4 y mostrar el resultado
 * 		+ Crear un aumno y cambiarle su edad
 */
public class Ejercicio4 {
//PASO POR VALOR: valor es cuando se crea una copia o modificas la referencia que le has pasado
	private void potencia (int base, int potencia) {
		//la clase mtah está en el paquete java land por lo que la puedo utilizar sin necesidad de importarla
		double resultado = Math.pow(base, potencia);
		
		return resultado;
	}

//PASO POR REFERENCIA: es un metodo al que le pasas un objeto que no es de tipo primitivo. te paso el libro, y tu directamente moificas el libro
	private void cambiarEdadAlumno(Alumno alumno) {
		double resultado= potencia(alumno.getEdad(),3);
		alumno.setEdad((int)resultado);
	}
	
	

	public static void main(String[] args) {
		Ejercicio4 ejer4=new Ejercicio4();
		int numero=6;
		double resultado=ejer4.potencia(numero, 4);
		System.out.println(resultado);
		
		Alumno alumno1=new Alumno ("N1","A1","1111A");
		alumno1.setEdad(19);
		ejer4.cambiarEdadAlumno(alumno1);
		System.out.println(alumno1.getEdad());
		
	}
}
