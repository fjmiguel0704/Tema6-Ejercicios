package ejercicios;

import java.util.Scanner;

/**
 * Diseña el juego “Acierta la contraseña”. La mecánica del juego es la
 * siguiente: el primer jugador introduce la contraseña; a continuación, el
 * segundo jugador debe teclear palabras hasta que la acierte. El juego debe
 * indicar si la palabra introducida es mayor o menor alfabéticamente que la
 * contraseña.
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos el scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Guarda la contraseña introducida del jugador 1
		String contraseñaJ1;
		System.out.println("Jugador 1, introduce la contraseña: ");
		contraseñaJ1 = read.nextLine();

		// Guarda los intentos de contraseña del jugador 2
		String intentosJ2;
		System.out.println("Jugador 2, prueba a acertar: ");
		intentosJ2 = read.nextLine();

		// Mientras la contraseña de intento del jugador 2 sea distanta a la original
		while (!intentosJ2.equals(contraseñaJ1)) {

			// Compara alfabéticamente
			int abecedario = intentosJ2.compareTo(contraseñaJ1);

			// Si la contraseña de intento alfabéticamente es mayor a 0, muestra que es mayor
			if (abecedario > 0) {
				System.out.println("La palabra introducida es mayor alfabéticamente que la contraseña");
			}

			// En caso contrario, si la contraseña de intento alfabéticamente es menor a 0, muestra que es menor
			else {
				System.out.println("La palabra introducida es menor alfabéticamente que la contraseña");
			}

			// Volvemos a solicitarle la contraseña al jugador 2
			System.out.println("Continúa probando: ");
			intentosJ2 = read.nextLine();

		}

		//Una vez terminado el bucle, muestra que ha acertado la contraseña
		System.out.println("Ha acertado la contraseña");

	}

}
