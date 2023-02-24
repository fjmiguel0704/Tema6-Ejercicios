package ejercicios;

import java.util.Scanner;

/**
 * Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan
 * siempre comienzan sus frases con “Javalín, javalón”, para después hacer una
 * pausa más o menos larga (la pausa se representa mediante espacios en blanco o
 * tabuladores) y a continuación expresan el mensaje. Existe un dialecto que no
 * comienza sus frases con la muletilla anterior, pero siempre las terminan con
 * un silencio, más o menos prolongado y la coletilla “javalén, len, len”. Se
 * pide diseñar un traductor que, en primer lugar, nos diga si la frase
 * introducida está escrita en el idioma de Javalandia (en cualquiera de sus
 * dialectos), y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
 * 
 * @author fjmiguel
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		// Frase introducida por el usuario
		String fraseUsuario;

		// Frase que guardará la frase original del usuario pero sin las coletillas del
		// dialesto javalandia
		String fraseUsuarioReplaceSinColetilla = "";

		// Auxiliar de la frase sin coletillas
		String auxFraseUsuarioReplaceSinColetilla = "";

		// Scanner para leer por teclado
		Scanner read = new Scanner(System.in);

		// Le pedimos al usuario que introduzca una frase
		System.out.println("Introduce una frase: ");
		fraseUsuario = read.nextLine();

		// Comprobamos si la frase introducida por el usuario comienza con las
		// coletillas del primer dialecto y termina con las coletillas del segundo
		// dialecto. En caso afirmativo*
		if (fraseUsuario.startsWith("Javalín, javalón") && fraseUsuario.endsWith("javalén, len, len")) {

			// Mostramos que la frase pertenece al idioma Javalandia
			System.out.println("La frase introducida está escrita en idioma Javalandia");

			// Eliminamos de la frase original las coletillas del primer dialecto y
			// guardamos la nueva frase (sin coletillas del primer dialecto) en una nueva
			// variable
			fraseUsuarioReplaceSinColetilla = fraseUsuario.replace("Javalín, javalón ", "");

			// Frase auxiliar será igual a la frase sin las primeras coletillas
			auxFraseUsuarioReplaceSinColetilla = fraseUsuarioReplaceSinColetilla;

			// Eliminamos de la frase sin las primeras coletillas, las coletillas del
			// segundo dialecto, las del final de la frase
			auxFraseUsuarioReplaceSinColetilla = fraseUsuarioReplaceSinColetilla.replace(" javalén, len, len", "");

			// Y mostramos la frase final traducida sin coletillas
			System.out.println("La frase traducida quedaría: " + auxFraseUsuarioReplaceSinColetilla);
		}

		// En caso contrario, si la frase introducida por el usuario comienza con las
		// coletillas del primer dialecto*
		else if (fraseUsuario.startsWith("Javalín, javalón")) {

			// Mostramos que la frase pertenece al idioma Javalandia
			System.out.println("La frase introducida está escrita en idioma Javalandia");

			// Eliminamos de la frase original introducida por el usuario las coletillas del
			// primer dialecto (principio de la frase)
			fraseUsuarioReplaceSinColetilla = fraseUsuario.replace("Javalín, javalón ", "");

			// Y mostramos la frase final traducida sin coletillas
			System.out.println("La frase traducida quedaría: " + fraseUsuarioReplaceSinColetilla);
		}

		// En caso contrario, si la frase introducida por el usuario termina con las
		// coletillas del segundo dialecto*
		else if (fraseUsuario.endsWith("javalén, len, len")) {

			// Mostramos que la frase pertenece al idioma Javalandia
			System.out.println("La frase introducida está escrita en idioma Javalandia");

			// Eliminamos de la frase original introducida por el usuario las coletillas del
			// segundo dialecto (final de la frase)
			fraseUsuarioReplaceSinColetilla = fraseUsuario.replace(" javalén, len, len", "");

			// Y mostramos la frase final traducida sin coletillas
			System.out.println("La frase traducida quedaría: " + fraseUsuarioReplaceSinColetilla);
		}

		// En caso contrario a todo lo anterior, mostramos un mensaje de que la frase
		// introducida no pertenece al idioma de javalandia
		else {
			System.out.println("No está escrita en idioma Javalandia");
		}

	}

}
