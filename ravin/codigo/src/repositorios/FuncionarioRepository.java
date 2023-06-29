package repositorios;

import java.util.ArrayList;
import java.util.List;

import ravin.modelos.Funcionario;

public class FuncionarioRepository {

	private List<Funcionario> funcionarios;

	public FuncionarioRepository() {
		funcionarios = new ArrayList<Funcionario>();
	}

	public void salvar(Funcionario entidade) {
		Funcionario funcionario = buscarPorId(entidade.getId());
		
		if(funcionario == null) {
			funcionarios.add(entidade);
		} else {
			funcionario = entidade;
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

	public void deletarPeloId(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}

	public int contar() {
		return funcionarios.size();
	}
	
	public Funcionario buscarPorNome(String nome) {
		return null;
	}

}
