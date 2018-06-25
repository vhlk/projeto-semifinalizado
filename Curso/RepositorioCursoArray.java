package Curso;

public class RepositorioCursoArray implements RepositorioCurso {
	private Curso[] array;
	private int contador;

	public RepositorioCursoArray() {
		array = new Curso[1];
		contador = 0;
	}

	public void inserir(Curso curso) {
		if (contador == array.length) {
			Curso[] arrayNovo = new Curso[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				arrayNovo[i] = array[i];
			}
			this.array = arrayNovo;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = curso;
				contador++;
			}
		}
	}
	
	public Curso nome(String nome) {
		Curso curso = null;
		for (int i = 0; i < array.length; i++) {
			if (array[i].getNome().equals(nome)) {
				curso = array[i] ;
			}
		}
		return curso;
	}

	public boolean procurar(Curso curso) {
		boolean tem = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == curso) {
				tem = true;
			}
		}
		return tem;
	}

	public void atualizar(Curso novo) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].comparador(novo)) {
				array[i] = novo;
			}
		}
	}

	public void remover(Curso curso) {
		for (int i = 0; i < contador; i++) {
			if (array[i] == curso) {
				array[i] = null;
				for (; i < contador; i++) {
					array[i] = array[i + 1];
				}
				array[contador - 1] = null;
			}
		}
	}
}
	
