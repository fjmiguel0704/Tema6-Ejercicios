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
		String fraseUsuario;
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce una frase:");
		fraseUsuario=read.nextLine();
		
		for (int i = fraseUsuario.length()-1; i>=0;i--) {
			System.out.print(fraseUsuario.charAt(i));
		}
		
		if (fraseUsuario.startsWith(fraseUsuario)&&fraseUsuario.endsWith(fraseUsuario)) {
			System.out.println("La frase es palíndroma");
		}
		
		else {
			System.out.println("La frase no es palíndroma");
		}
	}

}
