package repositories;

import java.util.ArrayList;
import java.util.List;

import interfaces.RepositoryInterface;
import modelos.Cliente;

public class ClienteRepository implements RepositoryInterface<Cliente>{
	
	private List<Cliente> listaClientes;
	
	public ClienteRepository() {
		this.listaClientes = new ArrayList<>();
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente inserir(Cliente objeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente atualizar(Cliente object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletar(int posicao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscar(int posicao) {
		// TODO Auto-generated method stub
		
	}

}
