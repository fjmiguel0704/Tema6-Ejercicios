package ejercicios;

import java.util.Scanner;

import metodos.MetodoEj9;

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
				
				// Palabra 
				String palabraCodificada="";
				
				// Creamos el scanner para leer por teclado
				Scanner read = new Scanner (System.in);
				
				// Definimos el primer conjunto de caracteres
				char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

				// Definimos el segundo conjunto de caracteres
				char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
				
				System.out.println("Introduce una palabra: ");
				palabraUsuario=read.next();
				
				palabraUsuario=palabraUsuario.toLowerCase();
				
				for (int i = 0; i<palabraUsuario.length();i++) {
					palabraCodificada+=MetodoEj9.codifica(conjunto1, conjunto2, palabraUsuario.charAt(i));
				}
				System.out.println(palabraCodificada);

	}

}
