package Exceptions;

@SuppressWarnings("serial")
public class PessoaExistenteException extends Exception{
	
	public PessoaExistenteException() {
		super("Esta pessoa já existe no sistema");
	}
}
