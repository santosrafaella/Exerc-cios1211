package br.com.generation.exercicios1211;

public class Funcionario04 {
	//atributos
	
	private String nome;
	private String codigo;
	
	//metodos
	
	void entrada(String entrada) {
		System.out.println("Funcion�rio deu entrada na empresa �s XX:XX.");
	}
	void saida(String saida) {
		System.out.println("Funcion�rio deu sa�da na empresa �s YY:YY.");
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

}
