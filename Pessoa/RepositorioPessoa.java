package Pessoa;
import Exceptions.*;

public interface RepositorioPessoa {

	public void inserir(Pessoa nome) throws PessoaExistenteException;

	public boolean procurar(String nome);

	public void atualizar(Pessoa novo) throws PessoaNaoEncontradaException;

	public void remover(String nome) throws PessoaNaoEncontradaException;
	
	public Pessoa nome (String nome);

}