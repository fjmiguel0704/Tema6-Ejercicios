package metodos;

public class MetodoEj9 {
	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		char caracterCodificado=c;
		for (int i = 0; i < conjunto1.length; i++) {
				if (c==conjunto1[i]) {
					caracterCodificado=conjunto2[i];
				}
		}
		return caracterCodificado;
	}

}
