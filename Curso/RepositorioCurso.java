package Curso;

import Exceptions.*;

public interface RepositorioCurso {
	
	public void inserir(Curso curso) throws CursoExistenteException;
	
	public Curso nome (String nome);
	
	public boolean procurar(Curso curso) throws CursoNaoExistenteException;
	
	public void atualizar(Curso novo) throws CursoNaoExistenteException;
	
	public void remover(Curso curso) throws CursoNaoExistenteException;

}
