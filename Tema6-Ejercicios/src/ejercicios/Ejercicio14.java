package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
	/**
	 * Implementar el juego del anagrama, que consiste en que un jugador escribe una
	 * palabra o frase, y la aplicación muestra un anagrama (transposición de los
	 * caracteres) del texto introducido generado al azar. A continuación otro
	 * jugador tiene que acertar cuál es el texto original. La aplicación no debe
	 * permitir que el texto introducido por el jugador 1 sea la cadena vacía. Por
	 * ejemplo, si el jugador 1 escribe “teclado”, la aplicación muestra como pista
	 * un anagrama al azar: “etcloda”. Puedes usar una función que realice la
	 * desordenación del texto.
	 * 
	 * @param args
	 */

	// La frase a adivinar por el jugador 2
	static String palabraJ1;

	static String tranposicion(String palabraJ1) {
		// Guardará de manera desordenada la palabra por carácteres
		char[] palabraDes = new char[palabraJ1.length()];
		// Variable auxiliar que comprueba si no se repite
		int numGenerados = 0;
		// Le da un valor al array
		Arrays.fill(palabraDes, '-');
		// Posiciones para saber donde guardar el valor
		int posicion;

		// Genera un número aleatorio
		posicion = (int) (Math.random() * palabraJ1.length());

		// Mientras el número de intentos sea menor que la longitud sigue ejecutandose
		while (numGenerados < palabraJ1.length()) {
			// Comprueba si la posición del array aleatorio es igual a un guión
			if (palabraDes[posicion] == '-') {
				// Añade la letra de la frase a una posición aleatoria en el array
				palabraDes[posicion] = palabraJ1.charAt(numGenerados);
				// Se le suma a los intentos
				numGenerados++;
			}
			// Genera un número aleatorio
			posicion = (int) (Math.random() * palabraJ1.length());
		}

		// Devuelve como una cadena desordenada
		return String.valueOf(palabraDes);
	}

	public static void main(String[] args) {
		// Variable que contiene la respuesta del usuario
		String respuesta;

		// Creación de escáner
		Scanner key = new Scanner(System.in);

		// Pide frase al usuario
		do {
			System.out.println("Jugador 1, introduce una frase: ");
			palabraJ1 = key.nextLine();

		} while (palabraJ1.equals(""));

		// Muestra la pista al usuario
		System.out.println(tranposicion(palabraJ1));

		do {
			// Pide la respuesta al usuario
			System.out.println("Jugador 2, intenta adivinar la palabra: ");
			respuesta = key.nextLine();
			// Comprueba si el usuario ha acertado la frase
		} while (!respuesta.equals(palabraJ1));

		// Le dice que ha ganado
		System.out.println("Enhorabuena, Ha adivinado");

	}

}
