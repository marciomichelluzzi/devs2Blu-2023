package ravin.modelos;

import java.util.List;

import ravin.enumeradores.StatusMesa;

public class Mesa {

	private int id;
	private Funcionario atendente;
	private List<Comanda> comandas;
	private String nome;
	private String codigo;
	private int numero;
	private StatusMesa statusMesa;

	public Mesa() {
		// TODO Auto-generated constructor stub
	}

	public Mesa(int id, Funcionario atendente, List<Comanda> comandas, String nome, String codigo, int numero,
			StatusMesa statusMesa) {
		super();
		this.id = id;
		this.atendente = atendente;
		this.comandas = comandas;
		this.nome = nome;
		this.codigo = codigo;
		this.numero = numero;
		this.statusMesa = statusMesa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Funcionario getAtendente() {
		return atendente;
	}

	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}

	public List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		this.comandas = comandas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public StatusMesa getStatusMesa() {
		return statusMesa;
	}

	public void setStatusMesa(StatusMesa statusMesa) {
		this.statusMesa = statusMesa;
	}
}
