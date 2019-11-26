
public class Fila {

	private static int dimensaoFila = 0;
	private static int[] fila = new int[dimensaoFila];

	public static void inserir(Integer senha) {

		int[] filaAux = new int[fila.length];

		for (int i = 0; i < filaAux.length; i++) {
			filaAux[i] = fila[i];
		}
		dimensaoFila += 1;
		fila = new int[dimensaoFila];
		for (int i = 0; i < filaAux.length; i++) {
			fila[i] = filaAux[i];
		}
		fila[dimensaoFila - 1] = senha;
	}

	public static void remover() {
		if (dimensaoFila > 1) {
			int[] filaAux = new int[fila.length];

			for (int i = 0; i < filaAux.length; i++) {
				filaAux[i] = fila[i];
			}
			dimensaoFila -= 1;
			fila = new int[dimensaoFila];
			for (int i = 0; i < filaAux.length; i++) {
				fila[i - 1] = filaAux[i];
			}
		}
	}

	public static int[] getfila() {
		return fila;
	}

	public static int getDimensaoFila() {
		return dimensaoFila;
	}
}
