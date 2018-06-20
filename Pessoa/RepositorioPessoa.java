package Pessoa;
import Exceptions.*;

public interface RepositorioPessoa {

	public void inserir(Pessoa nome) throws PessoaExistenteException;

	public boolean procurar(Pessoa nome);

	public void atualizar(Pessoa novo) throws PessoaNaoEncontradaException;

	public void remover(Pessoa nome) throws PessoaNaoEncontradaException;

}