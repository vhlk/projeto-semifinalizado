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
	
	public void inserirCurso(Curso curso) throws CursoExistenteException{
		if (repositorioCurso.procurar(curso) == false) {
			repositorioCurso.inserir(curso);
		}
		else {
			throw new CursoExistenteException();
		}
	}
	
	public boolean procurarCurso(Curso curso) {
		return repositorioCurso.procurar(curso);
	}
	
	public void atualizarCurso(Curso antigo, Curso atual) throws CursoNaoExistenteException{
		if (repositorioCurso.procurar(antigo) == true) {
			repositorioCurso.atualizar(antigo, atual);
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

