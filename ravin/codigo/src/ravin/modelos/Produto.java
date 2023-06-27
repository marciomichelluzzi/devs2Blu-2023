package ravin.modelos;

import ravin.enumeradores.TipoProduto;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private String codigo;
	private double precoCusto;
	private double precoVenda;
	private String tempoPreparo;
	private String observacoes;
	private TipoProduto tipoProduto;
	private boolean ativo;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(int id, String nome, String descricao, String codigo, double precoCusto, double precoVenda,
			String tempoPreparo, String observacoes, TipoProduto tipoProduto, boolean ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.codigo = codigo;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.tempoPreparo = tempoPreparo;
		this.observacoes = observacoes;
		this.tipoProduto = tipoProduto;
		this.ativo = ativo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(String tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
