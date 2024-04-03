package edu.ucjc.programacion.poo.ComposicionCoche;

public class Circuito {

	public static void main(String[] args) {
		
		for (String dato : args) {
			System.out.println(dato);
		}
		Piston piston1 = new Piston(1,"Marca1");
		Motor motor1 = new Motor("Marca1",190,piston1);
		Volante volante1 = new Volante(1,"tipo1","negro");
		
		Coche coche1 = new Coche("1111-AAA","Seat",volante1, motor1);
		
		Coche coche2 = new Coche("2222-BBB","VW");
		Piston piston2 = new Piston(2,"Marca1");
		Motor motor2 = new Motor("Marca1",120,piston2);
		Volante volante2 = new Volante(2,"tipo1","negro");
		coche2.setVolante(volante2);
		coche2.setMotor(motor2);
		
		
		double velocidad1 = Math.random()*120;
		coche1.setVelocidad(velocidad1);
		
		double velocidad2 = Math.random()*120;
		coche2.setVelocidad(velocidad2);
		
		Coche [] coches = {coche1,coche2};
		Circuito circuito = new Circuito();
		circuito.arrancarCoches(coches);
		for (Coche coche : coches) {
			System.out.println(coche.getMarca());
		}
	}
	
	
	private void arrancarCoches(Coche [] coches) {
		
		for (Coche coche : coches) {
			coche.setMarca("BMW");
			coche.conducir();
		}
		frenar();
	}
	
	
	private void frenar() {
	
	}

}
