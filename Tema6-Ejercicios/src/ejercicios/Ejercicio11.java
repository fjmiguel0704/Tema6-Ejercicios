package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.TabableView;

public class Ejercicio11 {
	/**
	 * Leer una frase y encontrar la palabra de mayor longitud. El programa debe
	 * imprimir tanto la palabra como el número de caracteres de la misma.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Frase introducida por el Usuario
		String fraseUsuario;

		// Guardará la palabra más larga de la frase
		String palabraMasLarga = "";

		// Guardará la longitud de la palabra actual con la que se está haciendo la
		// comprobación sobre la mayor palabra
		int longitudPalabraActual = 0;

		// Guardará la longitud de la mayor palabra que se encuentre en la frase
		int longitudPalabraMayor = 0;

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase: ");
		fraseUsuario = read.nextLine();

		// Frase original separada por partes en un array
		String frasePorPalabras[] = fraseUsuario.split(" ");

		// Recorremos la frase separada por partes
		for (int i = 0; i < frasePorPalabras.length; i++) {
			// Guardamos en la longitud de palabra actual, la longitud de la palabra (i)
			longitudPalabraActual = frasePorPalabras[i].length();

			// Comprobamos si la longitud de la palabra actual es mayor a la longitud de la
			// mayor palabra, y en caso de ser verdadero*
			if (longitudPalabraActual > longitudPalabraMayor) {
				// *La palabra más larga se sobreescribirá a la actual (i) con la que se ha
				// realizado la
				// comprobación
				palabraMasLarga = frasePorPalabras[i];

				// Y la longitud de la palabra mayor se sobreescribirá por la longitud de la
				// palabra más larga
				longitudPalabraMayor = palabraMasLarga.length();
			}

		}

		// Mostramos al usuario cual es la palabra mas larga de la frase y cuántos
		// carácteres tiene
		System.out.println("La palabra más larga de la frase es: " + palabraMasLarga);
		System.out.println("La palabra " + palabraMasLarga + " tiene " + longitudPalabraMayor + " carácteres");
	}
}
