import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int condicao1 = 1;
		int senhaN = -1, senhaP = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Selecione uma opcao: \n" + "1 - Senha Normal \n" + "2 - Senha Preferencial \n"
					+ "3 - Atendimento \n" + "4 - Listar senhas \n" + "0 - Finalizar Programa");
			int menu = scanner.nextInt();
			switch (menu) {

			case 1:
				Senha n = new Senha();
				senhaN = senhaN + 2;
				n.setNumero(senhaN);
				n.setTipo("N" + n.getNumero());
				System.out.println(n.getTipo() + "\n");

				///// adicionar na lista
				condicao1 = 1;
				break;

			case 2:
				Senha p = new Senha();
				senhaP = senhaP + 2;
				p.setNumero(senhaP);
				p.setTipo((p.getNumero()) + " Preferencial");
				System.out.println("Senha " + p.getTipo() + "\n");

				///// adicionar na lista e executar o Insertion
				condicao1 = 1;
				break;

			case 3:
				////////// atendimento
				/////////////////////////////
				System.out.println("Metodo POP\n");

				condicao1 = 1;
				break;
				
				//////////// Listar Fila
			case 4:
				/////////////////////////////
				System.out.println("Metodo Listar senhas\n");
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

		} while (condicao1 != 0);
	}
}
