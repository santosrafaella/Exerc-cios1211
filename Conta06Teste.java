package br.com.generation.exercicios1211;

public class Conta06Teste {

	public static void main(String[] args) {
		
		    //instanciando objetos
				Conta06 con1 = new Conta06();
				Conta06 con2 = new Conta06();
				Conta06 con3 = new Conta06();
				
				
				con1.setNome("Cliente A");
				con1.setDocumento("XXX.XXX.XXX-XX");
				con1.setSenha("XXXXXX");
				
				con2.setNome("Cliente B");
				con2.setDocumento("XXX.XXX.XXX-XX");
				con2.setSenha("XXXXXX");
				
				con3.setNome("Cliente C");
				con3.setDocumento("XXX.XXX.XXX-XX");
				con3.setSenha("XXXXXX");
				
				
				System.out.println("Titular conta 1: " + con1.getNome());
				System.out.println("Documento titular conta 1: " + con1.getDocumento());
				System.out.println("Senha conta 1: " + con1.getSenha());
				con1.depositar("");
				con1.sacar("");
				
				System.out.println("-----------------------------------------------------------------");
				
				System.out.println("Titular conta 2: " + con2.getNome());
				System.out.println("Documento titular conta 2: " + con2.getDocumento());
				System.out.println("Senha conta 2: " + con2.getSenha());
				con2.depositar("");
				con2.sacar("");
				
				System.out.println("-----------------------------------------------------------------");
				
				System.out.println("Titular conta 3: " + con3.getNome());
				System.out.println("Documento titular conta 3: " + con3.getDocumento());
				System.out.println("Senha conta 3: " + con3.getSenha());
				con3.depositar("");
				con3.sacar("");

	}

}
