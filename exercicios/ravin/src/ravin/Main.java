package ravin;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		mostrarMenuPrincipal();
	}

	public static void mostrarMenuPrincipal() {
		Scanner scanner = new Scanner(System.in);
		int opcaoSelecionada = 0;
		int opcaoSubMenuSelecionada = 0;
		do {
			System.out.println("\n### RAVIN - Sistema de controle de comandas e mesas ###");
			System.out.println("                  =========================");
			System.out.println("                  |     1 - Mesas         |");
			System.out.println("                  |     2 - Comandas      |");
			System.out.println("                  |     3 - Clientes      |");
			System.out.println("                  |     4 - Produtos      |");
			System.out.println("                  |     5 - Forncedores   |");
			System.out.println("                  |     6 - Funcionarios  |");
			System.out.println("                  |     0 - Sair          |");
			System.out.println("                  =========================\n");

			System.out.print("Opção -> ");
			opcaoSelecionada = scanner.nextInt();
			
			System.out.print("\n");
			
			opcaoSubMenuSelecionada = mostrarMenuCadastros();
			
			switch (opcaoSelecionada) {
			case 1:
				System.out.println("### RAVIN - Mesas ###");
				
				break;
			case 2:
				System.out.println("### RAVIN - Comandas ###");

				break;
			case 3:
				System.out.println("### RAVIN - Clientes ###");
				break;
			case 4:
				System.out.println("### RAVIN - Produtos ###");
				break;
			case 5:
				System.out.println("### RAVIN - Fornecedores ###");
				break;
			case 6:
				System.out.println("### RAVIN - Funcionários ###");
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcaoSelecionada != 0);
	}

	public static int mostrarMenuCadastros() {
		Scanner scanner = new Scanner(System.in);
		int opcaoSubMenu = 0;

		System.out.println("\n\n### RAVIN - Sistema de controle de comandas e mesas ###");
		System.out.println("\n                  =========================");
		System.out.println("                  |     1 - Listar         |");
		System.out.println("                  |     2 - Cadastrar      |");
		System.out.println("                  |     3 - Excluir        |");
		System.out.println("                  |     4 - Editar         |");
		System.out.println("                  |     0 - Sair           |");
		System.out.println("\n                  =========================");

		System.out.print("Opção -> ");
		opcaoSubMenu = scanner.nextInt();

		return opcaoSubMenu;
	}
}
