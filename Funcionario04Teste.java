package br.com.generation.exercicios1211;

public class Funcionario04Teste {

	public static void main(String[] args) {
		
		//instanciando objetos
		Funcionario04 fun1 = new Funcionario04();
		Funcionario04 fun2 = new Funcionario04();
		Funcionario04 fun3 = new Funcionario04();
		
		fun1.setNome("Funcionário A");
		fun1.setCodigo("0123");
		
		fun2.setNome("Funcionário B");
		fun2.setCodigo("4567");
		
		fun3.setNome("Funcionário C");
		fun3.setCodigo("8910");
		
		System.out.println("Nome funcionário 1: " + fun1.getNome());
		System.out.println("Código do funcionário 1: " + fun1.getCodigo());
		fun1.entrada("");
		fun1.saida("");
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Nome funcionário 2: " + fun2.getNome());
		System.out.println("Código do funcionário 2: " + fun2.getCodigo());
		fun2.entrada("");
		fun2.saida("");
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Nome funcionário 3: " + fun3.getNome());
		System.out.println("Código do funcionário 3: " + fun3.getCodigo());
		fun3.entrada("");
		fun3.saida("");

	}

}
