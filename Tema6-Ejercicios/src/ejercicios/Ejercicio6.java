package ejercicios;

import java.awt.KeyEventPostProcessor;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.Position;

/**
 * Diseñar un programa que solicite al usuario una frase y una palabra. A
 * continuación buscará cuántas veces aparece la palabra en la frase.
 * 
 * @author fernando
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		// Frase del usuario introducida por teclado
		String fraseUsuario;

		// Palabra que el usuario busca
		String palabra;

		// Cantidad de veces que se repite la palabra
		int cantidadPalabras = 0;

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase:");
		fraseUsuario = read.nextLine();

		// Le pedimos la palabra que desea buscar
		System.out.println("Introduce la palabra a buscar en la frase:");
		palabra = read.nextLine();

		// Posición dónde la palabra empieza
		int posPalabra = 0;

		// Auxiliar de la posición original
		int posPalabraAux;

		// Buscamos la posición dónde empieza la primera palabra
		posPalabra = fraseUsuario.indexOf(palabra, posPalabra);

		// Mientras la posición de la primera palabra encontrada sea mayor o igual a 0,
		// es decir que exista esa palabra en la frase *
		while (posPalabra >= 0) {

			// *Incrementamos la cantidad en 1
			cantidadPalabras++;

			// Volvmos a realizar una búsqueda de la palabra a raíz de la siguiente posición
			// a la encontrada
			posPalabraAux = fraseUsuario.indexOf(palabra, posPalabra + 1);
			posPalabra = posPalabraAux; //En caso de que se haya encontrado la palabra, incrementará la cantidad de palabras en 1. Si no se ha encontrado, saldrá del bucle
		}

		// Mostramos la cantidad de veces que se encuentra la  palabra en la frase
		System.out.println("La palabra " + palabra + " se encuentra " + cantidadPalabras + " vez en la frase");
	}

}
