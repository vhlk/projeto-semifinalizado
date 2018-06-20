package Curso;

import Exceptions.*;

public class RepositorioCursoArray implements RepositorioCurso {
	private Curso[] array;
	private int contador;
	
	public RepositorioCursoArray() {
		array = new Curso[1];
		contador = 0;
	}
	public void inserir(Curso curso) throws CursoExistenteException {
		if (contador == array.length) {
			Curso[] arrayNovo = new Curso[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				arrayNovo[i] = array[i];
			}
			this.array = arrayNovo;
		}	
		for (int i = 0; i < array.length; i++) {
			if (array[i].comparador(curso)) {
				CursoExistenteException e = new CursoExistenteException();
				throw e;
			}
			if (array[i] == null) {
				array[i] = curso;
				contador++;
			}
		}
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
	public void atualizar(Curso velho, Curso novo) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == velho) {
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