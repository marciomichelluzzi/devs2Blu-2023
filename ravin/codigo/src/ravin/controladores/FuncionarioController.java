package ravin.controladores;

import ravin.modelos.Funcionario;
import repositorios.FuncionarioRepository;

public class FuncionarioController {

	private FuncionarioRepository repository;

	public FuncionarioController() {
		repository = new FuncionarioRepository();
	}

	public void cadastrar(Funcionario entidade) {
		// REGRAS DE NEGÓCIO
		repository.salvar(entidade);
	}

	public void alterar(Funcionario entidade) {
		// REGRAS DE NEGÓCIO
		repository.salvar(entidade);
	}

}
