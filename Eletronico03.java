package br.com.generation.exercicios1211;

public class Eletronico03 {
	
	//atributos
	private String marca;
	private String cor;
	private int capacidade;
	
	//metodos
	void atender(String receber) {
		System.out.println("O usuário recebeu uma ligação.");		
	}
	void ligar(String efetuar) {
		System.out.println("O usuário efetuou uma ligação.");
	}
	void desligar(String recusar) {
		System.out.println("O usuário recusou uma ligação");
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
