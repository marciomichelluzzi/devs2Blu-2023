package ravin;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static ravin.utilidade.ConstantesTextos.*;

import javax.swing.JOptionPane;

import ravin.controladores.FuncionarioController;
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
import ravin.utilidade.UtilitarioData;


/**
 * 
 * @author mmichelluzzi
 * 
 * Funcionalidades que devem ser contempladas no desenvolvimento do projeto
 * 
 * 1 - Funcionario
	* Cadastrar
	* Alterar
	* Excluir
	* Consultar
	* Listar Todas
	* Consultar Garçons Disponíveis
2 - Cliente
	* Cadastrar
	* Alterar
	* Excluir
	* Consultar
	* Listar Todas
3 - Produto
	* Cadastrar
	* Alterar
	* Excluir
	* Consultar
	* Listar Todas
4 - Cardapio
	* Cadastrar
	* Alterar
	* Excluir
	* Consultar
	* Listar Todas
5 - Mesa
	* Cadastrar
	* Alterar
	* Excluir
	* Consultar
	* Listar Todas
	* Consultar Mesas Disponíveis
	* Reservar Mesa
	* Listar Mesas Por Status
6 - Pedido
	* Cadastrar
	* Alterar
	* Excluir
	* Consultar
	* Listar Todas
	* Realizar pedido
	* Consultar Status do pedido
	* Listar Comandas Por Status
	* Fechar Comanda
	* Cancelar Pedido
 *
 */

public class Main {

	private static FuncionarioController funcionarioController = new FuncionarioController();
	private static AtomicInteger idCounter = new AtomicInteger();

	public static void main(String[] args) {
		
		boolean executando = true;
		int opcaoSelecionada = 0;

		while (executando) {
			opcaoSelecionada = Integer.parseInt(JOptionPane.showInputDialog(montarMenuPrincipal()));

			switch (opcaoSelecionada) {
			case 1:
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(montarSubMenuFuncionarios()));
				operacaoFuncionario(opcao, funcionarioController);
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

	private static void operacaoFuncionario(int opcao, FuncionarioController funcionarioController) {
		Funcionario funcionario = null;
		List<Funcionario> funcionarios = null;

		int id;
		switch (opcao) {
		case 1: // cadastrar Funcionario
			funcionario = mostrarMenuCadastrarFuncionario();

			try {// inserir
				funcionarioController.salvar(funcionario);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			
			break;
		case 2: // alterar
			
			funcionarios = funcionarioController.listarTodos();
			int idFuncionarioAlterar = mostrarMenuLerIdFuncionarioAlterar(funcionarios);
			Funcionario funcionarioAlterar = funcionarioController.consultar(idFuncionarioAlterar);
			mostrarMenuAlterarFuncionario(funcionarioAlterar);
			try {
				funcionarioController.salvar(funcionarioAlterar);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			break;

		case 3: //excluir
			id = mostrarMenuExcluirFuncionario();
			funcionarioController.excluir(id);
			break;

		case 4: //consultar
			id = mostrarMenuConsultarFuncionario();
			Funcionario funcionarioBuscado = funcionarioController.consultar(id);
			JOptionPane.showMessageDialog(null, funcionarioBuscado);
			break;

		case 5: 
			funcionarios = funcionarioController.listarTodos();
			listarFuncionarios(funcionarios);
			break;

		case 6:
			funcionarios = funcionarioController.listarGarconsDisponiveis();
			listarGarconsDisponiveis(funcionarios);
			break;

		default:

		}
	}

	private static int mostrarMenuLerIdFuncionarioAlterar(List<Funcionario> funcionarios) {

		var builder = new StringBuilder();

		builder.append(" ==================== Lista de funcionários ==================== ");
		builder.append(QUEBRA_LINHA);
		
		for (Funcionario funcionario : funcionarios) {
			builder.append(funcionario.getId());
			builder.append(" - ");
			builder.append(funcionario.getNome());
			builder.append(QUEBRA_LINHA);
		}
		
		builder.append("Digite o id do funcionário que você deseja alterar");
		
		return Integer.parseInt(JOptionPane.showInputDialog(builder.toString()));
	}

	private static void listarGarconsDisponiveis(List<Funcionario> funcionarios) {
		StringBuilder builder = new StringBuilder();

		builder.append(" ==================== Garçons Disponíveis ==================== ");
		builder.append(QUEBRA_LINHA);
		
		for (Funcionario funcionario : funcionarios) {
			builder.append(funcionario);
			builder.append(QUEBRA_LINHA);
		}


		JOptionPane.showMessageDialog(null, builder.toString());
	}

	private static void listarFuncionarios(List<Funcionario> funcionarios) {
		StringBuilder builder = new StringBuilder();

		builder.append(CABECALHO_LISTAR_FUNCIONARIOS);
		builder.append(QUEBRA_LINHA);
		
		for (Funcionario funcionario : funcionarios) {
			builder.append(funcionario);
			builder.append(QUEBRA_LINHA);
		}

		JOptionPane.showMessageDialog(null, builder.toString());
	}

	private static int mostrarMenuConsultarFuncionario() {
		// TODO Auto-generated method stub
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o id do funcionário que você deseja consultar"));
	}

	private static int mostrarMenuExcluirFuncionario() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o id do funcionário que você deseja excluir"));
	}

	private static Funcionario mostrarMenuAlterarFuncionario(Funcionario funcionarioAlterar) {
		funcionarioAlterar.setRg(JOptionPane.showInputDialog("Digite o RG do funcionário:", funcionarioAlterar.getRg()));
		funcionarioAlterar.setEstadoCivil(EstadoCivil.values()[Integer.parseInt(JOptionPane.showInputDialog(
				ALTERAR_FUNCIONARIO_ESTADO_CIVIL, funcionarioAlterar.getEstadoCivil().ordinal()))]);
		funcionarioAlterar.setCargo(Cargo.values()[Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o cargo do funcionário: \n 0 - Faxineiro \n 1 - Garçom \n 2 - Cozinheiro \n 3 - Gerente", funcionarioAlterar.getCargo().ordinal()))]);
		funcionarioAlterar.setEscolaridade(Escolaridade.values()[Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a escolaridade do funcionario: \n 0 - Fundamental \n 1 - Médio \n 2 - Superior ", funcionarioAlterar.getEscolaridade().ordinal()))]);
		funcionarioAlterar.setPis(Integer.parseInt(JOptionPane.showInputDialog("Digite o PIS do funcionário", funcionarioAlterar.getPis())));
		
		return funcionarioAlterar;
	}

	public static Pessoa cadastrarPessoa() {
		int id = idCounter.incrementAndGet();
		String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
		String endereco = JOptionPane.showInputDialog("Digite o endereço da pessoa");
		String telefone = JOptionPane.showInputDialog("Digite o telefone da pessoa");
		String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
		Date dataNascimento = UtilitarioData.stringParaDate(
				JOptionPane.showInputDialog("Qual a data de nascimento da pessoa? \n Formato: dd/MM/yyyy"));
		String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
		boolean ativo = Boolean
				.parseBoolean(JOptionPane.showInputDialog("O usuário está ativo? \n 0 - Não \n 1 - Sim"));

		return new Pessoa(id, nome, endereco, telefone, cpf, dataNascimento, observacao, ativo);
	}

	public static Funcionario mostrarMenuCadastrarFuncionario() {
		Pessoa pessoa = cadastrarPessoa();

		Funcionario funcionario = new Funcionario();
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário:"));
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

		int id = idCounter.incrementAndGet();
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

		return new Produto(id, nome, descricao, codigo, precoCusto, precoVenda, tempoPreparo, observacoes, tipoProduto,
				ativo);

	}

	public static Pedido cadastrarPedido() {
		Pedido pedido = new Pedido();

		pedido.setId(idCounter.incrementAndGet());
		pedido.setDataHoraSolicitacao(new Timestamp(new Date().getTime()));
		pedido.setObservacao(JOptionPane.showInputDialog("Observações:"));
		pedido.setQuantidade(Integer
				.parseInt(JOptionPane.showInputDialog("Digite a quantidade de items que você quer para esse pedido")));
		pedido.setStatusPreparo(StatusPreparoPedido.SOLICITADO);

		return pedido;
	}

	public static Mesa cadastrarMesa() {
		Mesa mesa = new Mesa();

		mesa.setId(idCounter.incrementAndGet());
		mesa.setCodigo(JOptionPane.showInputDialog("Digite o código da mesa:"));
		mesa.setNome(JOptionPane.showInputDialog("Digite o nome da mesa:"));
		mesa.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da mesa:")));
		mesa.setStatusMesa(StatusMesa.DISPONIVEL);

		return mesa;

	}

	public static Comanda cadastrarComanda() {
		Comanda comanda = new Comanda();

		comanda.setId(idCounter.incrementAndGet());
		comanda.setCodigo(JOptionPane.showInputDialog("Digite o código da comanda:"));
		comanda.setObservacoes(JOptionPane.showInputDialog("Digite as observações sobre a comanda:"));
		comanda.setStatus(StatusComanda.EM_ABERTO);

		return comanda;
	}

	public static String montarMenuPrincipal() {

		StringBuilder builder = new StringBuilder();
		builder.append(" ==================== RAVIN ==================== ");
		builder.append(QUEBRA_LINHA);
		builder.append("1 - Funcionarios \n");
		builder.append("2 - Clientes \n");
		builder.append("3 - Produtos \n");
		builder.append("4 - Cardapios \n");
		builder.append("5 - Mesas \n");
		builder.append("6 - Pedidos \n");
		builder.append("7 - Sair");

		return builder.toString();
	}

	public static String montarSubMenuGeral(String modulo) {
		StringBuilder builder = new StringBuilder();
		builder.append(" ==================== Gestão de ");
		builder.append(modulo);
		builder.append(" ==================== ");
		builder.append(QUEBRA_LINHA);
		builder.append("1 -  Cadastrar \n");
		builder.append("2 -  Alterar \n");
		builder.append("3 -  Excluir \n");
		builder.append("4 -  Consultar \n");
		builder.append("5 -  Listar todos \n");

		return builder.toString();
	}

	public static String montarSubMenuFuncionarios() {
		String subMenuGeral = montarSubMenuGeral("Funcionarios");

		StringBuilder builder = new StringBuilder();
		builder.append(subMenuGeral);
		builder.append("6 - Consultar Garçons Disponíveis \n");
		builder.append("7 - Voltar");

		return builder.toString();
	}

}
