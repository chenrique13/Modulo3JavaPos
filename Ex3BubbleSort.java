import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		int n = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o total de alunos: ");
		int totalAlunos = scanner.nextInt();
		double aux;
		String auxN;
		double[] vetorNota1 = new double[totalAlunos];
		double[] vetorNota2 = new double[totalAlunos];
		double[] vetorMedia = new double[totalAlunos];
		String[] vetorNome = new String[totalAlunos];

		for (int i = 0; i < totalAlunos; i++) {
			System.out.println("\nDigite o nome: ");
			String nome = scanner.next();
			vetorNome[i] = nome;
			System.out.println("Digite a nota 1: ");
			double nota1 = scanner.nextDouble();
			vetorNota1[i] = nota1;
			System.out.println("Digite a nota 2: ");
			double nota2 = scanner.nextDouble();
			vetorNota2[i] = nota2;
			double media = ((nota1 + nota2) / 2);
			vetorMedia[i] = media;

		}
		
/////////////////////// Bubble Sort ////////////////////////////
		for (int i = 0; i < totalAlunos; i++) {
			for (int j = 1; j < totalAlunos; j++) {
				if (vetorMedia[j - 1] > vetorMedia[j]) {
					aux = vetorNota1[j];
					vetorNota1[j] = vetorNota1[j - 1];
					vetorNota1[j - 1] = aux;
					///////////////////////////
					aux = vetorNota2[j];
					vetorNota2[j] = vetorNota2[j - 1];
					vetorNota2[j - 1] = aux;
					////////////////////////
					aux = vetorMedia[j];
					vetorMedia[j] = vetorMedia[j - 1];
					vetorMedia[j - 1] = aux;
					/////////////////////////
					auxN = vetorNome[j];
					vetorNome[j] = vetorNome[j - 1];
					vetorNome[j - 1] = auxN;
				}
			}
		}
		for (int u = 0; u < totalAlunos; u++) {

			System.out.println("\n" + (n = n + 1));
			System.out.println("Nome: " + vetorNome[u]);
			System.out.println("1 nota: " + vetorNota1[u]);
			System.out.println("2 nota: " + vetorNota2[u]);
			System.out.println("Media: " + vetorMedia[u]);
		}
	}
}
