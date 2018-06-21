package Cantina;

public class RepositorioCantinaArray implements RepositorioCantina {
	private Cantina[] array;
	private int contador;

	public RepositorioCantinaArray() {
		array = new Cantina[1];
		contador = 0;
	}

	public void inserir(Cantina cantina) {
		if (contador == array.length) {
			Cantina[] arrayNova = new Cantina[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				arrayNova[i] = array[i];
			}
			this.array = arrayNova;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				array[i] = cantina;
				contador++;
			}
		}
	}
	
	public Cantina nome(String nome) {
		Cantina cant = null;
		for (int i = 0; i < array.length; i++) {
			if (array[i].getNome().equals(nome)) {
				cant = array[i] ;
			}
		}
		return cant;
	}

	public boolean procurar(Cantina cantina) {
		boolean tem = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == cantina) {
				tem = true;
			}
		}
		return tem;
	}

	public void atualizar(Cantina nova) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].comparador(nova)) {
				array[i] = nova;
			}
		}
	}

	public void remover(Cantina cantina) {
		for (int i = 0; i < contador; i++) {
			if (array[i] == cantina) {
				array[i] = null;
				for (; i < contador; i++) {
					array[i] = array[i + 1];
				}
				array[contador - 1] = null;
			}
		}
	}

	public String alarmeInicio(Cantina cantina) {
		String aviso = "A cantina " + cantina.getNome() + " acabou de abrir!";
		return aviso;
	}

	public String alarmeFim(Cantina cantina) {
		String aviso = "A cantina " + cantina.getNome() + " acabou de fechar! :(";
		return aviso;
	}

}
