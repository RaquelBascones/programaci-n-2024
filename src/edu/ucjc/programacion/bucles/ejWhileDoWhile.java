package edu.ucjc.programacion.bucles;

public class ejWhileDoWhile {	
	public static void main(String[] args) {
		System.out.println("Hola\t como \n estás?");
		
		//BUCLE WHILE
		int numero =10;
		while (numero-->=10) {
			System.out.println(numero);
			numero--;
			/*
			 * Se inicializa la variable numero con el valor 10.
			 * 
			 * La condición numero-- >= 10 se evalúa. En este caso, numero-- se evalúa primero, 
			 * lo que significa que se compara el valor original de numero (10) y luego se decrementa en 1.
			 * 
			 * Si la condición es verdadera, se ejecuta el bloque de código dentro del bucle while. En este caso, 
			 * se imprime el valor de numero y luego se decrementa en 1.
			 * 
			 * Este proceso se repite hasta que la condición numero-- >= 10 sea falsa.
			 */
		}
		

		/*BUCLE DO-WHILE: 
		 * es similar al bucle while, pero la diferencia principal radica en que el bloque de código se ejecuta 
		 * al menos una vez antes de que se evalúe la condición. 
		 */
		
		int numero2 = numero;
		do {
			System.out.println(numero2);
			numero2+=2;
		}while(numero2<9);
		/*
		 * Se inicializa la variable numero2 con el valor de numero (el cual resulta de la ejecución del bucle while anterior).
		 * El bloque de código dentro del do se ejecuta al menos una vez, ya que la condición se evalúa al final del bucle.
		 * Después de cada ejecución del bloque de código, la condición numero2 < 9 se evalúa. Si es verdadera, el bucle se repite; 
		 * de lo contrario, el bucle se detiene.
		 */
		
	}
			
}


/*DIFERENCIAS
 * La diferencia principal es que un bucle while evalúa la condición antes de ejecutar el bloque de código, 
 * lo que significa que el bloque de código puede que nunca se ejecute si la condición es falsa desde el principio. 
 * Por otro lado, un bucle do-while ejecuta el bloque de código al menos una vez antes de evaluar la condición, lo que 
 * garantiza que el bloque de código se ejecute al menos una vez, independientemente de la condición.
 */
