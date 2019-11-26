
public class Metodos {

	public static void ListarFila() {

	}

	public static void OrdenarInsertion(int VetorNumeros[]) {
		for (int i = 1; i < VetorNumeros.length; i++) {
			int j = i - 1;
			int key = VetorNumeros[i];

			while ((j >= 0) && (VetorNumeros[j] >= key)) {
				VetorNumeros[j + 1] = VetorNumeros[j];
				j--;
			}
			VetorNumeros[j + 1] = key;
		}
	}
}
