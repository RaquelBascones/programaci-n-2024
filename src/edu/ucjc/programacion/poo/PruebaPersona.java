package edu.ucjc.programacion.poo;

public class PruebaPersona {

	public static void main(String[]args) {
		
		Persona persona1=new Persona();
		
		Persona persona5=new Persona("Eva");
		
		
		persona1.setNombre="Eva";
		persona1.setApellidos="Gómez Manzano"
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getDni);
		System.out.println(persona1.getEdad); // por defecto la edad inicialmente aunque no la hemos asignado un valor me va a salir 0
		
		
		
		String nombre="Luis";
		Persona persona2=new Persona(nombre,"1111A");
		System.out.println(persona2.getNombre());
		
		
		Persona persona3=new Persona("Nombre1","Apellido1","222C",24);
		Persona persona4=persona2;
		persona2=persona3;
		//Persona persona3=persona2; //variable que está apuntando al mismo objeto al que apunta la variable persona2
		
		persona2.setEdad=(26);
		persona2.correr();
		persona3.correr();
		System.out.println(persona3.getEdad());
	}

}
