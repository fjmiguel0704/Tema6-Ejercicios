package ejercicios;

import java.util.Scanner;

/**
 * Diseña una aplicación que pida al usuario que introduzca una frase por
 * teclado e indique cuántos espacios en blanco tiene.
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Frase introducida por el usuario
		String frase;

		// Contador de espacios en blancos de la frase
		int espaciosBlancos = 0;

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase:");
		frase = read.nextLine();

		// Recorremos la frase introducida por el usuario
		for (int i = 0; i < frase.length(); i++) {

			// Y si encuentra una posición que contenga un valor vacío, incrementa el
			// contador de los espacios en blanco
			if (frase.charAt(i) == ' ') {
				espaciosBlancos++;
			}
		}

		// Mostramos la cantidad de espacios ern blanco que existen en la frase
		System.out.println("La frase contiene " + espaciosBlancos + " espacios en blancos");

	}

}
