package Exceptions;

@SuppressWarnings("serial")
public class DisciplinaNaoEncontradaException extends Exception {
	
	public DisciplinaNaoEncontradaException() {
		super("Disciplina nao foi encontrada.");
	}
}