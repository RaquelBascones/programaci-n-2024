package edu.ucjc.programacion.poo.Alumno;

public class Alumno {

	// Variables de instancia
	private String nombre;
	private String apellidos;
	private int edad;
	private String cursando;
	private int curso;
	private String asignaturas[];
	private String email;
	private String dni;

	// Constructores
	public Alumno(String nombre, String apellidos, int edad, String cursando, int curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cursando = cursando;
		this.curso = curso;
	}

	public Alumno(String nombre, String apellidos, int edad, String cursando, int curso, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cursando = cursando;
		this.curso = curso;
		this.email = email;
	}

	public Alumno(String nombre, String apellidos, int edad, String cursando, int curso, String[] asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cursando = cursando;
		this.curso = curso;
		this.asignaturas = asignaturas;
	}

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCursando() {
		return cursando;
	}

	public void setCursando(String cursando) {
		this.cursando = cursando;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void mostrarInfoAlumno() {
		// Utilidades.validarEmail(this.email);
		System.out.println("El alumno " + this.nombre + " " + this.apellidos + " está estudiando " + this.curso + " de "
				+ this.cursando);

		if (asignaturas != null) {
			System.out.println("Con las asignaturas: ");
			for (String asignatura : asignaturas) {
				if (asignatura != null) {
					System.out.println("\t" + asignatura.toUpperCase());
				}
			}
		} else {
			System.out.println("El alumno no está matriculado de ninguna asignatura");
		}
	}

	void validarEmail() {
		boolean isValid = true;
		String mensaje = "";
		email = email.trim();
		System.out.println(email);

		if (email.contains(" ")) {
			isValid = false;
			mensaje += " tiene un espacio en blanco";
		}

		if (!email.contains("@") || email.indexOf("@") != email.lastIndexOf("@")) {
			isValid = false;
			mensaje += " debe tener una @";
		} else {
			int poscionArroba = email.indexOf("@");
			String dominio = email.substring(poscionArroba + 1);
			if (!dominio.contains(".")) {
				isValid = false;
				mensaje += " debe contener un punto después de la @";
			} else {
				if (dominio.indexOf(".") < 2) {
					isValid = false;
					mensaje += " La distancia entre la @ y el primer punto después de ésta tiene que ser superior a 2";
				}
				String subdominio = dominio.substring(dominio.lastIndexOf(".") + 1);
				if (subdominio.length() < 2 || subdominio.length() > 5) {
					isValid = false;
					mensaje += "El número de caracteres después del último punto debe estar entre 2 y 5";

				}

			}
		}

		if (!isValid) {
			System.out.println("El email " + email + " no es valido " + mensaje);
		}
	}

}
