import java.util.Scanner;

public class Recusao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		double numero = scanner.nextDouble();

		CalcularRecursao(numero);
		System.out.println(CalcularRecursao(numero));
		
		
		scanner.close();
	}

	public static double CalcularRecursao(double num) {
		if (num == 0) {
			return 1;
		}
		return num * CalcularRecursao(num - 1);
	}
}
