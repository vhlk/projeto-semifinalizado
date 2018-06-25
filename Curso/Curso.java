package Curso;

public class Curso {

	private String nome;
	private String endereco;
	private int qtdSalas;
	private int setores;

	public Curso(String nome, String endereco, int qtdSalas, int setores) {
		this.nome = nome;
		this.endereco = endereco;
		this.qtdSalas = qtdSalas;
		this.setores = setores;
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
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getSalas() {
		return qtdSalas;
	}
	public void setSalas(int qtdSalas) {
		this.qtdSalas = qtdSalas;
	}
	public double getSetores() {
		return setores;
	}
	public void setSetores(int setores) {
		this.setores = setores;
	}
	
}