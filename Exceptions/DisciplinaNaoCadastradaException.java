package Exceptions;

@SuppressWarnings("serial")
public class DisciplinaNaoCadastradaException extends Exception {
	
	public DisciplinaNaoCadastradaException() {
		super("A disciplina nao esta cadastrada.");
	}
	
}