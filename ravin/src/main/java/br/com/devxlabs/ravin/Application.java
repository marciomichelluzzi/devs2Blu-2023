package br.com.devxlabs.ravin;

import javax.swing.JOptionPane;

import br.com.devxlabs.ravin.utility.textconstants.ViewsTextConstants;
import br.com.devxlabs.ravin.view.EmployeeView;

public class Application {

	public static EmployeeView employeeView;

	public static void main(String[] args) {
		boolean running = true;
		int seletedOption = 0;

		employeeView = new EmployeeView();

		while (running) {
			seletedOption = Integer.parseInt(JOptionPane.showInputDialog(buildMainMenu()));

			switch (seletedOption) {
			case 1:
				employeeView.showEntityMainMenu();
			case 2:
				// Chamar menu cliente
				break;
			case 3:
				// Chamar menu produto
				break;
			case 4:
				// Chamar menu cardapio
				break;
			case 5:
				// Chamar menu mesa
				break;
			case 6:
				// Chamar menu pedido
				break;
			case 7:
				running = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
				break;
			}
		}
	}

	public static String buildMainMenu() {
		StringBuilder builder = new StringBuilder();
		builder.append(" ==================== RAVIN ==================== ");
		builder.append(ViewsTextConstants.BREAK_LINE);
		builder.append("1 - Funcionarios \n");
		builder.append("2 - Clientes \n");
		builder.append("3 - Produtos \n");
		builder.append("4 - Cardapios \n");
		builder.append("5 - Mesas \n");
		builder.append("6 - Pedidos \n");
		builder.append("7 - Sair");

		return builder.toString();
	}
}
