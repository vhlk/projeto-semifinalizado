package Exceptions;

@SuppressWarnings("serial")
public class MaterialExistenteException extends Exception {

	public MaterialExistenteException() {
		super("Esse material já existe. Nâo é possível inserí-lo no repositório.");
	}
}