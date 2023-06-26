package interfaces;

import java.util.List;

public interface RepositoryInterface<T> {
	
	public List<T> listar();
	public T inserir(T objeto);
	public T atualizar(T object);
	public void deletar(int posicao);
	public void buscar(int posicao);

}
