package br.com.generation.exercicios1211;

public class Paciente07 {
	
	//atributos
	
	private String nome;
	private String documento;
	private String tipoS;
	
	//metodos
	
	void doar(String doou) {
		System.out.println("O paciente doou o sangue.");
	}
	void receber(String recebeu) {
		System.out.println("O paciente recebeu o sangue");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTipoS() {
		return tipoS;
	}
	public void setTipoS(String tipoS) {
		this.tipoS = tipoS;
	}
}
