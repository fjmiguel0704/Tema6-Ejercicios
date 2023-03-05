package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
	/**
	 * Un anagrama es un palabra, o frase, que resulta de la transposición de otra
	 * palabra o frase. Ejemplos de anagramas para la palabra roma son: amor, ramo o
	 * mora. Construir un programa que solicite al usuario dos palabras e indique si
	 * son anagramas una de otra.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Palabra 1
		String palabraUsuario1 = "";

		// Palabra 2
		String palabraUsuario2 = "";

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Pedimos al usuario que introduzca una palabra
		System.out.println("Introduce una palabra: ");
		palabraUsuario1 = read.next();

		// Pedimos al usuario que introduzca otra una palabra
		System.out.println("Introduce otra palabra: ");
		palabraUsuario2 = read.next();

		// Pasamos las cadenas a arrays de caracteres
		char palabra1[] = palabraUsuario1.toCharArray();
		char palabra2[] = palabraUsuario2.toCharArray();

		// Los ordenamos alfabéticamente
		Arrays.sort(palabra1);
		Arrays.sort(palabra2);

		// Comprobamos si ambas cadenas son iguales

		// Si son iguales, serán anagramas
		if (Arrays.equals(palabra1, palabra2)) {
			System.out.println("Las palabras son anagramas");
		}

		// Si no, no serán anagramas
		else {
			System.out.println("Las palabras no son anagramas");
		}
	}

}
