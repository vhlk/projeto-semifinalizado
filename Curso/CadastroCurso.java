package Curso;

import Exceptions.*;

public class CadastroCurso {
	
	private RepositorioCurso repositorioCurso; 

	public CadastroCurso(int escolha){
		if (escolha == 1) {
			this.repositorioCurso = new RepositorioCursoLista(); 
		}
		if (escolha == 2) {
			this.repositorioCurso = new RepositorioCursoArray();
		}
	}
	public Curso nomeCurso(String nome){
		return repositorioCurso.nome(nome);		
	}
	public void inserirCurso(Curso curso) throws CursoExistenteException{
		if (repositorioCurso.procurar(curso) == false) {
			repositorioCurso.inserir(curso);
		}
		else {
			throw new CursoExistenteException();
		}
	}
	
	public boolean procurarCurso(Curso curso) throws CursoExistenteException, CursoNaoExistenteException{
		if (repositorioCurso.procurar(curso) == true) {
			return repositorioCurso.procurar(curso);
		}
		else {
			throw new CursoNaoExistenteException();
		}
	}
			
	public void atualizarCurso(Curso novo) throws CursoNaoExistenteException{
		if (repositorioCurso.procurar(novo) == true) {
			repositorioCurso.atualizar(novo);
		}
		else {
			throw new CursoNaoExistenteException();
		}
	}
		
	public void removerCurso(Curso curso) throws CursoNaoExistenteException{
		if (repositorioCurso.procurar(curso) == true) {
			repositorioCurso.remover(curso);
		}
		else {
			throw new CursoNaoExistenteException();
		}
	}
}

