package br.com.residencia.poo.pessoas;

public abstract class Pessoa {
	private String cpf;
	private Integer senha;
	private String nome;
	private TipoPessoa tipoPessoa;
		
	
	public Pessoa(String cpf, Integer senha, String nome) {
		super();
		this.cpf = cpf;
		this.senha = senha;
		this.nome = nome;
	}

	public String getCpf(){
		return cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public Integer getSenha(){
		return senha;
	}
	
	public void setSenha(Integer senha){
		this.senha = senha;
	} 
	
	public Pessoa(String cpf, Integer senha){
		this.cpf = cpf;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	
}
