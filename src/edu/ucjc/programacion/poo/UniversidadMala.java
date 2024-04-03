package edu.ucjc.programacion.poo;

import edu.ucjc.programacion.poo.Alumno.Alumno;
import edu.ucjc.programacion.poo.Alumno.Utilidades;

public class UniversidadMala {
	public static void main(String[]args) {
		
		/*
		Alumno alumno1= new Alumno("Noelia","Díaz",21,"Ingeniería aeroespacial","tercero",new String[]{"Métodos numéricos","CTA","fisicaIII"});
		Alumno alumno2= new Alumno("Marcos","Gomez",21,"Marketing audiovisual","cuarto",new String[]{"diseño","",""});
		Alumno alumno3= new Alumno("Isa","Castillo",19,"Ciencia de datos e inteligencia artificial","primero",new String[]{"sistemas operativos","programación,"fisicaI"});*/
				
		
		Alumno alumno1 = new Alumno("Alumno1","Apellido1",20,"Robótica",1);
		String [] asignaturasAlumno1 = {"Asignatura1","Asignatura2","Asignatura3"};
		alumno1.setAsignaturas(asignaturasAlumno1);
		alumno1.setEmail("alumno1@correo.es");
		alumno1.mostrarInfoAlumno();
		
		String [] asignaturasAlumno2 = new String[3];
		asignaturasAlumno2[0]="Asignatura1";
		asignaturasAlumno2[1]="Asignatura2";
		Alumno alumno2 =new Alumno("Alumno2","Apellido2",21,"Robótica",3,asignaturasAlumno2);
		alumno2.mostrarInfoAlumno();
		alumno2.setEmail("alumno2@correo.es");

		
		Alumno alumno3 = new Alumno("Alumno3","Apellido3",19,"Robótica",2,
				new String[] {"Asignatura4","Asignatura5","Asignatura6"},"alumno3@correo.es");
		alumno3.mostrarInfoAlumno();
		
		Alumno alumno4 = new Alumno("Alumno4","Apellido4",18,"Robótica",1, 
					new String[] {"Asignatura4","Asignatura5","Asignatura6"},"");
		alumno4.mostrarInfoAlumno();
	    alumno4.setEmail("alumno4@correo.es");
		

		
		Alumno[] alumnos= {alumno1,alumno2,alumno3,alumno4};
		
		for (Alumno alumno: alumnos) {
			//System.out.println(alumno.getNombre());
			//System.out.println(alumno.getApellidos());
			//System.out.println();
			//Llamada al método en la clase alumno
			//alumno.validarEmail();
			//Universidad uni=new Universidad();
			//validarEmail(alumno.getEmail());
			Utilidades.validarEmail(alumno.getEmail());
			
		}
		
	}

	//DESDE UN MÉTODO ESTÁTICO NO SE PUEDE LLAMAR A UN METODO NO ESTÁTICO
	/*Memoria estática: existe sin que exista un objeto
	 * 
	 * Memoria dinámica: los métodos dinámicos existen cuando existen los objetos
	 * 

	 */
}
