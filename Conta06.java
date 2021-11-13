package br.com.generation.exercicios1211;

public class Conta06 {
	
	//atributos
	
	private String nome;
	private String senha;
	private String documento;
	
	//metodos
	
	void depositar(String deposito) {
		System.out.println("O titular depositou: R$XXX,XX");
	}
	void sacar(String sacou) {
		System.out.println("O titular sacou: R$XXXX,XX ");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
}
