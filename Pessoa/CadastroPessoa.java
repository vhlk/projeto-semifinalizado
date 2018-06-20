package Pessoa;

import Exceptions.*;

public class CadastroPessoa {

private RepositorioPessoa repositorioPessoa; 
	
	public CadastroPessoa(int escolha){
		if (escolha == 1) {
			this.repositorioPessoa = new RepositorioPessoaLista(); 
		}
		if (escolha == 2) {
			this.repositorioPessoa = new RepositorioPessoaArray();
		}
	}
	
	public void inserirPessoa(Pessoa pessoa) throws PessoaExistenteException{
		if (repositorioPessoa.procurar(pessoa) == false) {
			repositorioPessoa.inserir(pessoa);
		}
		else {
			throw new PessoaExistenteException();
		}
	}
	
	public boolean procurarPessoa(Pessoa pessoa) {
		return repositorioPessoa.procurar(pessoa);
	}
	
	public void atualizarPessoa(Pessoa novo) throws PessoaNaoEncontradaException{
		if (repositorioPessoa.procurar(novo) == true) {
			repositorioPessoa.atualizar(novo);
		}
		else {
			throw new PessoaNaoEncontradaException();
		}
	}
	
	public void removerPessoa(Pessoa pessoa) throws PessoaNaoEncontradaException{
		if (repositorioPessoa.procurar(pessoa) == true) {
			repositorioPessoa.remover(pessoa);
		}
		else {
			throw new PessoaNaoEncontradaException();
		}
	}
}