package br.com.generation.exercicios1211;

public class Aviao02Teste {

	public static void main(String[] args) {
		
		//instanciando objetos
		Aviao02 a1 = new Aviao02();
		Aviao02 a2 = new Aviao02();
		Aviao02 a3 = new Aviao02();
		
		
		a1.setCompanhia("LATAM");
		a1.setOrigem("São Paulo - SP");
		a1.setDestino("Maceió - AL");
		
		a2.setCompanhia("Gol");
		a2.setOrigem("Fortaleza - CE");
		a2.setDestino("Florianópolis - SC");
		
		a3.setCompanhia("Azul");
		a3.setOrigem("Goiás - GO");
		a3.setDestino("Belo Horizonte - MG");
		
		System.out.println("Companhia do avião 1: " + a1.getCompanhia());
		System.out.println("Origem do vôo 1: " + a1.getOrigem());
		System.out.println("Destino do vôo 1: " + a1.getDestino());
		a1.partir("\n");
		a1.chegar("");		
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Companhia do avião 2: " + a2.getCompanhia());
		System.out.println("Origem do vôo 2: " + a2.getOrigem());
		System.out.println("Destino do vôo 2: " + a2.getDestino());
		a1.partir("\n");
		a1.chegar("");
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Companhia do avião 3: " + a3.getCompanhia());
		System.out.println("Origem do vôo 3: " + a3.getOrigem());
		System.out.println("Destino do vôo 3: " + a3.getDestino());
		a1.partir("\n");
		a1.chegar("");

	}

}
