package Exceptions;

@SuppressWarnings("serial")
public class DisciplinaCadastradaException extends Exception {
	
	public DisciplinaCadastradaException() {
		super("A disciplina ja estava cadastrada.");
	}
}