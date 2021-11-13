package br.com.generation.exercicios1211;

public class Cliente01 {	
	
	//atributos
	String nome;
	private int idade;
	private int codigo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	//metodos
	void pagar() {
		System.out.println("Cliente pagou o produto!");
	}
	void trocar() {
		System.out.println("Cliente trocou trocou o produto!");
	}
	void devolver() {
		System.out.println("Cliente devolveu o produto!");
	}
}
