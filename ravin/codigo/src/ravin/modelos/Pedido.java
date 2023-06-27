package ravin.modelos;


import java.sql.Timestamp;

import ravin.enumeradores.StatusPreparoPedido;

public class Pedido {
	
	private int id;
	private Produto produto;
	private Timestamp dataHoraSolicitacao;
	private Timestamp dataHoraInicioPreparo;
	private Timestamp tempoPreparoRestante;
	private StatusPreparoPedido statusPreparo;
	private String observacao;
	private int quantidade;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(int id, Produto produto, Timestamp dataHoraSolicitacao, Timestamp dataHoraInicioPreparo,
			Timestamp tempoPreparoRestante, StatusPreparoPedido statusPreparo, String observacao, int quantidade) {
		super();
		this.id = id;
		this.produto = produto;
		this.dataHoraSolicitacao = dataHoraSolicitacao;
		this.dataHoraInicioPreparo = dataHoraInicioPreparo;
		this.tempoPreparoRestante = tempoPreparoRestante;
		this.statusPreparo = statusPreparo;
		this.observacao = observacao;
		this.quantidade = quantidade;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public StatusPreparoPedido getStatusPreparo() {
		return statusPreparo;
	}

	public void setStatusPreparo(StatusPreparoPedido statusPreparo) {
		this.statusPreparo = statusPreparo;
	}

	public Timestamp getDataHoraSolicitacao() {
		return dataHoraSolicitacao;
	}

	public void setDataHoraSolicitacao(Timestamp dataHoraSolicitacao) {
		this.dataHoraSolicitacao = dataHoraSolicitacao;
	}

	public Timestamp getDataHoraInicioPreparo() {
		return dataHoraInicioPreparo;
	}

	public void setDataHoraInicioPreparo(Timestamp dataHoraInicioPreparo) {
		this.dataHoraInicioPreparo = dataHoraInicioPreparo;
	}

	public Timestamp getTempoPreparoRestante() {
		return tempoPreparoRestante;
	}

	public void setTempoPreparoRestante(Timestamp tempoPreparoRestante) {
		this.tempoPreparoRestante = tempoPreparoRestante;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
