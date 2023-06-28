package ravin.controller;

import dao.FuncionarioDAO;
import ravin.modelos.Funcionario;

public class FuncionarioController {

	private FuncionarioDAO dao;

	public FuncionarioController() {
		dao = new FuncionarioDAO();
	}

	public void cadastrar(Funcionario entidade) {
		// REGRAS DE NEGÓCIO
		dao.salvar(entidade);
	}

	public void alterar(Funcionario entidade) {
		// REGRAS DE NEGÓCIO
		dao.salvar(entidade);
	}

}
