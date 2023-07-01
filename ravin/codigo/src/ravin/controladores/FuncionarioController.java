package ravin.controladores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ravin.enumeradores.Cargo;
import ravin.enumeradores.Disponibilidade;
import ravin.modelos.Funcionario;
import ravin.utilidade.UtilitarioData;
import repositorios.FuncionarioRepository;

public class FuncionarioController {

	private FuncionarioRepository repository;

	public FuncionarioController() {
		repository = new FuncionarioRepository();
	}

	public void salvar(Funcionario entidade) throws Exception {
		if (UtilitarioData.getIdade(entidade.getDataNascimento()) < 18) {
			throw new Exception("Não pode salvar o funcionario, pois ele é menor de idade");
		}
		repository.salvar(entidade);
	}

	public void alterar(Funcionario entidade) {
		// REGRAS DE NEGÓCIO
		repository.salvar(entidade);
	}

	public void excluir(int id) {
		Funcionario funcionarioBuscado = repository.buscarPorId(id);

		if (funcionarioBuscado != null) {
			repository.excluir(funcionarioBuscado);
		}
	}

	public Funcionario consultar(int id) {
		return repository.buscarPorId(id);
	}

	public List<Funcionario> listarTodos() {
		return repository.listarTodos();
	}

	public List<Funcionario> listarGarconsDisponiveis() {
		List<Funcionario> funcionarios = repository.listarTodos();
		List<Funcionario> funcionarioDisponiveis = new ArrayList<>();

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getDisponibilidade().equals(Disponibilidade.DISPONIVEL)
					&& funcionario.getCargo().equals(Cargo.GARCOM)) {
				funcionarioDisponiveis.add(funcionario);
			}
		}

		return funcionarioDisponiveis;
	}

}
