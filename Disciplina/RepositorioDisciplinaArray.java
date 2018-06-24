package Disciplina;

public class RepositorioDisciplinaArray implements RepositorioDisciplina {

	private Disciplina[] array;
	private int contador;

	public RepositorioDisciplinaArray() {
		array = new Disciplina[1];
		contador = 0;
	}

	public void cadastrar(Disciplina disciplina) {
		if (contador == array.length) {
			Disciplina[] arrayAux = new Disciplina[array.length + 1];
			for (int i = 0; i < array.length; i++) {
				arrayAux[i] = array[i];
			}
			this.array = arrayAux;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = disciplina;
				contador++;
			}
		}
	}

	public void remover(String nomeDisciplina) {
		for (int i = 0; i < contador; i++) {
			if (array[i].getNome().equals(nomeDisciplina)) {
				array[i] = null;
				for (; i < contador; i++) {
					array[i] = array[i + 1];
				}
				array[contador - 1] = null;
			}
		}
	}

	public boolean procurar(String nomeDisciplina) {
		boolean aux = false;
		for (int i = 0; i < array.length; i++) {
			if (this.array[i] != null && this.array[i].getNome().equals(nomeDisciplina)) {
				aux = true;
			}
		}
		return aux;
	}

	public void atualizarMensalidade(Disciplina disciplina) {
		boolean aux = true;
		for (int i = 0; i < array.length && aux; i++) {
			if (this.array[i] != null && this.array[i].getNome().equals(disciplina.getNome())) {
				this.array[i].setMensalidade(disciplina.getMensalidade());
				aux = false;
			}
		}
	}
	
	public Disciplina[] dados() {
		Disciplina[] aux = null;
		if (this.array[0] != null) {
			aux = this.array;
		}
		return aux;
	}
}
