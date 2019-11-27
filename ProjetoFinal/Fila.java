
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
		if (dimensaoFila >= 1) {
			int[] filaAux = new int[fila.length];

			for (int i = 0; i < fila.length; i++) {
				filaAux[i] = fila[i];
			}
			dimensaoFila -= 1;
			fila = new int[dimensaoFila];
			for (int i = 1; i < filaAux.length; i++) {
				fila[i - 1] = filaAux[i];
			}
		}else {
			System.out.println("Fila vazia!\n");
		}
	}
	
	public static void listar() {
		for (int i = 0; i < dimensaoFila; i++) {
			System.out.println( fila[i]);
		}
	}
	
	public static void insertioSort() {
		for (int i = 0; i < getFila().length; i++) {
			int elemento = getFila()[i];
			int j = i-1;
			
			while ((j>=0) && (elemento<= getFila()[j])) {
				getFila() [j+1] = getFila() [j];
				j--;
			}
			getFila() [j+1] = elemento;
		}
	}

	public static int[] getFila() {
		return fila;
		
	}

	public static int getDimensaoFila() {
		return dimensaoFila;
	}
}
