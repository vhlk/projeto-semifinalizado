package Curso;

public class Setores {
	private String nome;
	private double funcionarios;

	public Setores(String nomeP, double funcionarioP) {
		this.nome = nomeP;
		this.funcionarios = funcionarioP;
	}

	public String getNome() {
		return nome;
	}

	public void atualizarSetores(String nome) {
		this.nome = nome;
	}

	public double getFuncionario() {
		return funcionarios;
	}

	public void atualizarFuncionario(double funcionario) {
		this.funcionarios = funcionario;
	}
}