import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o total de alunos: ");
		int totalAlunos = scanner.nextInt();
		
		double [] vetorNota1 = new double[totalAlunos];
		double [] vetorNota2 = new double[totalAlunos];
		String [] vetorNome = new String[totalAlunos];
		for(int i = 0 ; i< totalAlunos; i++) {
			System.out.println("\nDigite o nome: ");
			String nome = scanner.next();
			vetorNome[i] = nome;
			System.out.println("Digite a nota 1: ");
			int nota1 = scanner.nextInt();
			vetorNota1[i] = nota1;
			System.out.println("Digite a nota 2: ");
			int nota2 = scanner.nextInt();
			vetorNota2[i] = nota2;
		}
		

		for (int u = 0; u < totalAlunos; u++) {
			System.out.println("\n"+vetorNome[u]);
			System.out.println(vetorNota1[u]);
			System.out.println(vetorNota2[u]);
		}
	}
}
