package br.com.generation.exercicios1211;

public class Funcionario04Teste {

	public static void main(String[] args) {
		
		//instanciando objetos
		Funcionario04 fun1 = new Funcionario04();
		Funcionario04 fun2 = new Funcionario04();
		Funcionario04 fun3 = new Funcionario04();
		
		fun1.setNome("Funcion�rio A");
		fun1.setCodigo("0123");
		
		fun2.setNome("Funcion�rio B");
		fun2.setCodigo("4567");
		
		fun3.setNome("Funcion�rio C");
		fun3.setCodigo("8910");
		
		System.out.println("Nome funcion�rio 1: " + fun1.getNome());
		System.out.println("C�digo do funcion�rio 1: " + fun1.getCodigo());
		fun1.entrada("");
		fun1.saida("");
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Nome funcion�rio 2: " + fun2.getNome());
		System.out.println("C�digo do funcion�rio 2: " + fun2.getCodigo());
		fun2.entrada("");
		fun2.saida("");
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Nome funcion�rio 3: " + fun3.getNome());
		System.out.println("C�digo do funcion�rio 3: " + fun3.getCodigo());
		fun3.entrada("");
		fun3.saida("");

	}

}
