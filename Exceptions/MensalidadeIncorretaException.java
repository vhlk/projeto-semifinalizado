package Exceptions;

@SuppressWarnings("serial")
public class MensalidadeIncorretaException extends Exception{
	
	public MensalidadeIncorretaException() {
		super("Valor incorreto!");
	}
}
