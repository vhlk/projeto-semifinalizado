package Exceptions;

@SuppressWarnings("serial")
public class CursoExistenteException extends Exception{
	
	public CursoExistenteException(){
		super("Curso ja existente.");
	}

}
