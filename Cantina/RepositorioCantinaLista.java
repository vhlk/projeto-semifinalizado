package Cantina;

public class RepositorioCantinaLista implements RepositorioCantina {
	private Cantina cant;
	private RepositorioCantinaLista prox;

	public RepositorioCantinaLista() {
		this.cant = null;
		this.prox = null;
	}

	public void inserir(Cantina cantina) {
		if (this.cant == null) {
			this.cant = cantina;
			this.prox = new RepositorioCantinaLista();
		} else {
			this.prox.inserir(cantina);
		}
	}

	public boolean procurar(Cantina cantina) {
		if (this.cant == cantina) {
			return true;
		}
		if (this.prox != null) {
			return this.prox.procurar(cantina);
		} else {
			return false;
		}
	}

	public void atualizar(Cantina nova) {
		if (this.cant.comparador(nova)) {
			this.cant = nova;
		} else {
			this.prox.atualizar(nova);
		}
	}

	public void remover(Cantina cantina) {
		if (this.cant == cantina) {
			this.cant = this.prox.cant;
			this.prox = this.prox.prox;
		} else {
			this.prox.remover(cantina);
		}
	}

	public String alarmeInicio(Cantina cantina) {
		String aviso = cantina.getNome() + " acabou de abrir! :)";
		return aviso;
	}

	public String alarmeFim(Cantina cantina) {
		String aviso = cantina.getNome() + " acabou de fechar! :(";
		return aviso;
	}

	@Override
	public Cantina nome(String nome) {
		Cantina cant = null;
		if (this.cant.getNome().equals(nome)) {
			cant = this.cant;
			return cant;
		}
		else {
			return this.prox.nome(nome);
		}
	}

}
