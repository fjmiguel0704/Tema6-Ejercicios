package metodos;

import java.util.Arrays;

public class MetodoEj15 {
	public static void transposicion (int posicionCaracter, int posArrayDes, char palabraJ1Array[], char palabraDesArray[]) {
		do {
			posicionCaracter = (int) (Math.random() * palabraJ1Array.length - 1);

			palabraDesArray[posArrayDes] += palabraJ1Array[posicionCaracter];

			int i = palabraJ1Array.length - posicionCaracter - 1;
			System.arraycopy(palabraJ1Array, posicionCaracter + 1, palabraJ1Array, posicionCaracter, i);
			palabraJ1Array = Arrays.copyOf(palabraJ1Array, palabraJ1Array.length - 1);

			posArrayDes++;
		} while (palabraJ1Array.length != 0);
	}
}
