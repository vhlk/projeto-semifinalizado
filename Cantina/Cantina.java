package Cantina;

import Pessoa.*;

public class Cantina {
	private String nome;
	private Prato pratoPrincipal;
	private Pessoa gerente;

	public Cantina(String nome, Prato prato, Pessoa pessoa) {
		this.nome = nome;
		this.pratoPrincipal = prato;
		this.gerente = pessoa;
	}

	public boolean comparador(Cantina cant) {
		if (this.getNome().equals(cant.getNome())) {
			return true;
		}else {
			return false;
		}
	}

	public String getNome() {
		return nome;
	}

	public Prato getPrato() {
		return pratoPrincipal;
	}

	public Pessoa getGerente() {
		return gerente;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPrato(Prato prato) {
		this.pratoPrincipal = prato;
	}

	public void setGerente(Pessoa gerente) {
		this.gerente = gerente;
	}

	
	
}
