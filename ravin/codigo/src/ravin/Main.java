package ravin;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JOptionPane;

import ravin.enumeradores.Cargo;
import ravin.enumeradores.Escolaridade;
import ravin.enumeradores.EstadoCivil;
import ravin.enumeradores.TipoProduto;
import ravin.modelos.Cliente;
import ravin.modelos.Funcionario;
import ravin.modelos.Pedido;
import ravin.modelos.Pessoa;
import ravin.modelos.Produto;
import ravin.utilidade.DateUtils;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = cadastrarPessoa();
		Funcionario funcionario = cadastrarFuncionario();
		Cliente cliente = cadastrarCliente();

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
				.parseBoolean(JOptionPane.showInputDialog("O usuário está ativo? \n[1 - Sim \n 0 - Não]"));

		return new Pessoa(id, nome, endereco, telefone, cpf, dataNascimento, observacao, ativo);
	}

	public static Funcionario cadastrarFuncionario() {
		Pessoa pessoa = cadastrarPessoa();

		Funcionario funcionario = new Funcionario();
		funcionario.setRg(JOptionPane.showInputDialog("Digite o RG do funcionário:"));
		funcionario.setEstadoCivil(EstadoCivil.values()[Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o estado civíl do funcionario: \n [1 - Solteiro \n 2 - Casado \n 3 - Viúvo \n 4 - Divorciado \n 5 - Separado]"))]);
		funcionario.setCargo(Cargo.values()[Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o cargo do funcionário: \n 1 - Faxineiro \n 2 - Garçom \n 3 - Cozinheiro \n 4 - Gerente"))]);
		funcionario.setEscolaridade(Escolaridade.values()[Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a escolaridade do funcionario: \n 1 - Fundamental \n 2 - Médio \n 3 - Superior "))]);
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
		cliente.setAtivo(
				Boolean.parseBoolean(JOptionPane.showInputDialog("O cliente está ativo? \n[1 - Sim \n 0 - Não]")));

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
				JOptionPane.showInputDialog("Digite o tipo do produto \n 1 - Lanche \n 2 - Bebida \n 3 - Sobremesa"))];
		boolean ativo = Boolean
				.parseBoolean(JOptionPane.showInputDialog("O produto está ativo? \n 0 - Não \n 1 - Sim"));

		return new Produto(0, nome, descricao, codigo, precoCusto, precoVenda, tempoPreparo, observacoes, tipoProduto,
				ativo);

	}
	
	public static Pedido cadastrarPedido() {
		Pedido pedido = new Pedido();
		
		pedido.setDataHoraSolicitacao(new Timestamp(new Date().getTime()));
		pedido.setObservacao(JOptionPane.showInputDialog("Observações:"));
		pedido.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de items que você quer para esse pedido")));
		
		return pedido;
	}

}
