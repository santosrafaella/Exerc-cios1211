package br.com.generation.exercicios1211;

public class Aviao02Teste {

	public static void main(String[] args) {
		
		//instanciando objetos
		Aviao02 a1 = new Aviao02();
		Aviao02 a2 = new Aviao02();
		Aviao02 a3 = new Aviao02();
		
		
		a1.setCompanhia("LATAM");
		a1.setOrigem("S�o Paulo - SP");
		a1.setDestino("Macei� - AL");
		
		a2.setCompanhia("Gol");
		a2.setOrigem("Fortaleza - CE");
		a2.setDestino("Florian�polis - SC");
		
		a3.setCompanhia("Azul");
		a3.setOrigem("Goi�s - GO");
		a3.setDestino("Belo Horizonte - MG");
		
		System.out.println("Companhia do avi�o 1: " + a1.getCompanhia());
		System.out.println("Origem do v�o 1: " + a1.getOrigem());
		System.out.println("Destino do v�o 1: " + a1.getDestino());
		a1.partir("\n");
		a1.chegar("");		
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Companhia do avi�o 2: " + a2.getCompanhia());
		System.out.println("Origem do v�o 2: " + a2.getOrigem());
		System.out.println("Destino do v�o 2: " + a2.getDestino());
		a1.partir("\n");
		a1.chegar("");
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Companhia do avi�o 3: " + a3.getCompanhia());
		System.out.println("Origem do v�o 3: " + a3.getOrigem());
		System.out.println("Destino do v�o 3: " + a3.getDestino());
		a1.partir("\n");
		a1.chegar("");

	}

}
