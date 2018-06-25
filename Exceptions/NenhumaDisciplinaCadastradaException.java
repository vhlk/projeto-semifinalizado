package Exceptions;

@SuppressWarnings("serial")
public class NenhumaDisciplinaCadastradaException extends Exception {
	
	public NenhumaDisciplinaCadastradaException() {
		super("Seu curso ainda nao tem disciplinas cadastradas");
	}
}
