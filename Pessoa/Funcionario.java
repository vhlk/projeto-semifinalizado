package Pessoa;

public class Funcionario extends Pessoa{
	private String cpf;
	public String getIdentificacao() {
		return this.cpf;
	}

	public Funcionario (String nome,String nascimento, String cpf) {
		super(nome,nascimento);
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;
	}
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
}