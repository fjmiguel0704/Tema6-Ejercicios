package ejercicios;

import java.util.Scanner;

import metodos.MetodoEj4;

/**
 * Diseñar una función a la que se le pase una cadena de caracteres y la
 * devuelva invertida. Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”.
 * Recuerda probar la función en un main.
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Frase introducida por el usuario
		String cadenaUsuario;

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase: ");
		cadenaUsuario = read.nextLine();

		// Llámamos al método que devuelve la frase inversa para mostrarla por pantalla
		MetodoEj4.fraseInversa(cadenaUsuario);
	}

}
