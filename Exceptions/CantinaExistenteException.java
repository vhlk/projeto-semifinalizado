package Exceptions;

@SuppressWarnings("serial")
public class CantinaExistenteException extends Exception {

	public CantinaExistenteException() {
		super("Cantina já existente. Nâo é possível inserí-la no repositório.");
	}
}
