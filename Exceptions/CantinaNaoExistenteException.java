package Exceptions;

@SuppressWarnings("serial")
public class CantinaNaoExistenteException extends Exception {
	
	public CantinaNaoExistenteException() {
		super("Nâo existe essa cantina, sendo impossível removê-la. ");
	}

}
