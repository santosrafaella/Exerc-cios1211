package br.com.generation.exercicios1211;

public class Eletronico03 {
	
	//atributos
	private String marca;
	private String cor;
	private int capacidade;
	
	//metodos
	void atender(String receber) {
		System.out.println("O usu�rio recebeu uma liga��o.");		
	}
	void ligar(String efetuar) {
		System.out.println("O usu�rio efetuou uma liga��o.");
	}
	void desligar(String recusar) {
		System.out.println("O usu�rio recusou uma liga��o");
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	
	

}
