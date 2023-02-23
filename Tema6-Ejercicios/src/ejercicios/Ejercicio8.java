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
		String fraseUsuario;
		String fraseUsuarioReplaceSinColetilla = "";
		String auxfraseUsuarioReplaceSinColetilla = "";

		Scanner read = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		fraseUsuario = read.nextLine();

		if (fraseUsuario.startsWith("Javalín, javalón")) {
			System.out.println("La frase introducida está escrita en idioma Javalandia");
			fraseUsuarioReplaceSinColetilla = fraseUsuario.replace("Javalín, javalón ", "");
			System.out.println("La frase traducida quedaría: " + fraseUsuarioReplaceSinColetilla);
		}

		else if (fraseUsuario.endsWith("javalén, len, len")) {
			System.out.println("La frase introducida está escrita en idioma Javalandia");
			fraseUsuarioReplaceSinColetilla = fraseUsuario.replace(" javalén, len, len", "");
			System.out.println("La frase traducida quedaría: " + fraseUsuarioReplaceSinColetilla);
		}

		else if (fraseUsuario.startsWith("Javalín, javalón") && fraseUsuario.endsWith("javalén, len, len")) {
			System.out.println("La frase introducida está escrita en idioma Javalandia");
			fraseUsuarioReplaceSinColetilla = fraseUsuario.replace("Javalín, javalón ", "");
			auxfraseUsuarioReplaceSinColetilla = fraseUsuarioReplaceSinColetilla;
			auxfraseUsuarioReplaceSinColetilla = fraseUsuario.replace(" javalén, len, len", "");
		}

		else {
			System.out.println("No está escrita en idioma Javalandia");
		}

	}

}
