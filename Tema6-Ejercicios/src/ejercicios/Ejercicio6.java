package ejercicios;

import java.util.Scanner;

/**
 * Diseñar un programa que solicite al usuario una frase y una palabra. A
 * continuación buscará cuántas veces aparece la palabra en la frase.
 * 
 * @author fernando
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		String fraseUsuario;
		String palabra;
		int cantidadPalabras = 0;
		Scanner read = new Scanner(System.in);

		System.out.println("Introduce una frase:");
		fraseUsuario = read.nextLine();

		System.out.println("Introduce la palabra a buscar en la frase:");
		palabra = read.next();

		if (fraseUsuario.contains(palabra)) {
			cantidadPalabras++;
		}

		System.out.println(cantidadPalabras);
	}

}
