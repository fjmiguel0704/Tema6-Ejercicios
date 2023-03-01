package ejercicios;

import java.util.Scanner;

import metodos.MetodoEj10;

public class Ejercicio10 {
	/**
	 * Realizar un programa descodificador. La solución es tan sencilla como
	 * utilizar la función diseñada en el ejercicio anterior intercambiando los
	 * conjuntos entre sí.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Palabra introducida por el usuario
		String palabraUsuario;

		// Palabra decodificada al primer conjunto
		String palabraDecodificada = "";

		// Creamos el scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Definimos el primer conjunto de caracteres
		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// Definimos el segundo conjunto de caracteres
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Le pedimos al usuario que introduzca una palabra
		System.out.println("Introduce una palabra: ");
		palabraUsuario = read.next();

		// Convertimos todos los carácteres de la palabra del usuario en minúsculas
		palabraUsuario = palabraUsuario.toLowerCase();

		// Recorremos la palabra introducida por el usuario
		for (int i = 0; i < palabraUsuario.length(); i++) {
			// Y vamos formando la palabra decodificada caracter a caracter, llamando a la
			// función decodifica, a la que le pasamos como parámetro el conjunto1, conjunto2 y letra
			// a letra de la palabra
			palabraDecodificada += MetodoEj10.decodifica(conjunto1, conjunto2, palabraUsuario.charAt(i));
		}

		// Mostramos la palabra decodificada
		System.out.println(palabraDecodificada);
	}

}
