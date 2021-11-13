package br.com.generation.exercicios1211;

public class Paciente07Teste {

	public static void main(String[] args) {
		
		//instanciando objetos
		Paciente07 pac1 = new Paciente07();
		Paciente07 pac2 = new Paciente07();
		Paciente07 pac3 = new Paciente07();
		
		pac1.setNome("Paciente A");
		pac1.setDocumento("XXX.XXX.XXX-XX");
		pac1.setTipoS("Tipo A+");
		
		pac2.setNome("Paciente B");
		pac2.setDocumento("XXX.XXX.XXX-XX");
		pac2.setTipoS("Tipo B+");
		
		pac3.setNome("Paciente C");
		pac3.setDocumento("XXX.XXX.XXX-XX");
		pac3.setTipoS("Tipo O-");
		
		System.out.println("Nome do paciente 1: " + pac1.getNome());
		System.out.println("Documento do paciente 1: " + pac1.getDocumento());
		System.out.println("Tipo sanguíneo do paciente 1: " + pac1.getTipoS());
		pac1.doar("");
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Nome do paciente 2: " + pac2.getNome());
		System.out.println("Documento do paciente 2: " + pac2.getDocumento());
		System.out.println("Tipo sanguíneo do paciente 2: " + pac2.getTipoS());
		pac2.receber("");
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Nome do paciente 3: " + pac3.getNome());
		System.out.println("Documento do paciente 3: " + pac3.getDocumento());
		System.out.println("Tipo sanguíneo do paciente 3: " + pac3.getTipoS());
		pac3.doar("");
		

	}

}
