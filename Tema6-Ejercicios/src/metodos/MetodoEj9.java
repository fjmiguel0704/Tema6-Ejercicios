package metodos;

public class MetodoEj9 {

	/**
	 * Esta función irá comprobando carácter a carácter de la palabra si se
	 * encuentra en el conjunto 1, y si es así, mirará en que posición y la
	 * sustituirá por la correspondiente posición del conjunto 2
	 * 
	 * @param conjunto1 carácteres primer conjunto
	 * @param conjunto2 carácteres segundo conjunto
	 * @param c carácteres de la palabra introducida por el ususario
	 * @return el carácter codificado
	 */
	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		char caracterCodificado = c;
		for (int i = 0; i < conjunto1.length; i++) {
			if (c == conjunto1[i]) {
				caracterCodificado = conjunto2[i];
			}
		}
		return caracterCodificado;
	}

}
