package edu.ucjc.programacion.ArraysStrings.copy;

public class PruebaStrings {
	
	public static void main(String[]args) {
		//UN STRING ES INMUTABLE! (NO SE PUEDE MODIFICAR)
		 String cadena ="texto";
		 
		 //cadena =cadena.toUpperCase();
		 
		 //System.out.println(cadena);
		 
		 String cadena2= new String ("texto");
		 String cadena3 ="texto";
		 
		 System.out.println(cadena==cadena2); //el onjeto que apunta cadena es el mismo objeto al que apunta cadena2? No
		 System.out.println(cadena==cadena3);
		 System.out.println(cadena.equals(cadena2));//aquí sí que compara el valor
		 System.out.println(cadena.equalsIgnoreCase(cadena3));//ignora si coinciden en mayusculas
		 
		 System.out.println(cadena.contains("te"));
		 System.out.println(cadena.indexOf("t")); //empieza a buscar desde la izquierda
		 System.out.println(cadena.indexOf("a")); //si meto un caracter que no está en la cadena de texto me devuelve -1
		 System.out.println(cadena.lastIndexOf("t")); //empieza a buscar desde la derecha
		
		 
		 System.out.println(cadena.charAt(2));
		 
		 String texto="    Hola esto es una prueba    ";
		 System.out.println(cadena.replace(" ","")); //me remplaza todos los espacios en blanco por vacíos
		 System.out.println(texto.trim()); //quita espacios en blanco tanto a la derecha como a la izquierda pero no entre texto
		 
		 System.out.println(texto.trim().substring(10));
		 System.out.println(texto.trim().substring(10,15));
		 
		 String dato="qweqw;asdasd;asdas;34543";
		 String[] datos=dato.split(";");
		 //System.out.println(datos[4]); // ERROR!(IndexOutOfBoundsException) hemos intentado acceder a una posición de un array que no existe
		 
		 
		 
		 
		 
		
		 
		 
		 /*
		  * == compara objetos
		  * .equals() compara valores
		  */
		 
		 
				 
	}

}
