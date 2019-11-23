public class SelectionSort {

	public static void main(String[] args) {

		char[] letras = { 'g', 'z', 'p', 'q','a' };
		
		for (int i = 0; i < letras.length; i++) {
			int indice = i;

			for (int j = i + 1; j < letras.length; j++) {
				if (letras[j] < letras[indice]) {
					indice = j;
				}
				char aux = letras[indice];
				letras[indice] = letras[i];
				letras[i] = aux;
			}
			System.out.println(letras[i]);
		}
		
	}

}
