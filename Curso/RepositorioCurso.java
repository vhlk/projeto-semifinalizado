package Curso;

import Exceptions.*;

public interface RepositorioCurso {
	
	public void inserir(Curso curso) throws CursoExistenteException;
	
	public boolean procurar(Curso curso);
	
	public void atualizar(Curso novo);
	
	public void remover(Curso curso) throws CursoNaoExistenteException;

}
