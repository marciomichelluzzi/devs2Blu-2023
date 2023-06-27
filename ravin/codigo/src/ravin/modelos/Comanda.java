package ravin.modelos;

import java.util.List;

import ravin.enumeradores.StatusComanda;

public class Comanda {

	private int id;
	private Mesa mesa;
	private Cliente cliente;
	private List<Pedido> pedidos;
	private String codigo;
	private String observacoes;
	private StatusComanda statusComanda;

	public Comanda() {
		// TODO Auto-generated constructor stub
	}

	public Comanda(int id, Mesa mesa, Cliente cliente, List<Pedido> pedidos, String codigo,
			String observacoes, StatusComanda statusComanda) {
		super();
		this.id = id;
		this.mesa = mesa;
		this.cliente = cliente;
		this.pedidos = pedidos;
		this.codigo = codigo;
		this.observacoes = observacoes;
		this.statusComanda = statusComanda;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public StatusComanda getStatus() {
		return statusComanda;
	}

	public void setStatus(StatusComanda statusComanda) {
		this.statusComanda = statusComanda;
	}
}
