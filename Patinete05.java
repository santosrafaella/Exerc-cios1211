package br.com.generation.exercicios1211;

public class Patinete05 {
	
	//atributos
	
	private String cor;
	private String tamanho;
	private int idadeRec;
	
	//metodos
	
	void valor(String pre�o) {
		System.out.println("O valor do patinete �: R$:XXX,XX");
	}
	void acessorio(String pre�o) {
		System.out.println("Acess�rio incluso: Capacete ");
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public int getIdadeRec() {
		return idadeRec;
	}
	public void setIdadeRec(int idadeRec) {
		this.idadeRec = idadeRec;
	}

}
