package ravin;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JOptionPane;

import ravin.enumeradores.Cargo;
import ravin.enumeradores.Escolaridade;
import ravin.enumeradores.EstadoCivil;
import ravin.enumeradores.StatusComanda;
import ravin.enumeradores.StatusMesa;
import ravin.enumeradores.StatusPreparoPedido;
import ravin.enumeradores.TipoProduto;
import ravin.modelos.Cliente;
import ravin.modelos.Comanda;
import ravin.modelos.Funcionario;
import ravin.modelos.Mesa;
import ravin.modelos.Pedido;
import ravin.modelos.Pessoa;
import ravin.modelos.Produto;
import ravin.utilidade.DateUtils;

public class Main {

	public static void main(String[] args) {

		// Pessoa pessoa = cadastrarPessoa();
		// Funcionario funcionario = cadastrarFuncionario();
		// Cliente cliente = cadastrarCliente();
		// Produto produto = cadastrarProduto();
		// Pedido pedido = cadastrarPedido();
		// Mesa mesa = cadastrarMesa();
		// Comanda comanda = cadastrarComanda();

		boolean executando = true;
		int opcaoSelecionada = 0;

		for (;executando;) {
			opcaoSelecionada = Integer.parseInt(JOptionPane.showInputDialog(montarMenuPrincipal()));

			switch (opcaoSelecionada) {
			case 1:
				// Chamar menu funcionario
				break;

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
				executando = false;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
				break;
			}
		}

	}

	public static Pessoa cadastrarPessoa() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id pessoa"));
		String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
		String endereco = JOptionPane.showInputDialog("Digite o endereço da pessoa");
		String telefone = JOptionPane.showInputDialog("Digite o telefone da pessoa");
		String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
		Date dataNascimento = DateUtils.stringToDate(
				JOptionPane.showInputDialog("Qual a data de nascimento da pessoa? \n Formato: dd/MM/yyyy"));
		String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
		boolean ativo = Boolean
				.parseBoolean(JOptionPane.showInputDialog("O usuário está ativo? \n 0 - Não \n 1 - Sim"));

		return new Pessoa(id, nome, endereco, telefone, cpf, dataNascimento, observacao, ativo);
	}

	public static Funcionario cadastrarFuncionario() {
		Pessoa pessoa = cadastrarPessoa();

		Funcionario funcionario = new Funcionario();
		funcionario.setRg(JOptionPane.showInputDialog("Digite o RG do funcionário:"));
		funcionario.setEstadoCivil(EstadoCivil.values()[Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o estado civíl do funcionario: \n [0 - Solteiro \n 1 - Casado \n 2 - Viúvo \n 3 - Divorciado \n 4 - Separado]"))]);
		funcionario.setCargo(Cargo.values()[Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o cargo do funcionário: \n 0 - Faxineiro \n 1 - Garçom \n 2 - Cozinheiro \n 3 - Gerente"))]);
		funcionario.setEscolaridade(Escolaridade.values()[Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a escolaridade do funcionario: \n 0 - Fundamental \n 1 - Médio \n 2 - Superior "))]);
		funcionario.setPis(Integer.parseInt(JOptionPane.showInputDialog("Digite o PIS do funcionário")));
		funcionario.setDataAdmissao(new Date());

		funcionario.setId(pessoa.getId());
		funcionario.setCpf(pessoa.getCpf());
		funcionario.setEndereco(pessoa.getEndereco());
		funcionario.setDataNascimento(pessoa.getDataNascimento());
		funcionario.setOberservacao(pessoa.getOberservacao());
		funcionario.setTelefone(pessoa.getTelefone());

		return funcionario;
	}

	public static Cliente cadastrarCliente() {

		Pessoa pessoa = cadastrarPessoa();

		Cliente cliente = new Cliente();
		cliente.setId(0);
		cliente.setAlergias(JOptionPane.showInputDialog("Digite a lista de alergias do cliente"));
		cliente.setVip(Boolean.parseBoolean(JOptionPane.showInputDialog("O cliente é VIP?  \n 0 - Não \n 1 - Sim")));

		cliente.setId(pessoa.getId());
		cliente.setCpf(pessoa.getCpf());
		cliente.setEndereco(pessoa.getEndereco());
		cliente.setDataNascimento(pessoa.getDataNascimento());
		cliente.setOberservacao(pessoa.getOberservacao());
		cliente.setTelefone(pessoa.getTelefone());

		return cliente;
	}

	public static Produto cadastrarProduto() {

		String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
		String descricao = JOptionPane.showInputDialog("Digite a descrição do produto:");
		String codigo = JOptionPane.showInputDialog("Digite o código do produto");
		double precoCusto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de custo do produto:"));
		double precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda do produto:"));
		String tempoPreparo = JOptionPane.showInputDialog("Digite a descrição do tempo de preparo do produto");
		String observacoes = JOptionPane.showInputDialog("Digite as observações do produto:");
		TipoProduto tipoProduto = TipoProduto.values()[Integer.parseInt(
				JOptionPane.showInputDialog("Digite o tipo do produto \n 0 - Lanche \n 1 - Bebida \n 2 - Sobremesa"))];
		boolean ativo = Boolean
				.parseBoolean(JOptionPane.showInputDialog("O produto está ativo? \n 0 - Não \n 1 - Sim"));

		return new Produto(0, nome, descricao, codigo, precoCusto, precoVenda, tempoPreparo, observacoes, tipoProduto,
				ativo);

	}

	public static Pedido cadastrarPedido() {
		Pedido pedido = new Pedido();

		pedido.setDataHoraSolicitacao(new Timestamp(new Date().getTime()));
		pedido.setObservacao(JOptionPane.showInputDialog("Observações:"));
		pedido.setQuantidade(Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de items que você quer para esse pedido")));
		pedido.setStatusPreparo(StatusPreparoPedido.SOLICITADO);

		return pedido;
	}

	public static Mesa cadastrarMesa() {
		Mesa mesa = new Mesa();

		mesa.setCodigo(JOptionPane.showInputDialog("Digite o código da mesa:"));
		mesa.setNome(JOptionPane.showInputDialog("Digite o nome da mesa:"));
		mesa.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da mesa:")));
		mesa.setStatusMesa(StatusMesa.DISPONIVEL);

		return mesa;

	}

	public static Comanda cadastrarComanda() {
		Comanda comanda = new Comanda();

		comanda.setCodigo(JOptionPane.showInputDialog("Digite o código da comanda:"));
		comanda.setObservacoes(JOptionPane.showInputDialog("Digite as observações sobre a comanda:"));
		comanda.setStatus(StatusComanda.EM_ABERTO);

		return comanda;
	}

	public static String montarMenuPrincipal() {

		StringBuilder builder = new StringBuilder();
		builder.append(" ==================== RAVIN ==================== ");
		builder.append("\n");
		builder.append("1 - Funcionario \n");
		builder.append("2 - Cliente \n");
		builder.append("3 - Produto \n");
		builder.append("4 - Cardapio \n");
		builder.append("5 - Mesa \n");
		builder.append("6 - Pedido \n");
		builder.append("7 - Sair");

		return builder.toString();
	}

}
