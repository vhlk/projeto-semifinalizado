package Exceptions;

@SuppressWarnings("serial")
public class MaterialNaoExistenteException extends Exception{
	
	public MaterialNaoExistenteException(){
		super("Impossivel. Material nao existe.");
	}

}
