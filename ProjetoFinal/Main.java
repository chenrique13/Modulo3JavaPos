import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int condicao1 = 1;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\nSelecione uma opcao: \n" + "1 - Senha Normal \n" + "2 - Senha Preferencial \n"
					+ "3 - Atendimento \n" + "4 - Listar senhas \n" + "0 - Finalizar Programa");
			try {

				int menu = scanner.nextInt();
				switch (menu) {

				case 1:
					Fila.inserir(Gerador.senhaNormal());
					condicao1 = 1;
					break;

				case 2:
					Fila.inserir(Gerador.senhaPreferencial());
					Fila.insertioSort();
					condicao1 = 1;
					break;

				case 3:
					System.out.println("Proximo da fila!\n");
					Fila.remover();
					condicao1 = 1;
					break;

				case 4:
					System.out.println("Listando senhas...\n");
					Fila.listar();
					condicao1 = 1;
					break;

				case 0:
					System.out.println("Programa finalizado!");
					condicao1 = 0;
					break;

				default:
					System.out.println("Opcao incorreta!\n");
					condicao1 = 1;
					break;
				}
			} catch (Exception e) {
				System.out.println("Opcao incorreta!\n");
				scanner.next();
			}

		} while (condicao1 != 0);
		scanner.close();
	}
}
