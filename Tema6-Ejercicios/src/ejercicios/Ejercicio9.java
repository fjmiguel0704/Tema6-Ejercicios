package ejercicios;

import java.util.Scanner;

import metodos.MetodoEj9;

public class Ejercicio9 {
	/**
	 * Disponemos de la siguiente relación de letras: 
	 * 
	 * conjunto 1: e i k m p q r s t u v 
	 * conjunto 2: p v i u m t e r k q s
	 * 
	 * mediante la cual es posible codificar un texto, convirtiendo cada letra del
	 * conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no
	 * se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como
	 * minúsculas, mostrando siempre la codificación en minúsculas. Un ejemplo: la
	 * palabra «PaquiTo» se codifica como «matqvko». Se pide realizar un programa
	 * codificador, en el que se implemente la función:
	 *  char codifica(char conjunto1[],char conjunto2[], char c) 
	 *  que devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan.
	 * 
	 */

	public static void main(String[] args) {
		// Palabra introducida por el usuario
		String palabraUsuario;
		
		// Palabra codificada al segundo conjunto
		String palabraCodificada="";
		
		// Creamos el scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		// Definimos el primer conjunto de caracteres
		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		// Definimos el segundo conjunto de caracteres
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		
		// Le pedimos al usuario que introduzca una palabra 
		System.out.println("Introduce una palabra: ");
		palabraUsuario=read.next();
		
		// Convertimos todos los carácteres de la palabra del usuario en minúsculas 
		palabraUsuario=palabraUsuario.toLowerCase();
		
		// Recorremos la palabra introducida por el usuario 
		for (int i = 0; i<palabraUsuario.length();i++) {
			// Y vamos formando la palabra codificada caracter a caracter, llamando a la función 
			// codifica, a la que le pasamos como parámetro el conjunto1, conjunto2 y letra a 
			// letra de la palabra
			palabraCodificada+=MetodoEj9.codifica(conjunto1, conjunto2, palabraUsuario.charAt(i));
		}
		
		// Mostramos la palabra codificada 
		System.out.println(palabraCodificada);
	}

}