package Disciplina;

public class Disciplina {

	private String nome;
	private double mensalidade;

	public Disciplina(String nome, double mensalidade) {
		this.nome = nome;
		this.mensalidade = mensalidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMensalidade() {
		return mensalidade;
	}
	
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public boolean checkMensalidade(double mensalidade) {
		if (mensalidade >= 0) {
			return true;
		} else {
			return false;
		}
	}
}