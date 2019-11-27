import java.util.Scanner;

public class Fila {

	final int tamanhoFila = 6;
	int indice = 0;
	String arrayFila[] = new String[tamanhoFila];

	public void IserirNaFila() {
		if (indice == tamanhoFila) {
			System.out.println("Fila cheia!");
		} else {
			System.out.println("Digite o elemento a ser inserido: ");
			arrayFila[indice] = new Scanner(System.in).next();
			indice++;
		}
	}

	public void RemoverFila() {
		if (indice == 0) {
			System.out.println("Fila Vazia! ");
		}
		if (indice == 1) {
			indice = 0;
		}
		if (indice > 1) {
			for (int i = 0; i < (indice - 1); ++i) {
				arrayFila[i] = arrayFila[i + 1];
			}
			indice--;
		}
	}

	public void ExibirFila() {
		System.out.println("Fila: ");
		for (int i = 0; i < indice; ++i) {
			System.out.println(arrayFila[i] + " ");
		}
		System.out.println("\n");
	}

	public void LimparFila() {
		System.out.println("Fila Limpa!");
		indice = 0;
	}
}
