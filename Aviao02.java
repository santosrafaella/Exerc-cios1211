package br.com.generation.exercicios1211;

public class Aviao02 {
	
	//atributos
	
	private String companhia;
	private String origem;
	private String destino;
	
	
	//metodos
	void partir(String partida) {
			System.out.println("Partida do avi�o prevista para XX:XX.");
	} 
	void chegar(String chegada) {
		System.out.println("Chegada do avi�o prevista para YY:YY.");
		
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
}
