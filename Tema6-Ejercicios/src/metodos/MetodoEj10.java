package metodos;

public class MetodoEj10 {
	/**
	 * Esta función irá comprobando carácter a carácter de la palabra si se
	 * encuentra en el conjunto 2, y si es así, mirará en que posición y la
	 * sustituirá por la correspondiente posición del conjunto 1
	 * 
	 * @param conjunto1 carácteres primer conjunto
	 * @param conjunto2 carácteres segundo conjunto
	 * @param c carácteres de la palabra introducida por el ususario
	 * @return el carácter decodificado
	 */
	public static char decodifica(char conjunto1[], char conjunto2[], char c) {
		char caracterCodificado=c;
		for (int i = 0; i < conjunto2.length; i++) {
				if (c==conjunto2[i]) {
					caracterCodificado=conjunto1[i];
				}
		}
		return caracterCodificado;
	}
}
