package Exceptions;

@SuppressWarnings("serial")
public class PessoaNaoEncontradaException extends Exception{
	
	public PessoaNaoEncontradaException() {
		super("Pessoa nao encontrada, favor tentar novamente");
	}
}