package ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que lea una frase del teclado y nos indique si es
 * palíndroma, es decir, que la frase sea igual leyendo de izquierda a derecha,
 * que de derecha a izquierda, sin tener en cuenta los espacios. Un ejemplo de
 * frase palíndroma es: “Dábale arroz a la zorra el abad”. Las vocales con tilde
 * hacen que un algoritmo tome una frase palíndroma como si no lo fuese. Por
 * esto, supondremos que el usuario introduce la frase sin tildes.
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {

		// Frase introducida por el usuario
		String fraseUsuario;

		// Fase introducida por el usuario a la inversa
		String inversaFraseUsuario = " ";

		// Creamos el Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase:");
		fraseUsuario = read.nextLine();

		// Guardaremos en la variable "inversaFraseUsuario" la frase introducida por el
		// usuario a la inversa
		for (int i = fraseUsuario.length() - 1; i >= 0; i--) {
			inversaFraseUsuario += fraseUsuario.charAt(i);
		}

		// Eliminamos los espacios que contiene la frase original entre palabra y
		// palabra
		String fraseUsuarioReplace = fraseUsuario.replace(" ", "");

		// Eliminamos los espacios que contiene la frase inversa entre palabra y palabra
		String auxFraseUsuarioReplace = inversaFraseUsuario.replace(" ", "");

//		System.out.println(fraseUsuario);
//		System.out.println();
//		System.out.println(auxFraseUsuario);
//		System.out.println();
//		System.out.println(fraseUsuarioReplace);
//		System.out.println();
//		System.out.println(auxFraseUsuarioReplace);

		// Comprobamos si la frase original sin espacios entre medio es igual a la frase
		// inversa sin espacios entre medio, en caso de ser iguales, mostrará que son
		// palíndromas
		if (fraseUsuarioReplace.equalsIgnoreCase(auxFraseUsuarioReplace)) {
			System.out.println("La frase es palíndroma");
		}

		// En caso contrario, no son palíndromas
		else {
			System.out.println("La frase no es palíndroma");
		}
	}

}
