package ejercicios;

import java.util.Scanner;

/**
 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es
 * decir, la que contiene menos caracteres.
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos el scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Guardará la longitud de la primera frase
		int longitudCad1;

		// Primera frase
		String cadena1;

		// Le pedimos al usuario la primera frase
		System.out.println("Introduce la primera frase:");
		cadena1 = read.nextLine();

		// Guardará la longitud de la segunda frase
		int longitudCad2;

		// Segunda frase
		String cadena2;

		// Le pedimos al usuario la segunda frase
		System.out.println("Introduce la segunda frase:");
		cadena2 = read.nextLine();

		// Guardamos la longitud de la primera cadena
		longitudCad1 = cadena1.length();

		// Guardamos la longitud de la segunda cadena
		longitudCad2 = cadena2.length();

		// Comprobamos cual es mayor de las dos, o si son iguales
		if (longitudCad1 > longitudCad2) {
			System.out.println("La primera frase es mayor a la segunda");
		}

		else if (longitudCad2 > longitudCad1) {
			System.out.println("La segunda frase es mayor a la primera");
		}

		else {
			System.out.println("Ambas frases tienen la misma longitud");
		}

	}

}
