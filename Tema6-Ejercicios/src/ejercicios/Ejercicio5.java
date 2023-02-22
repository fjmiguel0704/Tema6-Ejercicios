package ejercicios;

import java.util.Scanner;

/**
 * Introducir por teclado una frase palabra a palabra, y mostrar la frase
 * completa separando las palabras introducidas con espacios en blanco. Terminar
 * de leer la frase cuando alguna de las palabras introducidas sea la cadena
 * “fin” escrita con cualquier combinación de mayúsculas/minúsculas. La cadena
 * “fin” no aparecerá en la frase final.
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Frase compuesta por las palabras
		String fraseUsuario = " ";

		// Palabras de la frase introducidas por el usuario
		String palabras = " ";

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Le solicitamos al usuario las palabras
		System.out.println("Introduce una frase palabra por palabra: ");

		// Mientras la palabra introducida sea distinta a "fin"
		while (!palabras.equalsIgnoreCase("fin")) {

			// Le agregamos a la frase todas las palabras introducidas
			fraseUsuario += palabras + " ";
			palabras = read.nextLine();
		}

		// Eliminamos los espacios en blanco del principio y final de la cadena
		String sinEspacios = fraseUsuario.trim();
		
		// Mostramos la frase final completa
		System.out.println(sinEspacios);
	}

}
