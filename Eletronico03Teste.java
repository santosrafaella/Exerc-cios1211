package br.com.generation.exercicios1211;

public class Eletronico03Teste {

	public static void main(String[] args) {
		
		//instanciando objetos
		Eletronico03 celular1 = new Eletronico03();
		Eletronico03 celular2 = new Eletronico03();
		Eletronico03 celular3 = new Eletronico03();
		
		celular1.setMarca("Samsung");
		celular1.setCor("Preto");
		celular1.setCapacidade(128);
		
		celular2.setMarca("Apple");
		celular2.setCor("Branco");
		celular2.setCapacidade(64);
		
		celular3.setMarca("Xiaomi");
		celular3.setCor("Prata");
		celular3.setCapacidade(256);
		
		System.out.println("Marca do celular 1: " + celular1.getMarca());
		System.out.println("Cor do celular 1: " + celular1.getCor());
		System.out.println("Capacidade de armazenamento do celular 1: " + celular1.getCapacidade() + " GB");
		celular1.atender("");
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Marca do celular 2: " + celular2.getMarca());
		System.out.println("Cor do celular 2: " + celular2.getCor());
		System.out.println("Capacidade de armazenamento do celular 2: " + celular2.getCapacidade() + " GB");
		celular1.ligar("");
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Marca do celular 3: " + celular3.getMarca());
		System.out.println("Cor do celular 3: " + celular3.getCor());
		System.out.println("Capacidade de armazenamento do celular 3: " + celular3.getCapacidade() + " GB");
		celular1.desligar("");		

	}

}
