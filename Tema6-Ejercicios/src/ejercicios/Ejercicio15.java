package ejercicios;

import java.util.Scanner;

import metodos.MetodoEj15;

public class Ejercicio15 {
	/**
	 * Modificar el ejercicio anterior para que el programa indique al jugador 2, en
	 * cada intento, cuántas letras coinciden con el texto original.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String palabraJ1;
		String intentosJ2="";
		int posArrayDes = 0;
		int posicionCaracter = 0;
		String aciertos = "";

		Scanner read = new Scanner(System.in);
		System.out.println("Jugador 1, introduce una palabra: ");
		palabraJ1 = read.next();

		char palabraJ1Array[] = palabraJ1.toCharArray();
		char palabraDesArray[] = new char[palabraJ1Array.length];

		MetodoEj15.transposicion(posicionCaracter, posArrayDes, palabraJ1Array, palabraDesArray);
		System.out.println(palabraDesArray);

		while (!intentosJ2.equals(palabraJ1)) {
			aciertos="";
			System.out.println("Jugador 2, intenta adivinar la palabra: ");
			intentosJ2 = read.next();

			for (int i = 0; i < intentosJ2.length(); i++) {
				if (intentosJ2.charAt(i) == palabraJ1.charAt(i)) {
					aciertos += palabraJ1.charAt(i);
				}

				else {
					aciertos += "-";
				}
			}

			System.out.println(aciertos);
		}

		System.out.println("¡Ha adivinado la palabra!");

	}

}
