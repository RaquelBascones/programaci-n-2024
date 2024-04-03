package edu.ucjc.programacion.poo.ComposicionCoche;

public class Coche {
	private String matricula;
	private String marca;
	private Volante volante;
	private Motor motor;
	private double velocidad;
	
	public Coche(String matricula, String marca, Volante volante, Motor motor) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.volante = volante;
		this.motor = motor;
	}
	

	public Coche(String matricula, String marca) {
		super();
		this.matricula = matricula;
		this.marca = marca;
	}




	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Volante getVolante() {
		return volante;
	}

	public void setVolante(Volante volante) {
		this.volante = volante;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public void conducir () {
		System.out.println("El coche con matricula "+
				this.matricula + " va a una velocidad de "
				+ this.velocidad);
	}
	
}

