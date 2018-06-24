package Disciplina;

import Exceptions.*;

public interface RepositorioDisciplina {	
	void cadastrar(Disciplina disciplina) throws DisciplinaCadastradaException, MensalidadeIncorretaException;
	void remover(String nomeDisciplina) throws DisciplinaNaoCadastradaException;
	boolean procurar(String nomeDisciplina);
	void atualizarMensalidade(Disciplina disciplina) throws MensalidadeIncorretaException, DisciplinaNaoCadastradaException;
	Disciplina[] dados() throws NenhumaDisciplinaCadastradaException;
}