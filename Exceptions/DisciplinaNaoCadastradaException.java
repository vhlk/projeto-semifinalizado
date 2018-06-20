package Exceptions;

@SuppressWarnings("serial")
public class DisciplinaNaoCadastradaException extends Exception {
	
	public DisciplinaNaoCadastradaException() {
		super("Disciplina nao cadastrada.");
	}
	
}