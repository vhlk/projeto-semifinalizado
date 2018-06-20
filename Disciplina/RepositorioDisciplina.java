package Disciplina;

import Exceptions.*;

public interface RepositorioDisciplina {	
	void cadastrar(Disciplina disciplina) throws DisciplinaCadastradaException;
	void remover(Disciplina disciplina) throws DisciplinaNaoCadastradaException;
	boolean procurar(Disciplina disciplina);
	void atualizarMensalidade(Disciplina disciplinaAntiga, Disciplina disciplinaNova) throws MensalidadeIncorretaException;
	
}