package metodos;

public class MetodoEj4 {

	/**
	 * Este método recorre la frase introducida por el usuario desde el final hasta
	 * el principio y va imprimiendo por consola valor a valor de cada una de las
	 * posiciones según se va decrementando
	 * 
	 * @param frase introducida por el usuario
	 */
	public static void fraseInversa(String frase) {
		for (int i = frase.length() - 1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}
	}
}
