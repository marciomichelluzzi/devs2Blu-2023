package ravin.modelos;

import java.util.Date;

public class Pessoa {
	
	private int id;
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private Date dataNascimento;
	private String oberservacao;
	private boolean ativo;

	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(int id, String nome, String endereco, String telefone, String cpf, Date dataNascimento,
			String oberservacao, boolean ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.oberservacao = oberservacao;
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getOberservacao() {
		return oberservacao;
	}
	public void setOberservacao(String oberservacao) {
		this.oberservacao = oberservacao;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	

}
