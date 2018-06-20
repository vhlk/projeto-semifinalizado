package Disciplina;

public class RepositorioDisciplinaArray implements RepositorioDisciplina {

	private Disciplina[] array;
	private int contador;

	public RepositorioDisciplinaArray() {
		array = new Disciplina[1];
		contador = 1;
	}

	public void cadastrar(Disciplina disciplina) {
		int aux = 0;
		if (contador == array.length) {
			array[0] = disciplina;
			contador++;
		} else {
			Disciplina[] arrayAux = new Disciplina[array.length + 1];
			for (int i = 0; i < array.length; i++) {
				arrayAux[i] = array[i];
				aux++;
			}
			arrayAux[aux] = disciplina;
			this.array = arrayAux;
		}
	}

	public void remover(Disciplina disciplina) {
		int aux = 0;
		for (int i = 0; i < array.length; i++) {
			if (this.array[i] == disciplina) {
				this.array[i] = null;
			}
		}
		Disciplina[] arrayAux = new Disciplina[array.length - 1];
		for (int i = 0; i < array.length; i++) {
			if (this.array[i] != null) {
				arrayAux[aux] = this.array[i];
				aux++;
			}
		}
	}

	public boolean procurar(Disciplina disciplina) {
		boolean aux = false;
		for (int i = 0; i < array.length; i++) {
			if (this.array[i] == disciplina) {
				aux = true;
			}
		}
		return aux;
	}

	public void atualizarMensalidade(Disciplina disciplinaAntiga, Disciplina disciplinaNova) {
		for (int i = 0; i < array.length; i++) {
			if (this.array[i] == disciplinaAntiga) {
				this.array[i] = disciplinaNova;
			}
		}
	}
}
