package metodos;

public class MetodoEj10 {
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
