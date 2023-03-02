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
//		String palabraUsuario1 = "";
//		String palabraUsuario2 = "";
//		String copiaPalabraUsuario1;
//
//		Scanner read = new Scanner(System.in);
//
//		System.out.println("Introduce una palabra: ");
//		palabraUsuario1 = read.next();
//
//		System.out.println("Introduce otra palabra: ");
//		palabraUsuario2 = read.next();
//
//		char palabra1[] = palabraUsuario1.toCharArray();
//		char palabra2[] = palabraUsuario2.toCharArray();
//
//		for (int i = 0; i < palabra1.length; i++) {
//			for (int j = 0; j < palabra2.length; j++) {
//			
//			}
//		}
		
		String palabraUsuario1 = "";
		String palabraUsuario2 = "";

		Scanner read = new Scanner(System.in);

		System.out.println("Introduce una palabra: ");
		palabraUsuario1 = read.next();

		System.out.println("Introduce otra palabra: ");
		palabraUsuario2 = read.next();

		char palabra1[] = palabraUsuario1.toCharArray();
		char palabra2[] = palabraUsuario2.toCharArray();

		Arrays.sort(palabra1);
		Arrays.sort(palabra2);

		if (Arrays.equals(palabra1, palabra2)) {
			System.out.println("Las palabras son anagramas");
		}

		else {
			System.out.println("Las palabras no son anagramas");
		}
	}

}
