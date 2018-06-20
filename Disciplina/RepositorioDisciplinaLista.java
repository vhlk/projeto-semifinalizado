package Disciplina;

import Exceptions.MensalidadeIncorretaException;

public class RepositorioDisciplinaLista implements RepositorioDisciplina {
	private Disciplina atual;
	private RepositorioDisciplinaLista prox;

	RepositorioDisciplinaLista() {
		this.atual = null;
		this.prox = null;
	}

	public void cadastrar(Disciplina disciplina) {
		if (this.atual == null) {
			this.atual = disciplina;
			this.prox = new RepositorioDisciplinaLista();
		} else {
			this.prox.cadastrar(disciplina);
		}
	}
	
	public void remover(Disciplina disciplina) {
		if (this.atual == disciplina) {
			this.atual = this.prox.atual;
			this.prox = this.prox.prox;
		} else {
			this.prox.remover(disciplina);
		}
	}
	
	public boolean procurar(Disciplina disciplina) {
		if (this.atual == disciplina) {
			return true;
		}
		if (this.prox != null) {
			return this.prox.procurar(disciplina);
		} else {
			return false;
		}
	}
	
	public void atualizar(Disciplina disciplinaAtual, Disciplina disciplinaNova) {
		if (this.atual == disciplinaAtual) {
			this.atual = disciplinaNova;
		} else {
			this.prox.atualizar(disciplinaAtual, disciplinaNova);
		}
	}

	@Override
	public void atualizarMensalidade(Disciplina disciplinaAntiga, Disciplina disciplinaNova)
			throws MensalidadeIncorretaException {
		// TODO Auto-generated method stub
		
	}
}
