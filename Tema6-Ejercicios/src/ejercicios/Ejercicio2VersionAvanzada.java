package ejercicios;

import java.util.Scanner;

import metodos.ClearConsole;

/**
 * VERSIÓN AVANZADA: El juego, en vez de indicar si la palabra es mayor o menor
 * alfabéticamente que la contraseña, debe mostrar una cadena con los caracteres
 * acertados en sus lugares respectivos y asteriscos en los no acertados.
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio2VersionAvanzada {

	public static void main(String[] args) {

		// Guarda la contraseña original
		String contraseñaJ1;

		// Contraseñas de intentos de acierto
		String intentosJ2;

		// Contraseña oculta con los caracteres acertados
		String contraseñaOculta = " ";

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Le pedimos al jugador 1 que introduzca la contraseña original
		System.out.println("Jugador 1, introduce la contraseña: ");
		contraseñaJ1 = read.nextLine();

		// Le pedimos al jugador 2 que pruebe a acertar la contraseña
		System.out.println("Jugador 2, intenta adivinar: ");
		intentosJ2 = read.nextLine();

		// Mientras las contraseñas de intento del jugador 2 sean distintas a la
		// original
		while (!intentosJ2.equals(contraseñaJ1)) {
			contraseñaOculta = " ";

			// Recorrerá la longitud de la contraseña original
			for (int i = 0; i < contraseñaJ1.length(); i++) {

				// Y si hay caracteres en la contraseña de intento que coincidan con algunos de
				// la contraseña original, los mostrará en su posición correspondienrte
				if (intentosJ2.length() > i && intentosJ2.charAt(i) == contraseñaJ1.charAt(i)) {
					contraseñaOculta += contraseñaJ1.charAt(i);
				}

				// En caso contrario, el resto de posiciones las rellenará con asteriscoss
				else {
					contraseñaOculta += "*";
				}
			}

			// Mostramos la contraseña oculta con los caracteres acertados
			System.out.println(contraseñaOculta);

			// Volvemos a pedrile al jugador 2 siga probando hasta acertar la contraseña
			System.out.println("Jugador 2, intenta adivinar: ");
			intentosJ2 = read.nextLine();
		}

		// Una vez haya acertado y salga del bucle, mostramos un mensaje de acierto
		System.out.println("Ha adivinado la contraseña");
	}
}