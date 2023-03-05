package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
	/**
	 * Diseñar un algoritmo que lea del teclado una frase e indique, para la letras
	 * que aparecen en la frase, cuántas veces se repite cada una. Se consideran
	 * iguales las letras mayúsculas y las minúsculas para realizar la cuenta. Un
	 * ejemplo sería:
	 * 
	 * Frase : En un lugar de la Mancha. 
	 * Resultado : 
	 * a: 4 veces 
	 * d: 1 vez 
	 * e: 2 veces
	 * . . .
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String fraseUsuario;

		Scanner read = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		fraseUsuario = read.nextLine();

		char letrasFrase[] = fraseUsuario.toCharArray();
		char letraActual;
		int contadorLetras = 0;

		for (int i = 0; i < letrasFrase.length; i++) {
			letraActual = letrasFrase[i];

			while (letrasFrase[i] == letraActual) {
				i++;
				contadorLetras++;
				if (i == letrasFrase.length) {
					i = 0;
				}
			}
			
			while (letrasFrase[i] != letraActual) {
				i++;
				
				if (i == letrasFrase.length) {
					int posLetraActual = fraseUsuario.lastIndexOf(letraActual);
					i = posLetraActual+1;
					break;
				}

			}
			
			if (letrasFrase[i]==letraActual) {
				contadorLetras++;
			}
			
			System.out.println("La letra " + letraActual + " se encuentra " + contadorLetras + " veces en la frase");
			contadorLetras = 0;
			int posLetraActual = fraseUsuario.lastIndexOf(letraActual);
			System.out.println(posLetraActual);
			i = posLetraActual;
		}
	}

}
