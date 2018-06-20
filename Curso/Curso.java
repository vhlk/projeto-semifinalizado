package Curso;

public class Curso {

	private String nome;
	private String endereco;
	private double qtdSalas;
	private double setores;

	public Curso(String nomee, String enderecoo, double qtdSalass, double setoress) {
		this.nome = nomee;
		this.endereco = enderecoo;
		this.qtdSalas = qtdSalass;
		this.setores = setoress;
	}
	public boolean comparador(Curso curso) {
		if (this.getNome().equals(curso.getNome())) {
			return true;
		} else {
			return false;
		}
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String enderecoo) {
		this.endereco = enderecoo;
	}
	public double getSalas() {
		return qtdSalas;
	}
	public void setSalas(double qtdSalass) {
		this.qtdSalas = qtdSalass;
	}
	public double getSetores() {
		return setores;
	}
	public void setSetores(double setoress) {
		this.setores = setoress;
	}
	
}