package dao;

import java.util.ArrayList;
import java.util.List;

import ravin.modelos.Funcionario;

public class FuncionarioDAO {

	private List<Funcionario> funcionarios;

	public FuncionarioDAO() {
		funcionarios = new ArrayList<Funcionario>();
	}

	public void salvar(Funcionario entidade) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId() == entidade.getId()) {
				funcionario = entidade;
			}
		}
	}

	public List<Funcionario> listarTodos() {
		return funcionarios;
	}

	public void excluir(Funcionario entidade) {
		funcionarios.remove(entidade);
	}

	public Funcionario buscarPorId(int id) {
		Funcionario funcionarioBuscado = null;
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId() == id)
				funcionarioBuscado = funcionario;
		}

		return funcionarioBuscado;
	}

	public void deletarPeloId(int id) {
		Funcionario funcionarioBuscado = null;

		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getId() == id) {
				funcionarioBuscado = funcionario;
			}
		}

		funcionarios.remove(funcionarioBuscado);
	}

	public int contar() {
		return funcionarios.size();
	}

}
