
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random gerador = new Random();

		System.out.println("Digite o total de alunos: ");
		int totalAlunos = scanner.nextInt();

		int[] VetorNumeros = new int[totalAlunos];

		for (int i = 0; i < totalAlunos; i++) {
			int nRandom = gerador.nextInt(51);

			VetorNumeros[i] = nRandom;
		}
		System.out.println("\nAntes\n");
		for (int u = 0; u < totalAlunos; u++) {
			System.out.println(VetorNumeros[u]);
		}
		/////////////////////// Insertion Sort ////////////////////////
		for (int i = 1; i < VetorNumeros.length; i++) {
			int j = i - 1;
			int key = VetorNumeros[i];

			while ((j >= 0) && (VetorNumeros[j] >= key)) {
				VetorNumeros[j + 1] = VetorNumeros[j];
				j--;
			}
			VetorNumeros[j + 1] = key;
		}
		System.out.println("\nDepois\n");
		for (int u = 0; u < totalAlunos; u++) {
			System.out.println(VetorNumeros[u]);
		}

	}
}
