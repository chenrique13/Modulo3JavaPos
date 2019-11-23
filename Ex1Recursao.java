import java.util.Scanner;

public class Recursao {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double fatorial = 1;

		System.out.println("Digite um numero: ");
		double numero = scanner.nextDouble();

		while (numero > 0) {
			fatorial = fatorial * numero;
			numero--;
			System.out.print(" - " + fatorial );
		}

		
	}
}
