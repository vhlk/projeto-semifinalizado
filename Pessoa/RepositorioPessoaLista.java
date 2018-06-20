package Pessoa;

public class RepositorioPessoaLista implements RepositorioPessoa{
	private Pessoa pessoa;
	private RepositorioPessoaLista proximo;
	
	public RepositorioPessoaLista () {
		this.pessoa=null;
		this.proximo=null;
	}
	
	public void inserir (Pessoa pessoa) {
		if (this.pessoa==null) {
			this.pessoa=pessoa;
			this.proximo=new RepositorioPessoaLista();
		}
		else {
			this.proximo.inserir(pessoa);
		}
	}
	
	public boolean procurar(Pessoa pessoa) {
		if (this.pessoa!=null && this.pessoa == pessoa) {
			return true;
		}
		if (this.proximo != null) {
			return this.proximo.procurar(pessoa);
		} else {
			return false;
		}
	}
	
	public void atualizar(Pessoa novo) {
		if (this.pessoa == novo) {
			this.pessoa = novo;
		} else {
			this.proximo.atualizar(novo);
		}
	}
	
	public void remover(Pessoa pessoa){
		if (this.pessoa!=null && this.pessoa == pessoa) {
			this.pessoa = this.proximo.pessoa;
			this.proximo = this.proximo.proximo;
		}
		if (this.proximo != null) {
			this.proximo.remover(pessoa);
		}
	}
	
	
}