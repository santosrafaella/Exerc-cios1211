package br.com.generation.exercicios1211;

public class Patinete05Teste {

	public static void main(String[] args) {
		
		//instanciando objetos
		Patinete05 pat1 = new Patinete05();
		Patinete05 pat2 = new Patinete05();
		Patinete05 pat3 = new Patinete05();
		
		pat1.setCor("Preta");
		pat1.setTamanho("Pequeno");
		pat1.setIdadeRec(5);
		
		pat2.setCor("Prata");
		pat2.setTamanho("Médio");
		pat2.setIdadeRec(10);
		
		pat3.setCor("Dourado");
		pat3.setTamanho("Grande");
		pat3.setIdadeRec(12);
		
		System.out.println("Cor do patinete 1: " + pat1.getCor());
		System.out.println("Tamanho do patinete 1: " + pat1.getTamanho());
		System.out.println("Idade recomendada para o patinete 1: " + pat1.getIdadeRec());
		pat1.valor("");
		pat1.acessorio("");
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Cor do patinete 2: " + pat2.getCor());
		System.out.println("Tamanho do patinete : " + pat2.getTamanho());
		System.out.println("Idade recomendada para o patinete 2: " + pat2.getIdadeRec());
		pat2.valor("");
		pat2.acessorio("");
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Cor do patinete 3: " + pat3.getCor());
		System.out.println("Tamanho do patinete 3: " + pat3.getTamanho());
		System.out.println("Idade recomendada para o patinete 3: " + pat3.getIdadeRec());
		pat3.valor("");
		pat3.acessorio("");
	}

}
