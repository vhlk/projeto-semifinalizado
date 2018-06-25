package Curso;

public class RepositorioCursoLista implements RepositorioCurso {
	private Curso course;
	private RepositorioCursoLista prox;

	RepositorioCursoLista() {
		this.course = null;
		this.prox = null;
	}

	public void inserir(Curso curso) {
		if (this.course == null) {
			this.course = curso;
			this.prox = new RepositorioCursoLista();
		} else {
			this.prox.inserir(curso);
		}
	}

	
	public boolean procurar(Curso curso) {
		if (this.course == curso) {
			return true;
		}
		if (this.prox != null) {
			return this.prox.procurar(curso);
		} else {
			return false;
		}
	}
	
	public void atualizar(Curso novo) {
		if (this.course.comparador(novo)) {
			this.course = novo;
		} else {
			this.prox.atualizar(novo);
		}
	}

	public void remover(Curso curso)  {
		if (this.course == curso) {
			this.course = this.prox.course;
			this.prox = this.prox.prox;
		} else {
			this.prox.remover(curso);
		}
	}

	@Override
	public Curso nome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
}
