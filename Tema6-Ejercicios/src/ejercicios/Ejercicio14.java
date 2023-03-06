package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

import metodos.MetodoEj14;

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

	public static void main(String[] args) {
		String palabraJ1;
		String intentosJ2;
		int posArrayDes = 0;
		int posicionCaracter=0;

		Scanner read = new Scanner(System.in);
		System.out.println("Jugador 1, introduce una palabra: ");
		palabraJ1 = read.next();

		char palabraJ1Array[] = palabraJ1.toCharArray();
		char palabraDesArray[] = new char[palabraJ1Array.length];

		MetodoEj14.transposicion(posicionCaracter, posArrayDes, palabraJ1Array, palabraDesArray);
		System.out.println(palabraDesArray);

		do {
			System.out.println("Jugador 2, intenta adivinar la palabra: ");
			intentosJ2 = read.next();
		} while (!intentosJ2.equals(palabraJ1));

		System.out.println("¡Ha adivinado la palabra!");

	}
}
