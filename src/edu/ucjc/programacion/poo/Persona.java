package edu.ucjc.programacion.poo;

public class Persona {
	//Variables instancia
	//private,package,protected,public --->MIRAR LUEGO
	
	private String nombre; 
	private String apellidos;
	private String dni;
	private int edad;
	
	
	
	//Constructores--->inicializar los objetos: Permiten establecer los valores iniciales de los campos de un objeto cuando se crea una instancia de la clase.
	public Persona() {
		
	}
	public Persona(String nombre) {
		this.nombre=nombre;
	}

	public Persona (String dni) { ///un constructor tiene siemrpe el mismo nombre que la clase
		this.dni=dni; //con el this todos los atributos que sean del objeto voy a referenciarlos
	}
	
	public Persona (String nombre, String dni)
		this.dni=dni;
		this.nombre=nombre;
	}

	public Persona(String nombre, String apellidos, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

/*A CONTINUACIÓN en get:
	* modificador de acceso
	*tipo de dato que voy devuelve
	*nombre del método
	*() lo que necesitariamos para que ese método pueda funcionar*/

//MÉTODOS GET Y SET (los métodos en minúscula)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void correr() {
		if(this.edad<18) {
			System.out.println("corre muy rápido");
		}else if (edad>=18 && edad <40) {
			System.out.println("corre rápido");
		}else {
			System.out.println("corre lento");
	}
}
