package Pessoa;

public abstract class Pessoa {
	private String nome;
	private String nascimento;
	abstract public String getIdentificacao();

	public Pessoa (String nome,String nascimento) {
		this.nome=nome;
		this.nascimento=nascimento;
	}

	public String getNome(){
		return this.nome;
	}

	public String getNascimento() {
		return this.nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento=nascimento;
	}

}