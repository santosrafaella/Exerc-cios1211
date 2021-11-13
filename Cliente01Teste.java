package br.com.generation.exercicios1211;

public class Cliente01Teste {
	

	public static void main(String[] args) {
		
		
		//instanciando objeto
		Cliente01 cliente1 = new Cliente01();
		Cliente01 cliente2 = new Cliente01();
		Cliente01 cliente3 = new Cliente01();
		
		cliente1.setNome("Cliente A"); 
		cliente1.setIdade(25);
		cliente1.setCodigo(1112);
		
		cliente2.setNome("Cliente B"); 
		cliente2.setIdade(32);
		cliente2.setCodigo(1121);
		
		cliente3.setNome("Cliente C"); 
		cliente3.setIdade(64);
		cliente3.setCodigo(1211);	
		
		
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Idade: " + cliente1.getIdade());
		System.out.println("Código: " + cliente1.getCodigo());
		cliente1.devolver();
		
		System.out.println();
		
		System.out.println("Nome: " + cliente2.getNome());
		System.out.println("Idade: " + cliente2.getIdade());
		System.out.println("Código: " + cliente2.getCodigo());
		cliente2.pagar();
		
		System.out.println();
		
		System.out.println("Nome: " + cliente3.getNome());
		System.out.println("Idade: " + cliente3.getIdade());
		System.out.println("Código: " + cliente3.getCodigo());
		cliente3.trocar();

	}

}
