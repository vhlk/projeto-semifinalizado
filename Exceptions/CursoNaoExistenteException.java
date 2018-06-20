package Exceptions;

@SuppressWarnings("serial")
public class CursoNaoExistenteException extends Exception{

	public CursoNaoExistenteException() {
		super("Impossivel remover curso.");
	}
}
