package curCIn;

import Cantina.*;
import Curso.*;
import Disciplina.*;
import Material.*;
import Pessoa.*;
import Exceptions.*;

public class CadastroCurCIn {
	private CadastroCantina cadastroCantina;
	private CadastroCurso cadastroCurso;
	private CadastroDisciplina cadastroDisciplina;
	private CadastroMaterial cadastroMaterial;
	private CadastroPessoa cadastroPessoa;

	CadastroCurCIn(int escolha){
		this.cadastroCantina = new CadastroCantina(escolha);
		this.cadastroCurso = new CadastroCurso(escolha);
		this.cadastroDisciplina = new CadastroDisciplina(escolha);
		this.cadastroMaterial = new CadastroMaterial(escolha);
		this.cadastroPessoa = new CadastroPessoa(escolha);
		
	}
	
	public void inserirCantina(Cantina cant) throws CantinaExistenteException{
		cadastroCantina.inserirCantina(cant);
	}
	
	public boolean procurarCantina(Cantina cant) {
		return cadastroCantina.procurarCantina(cant);
	}
	
	public void atualizarCantina(Cantina nova) throws CantinaNaoExistenteException{
		cadastroCantina.atualizarCantina(nova);
	}
	
	public void removerCantina(Cantina cant) throws CantinaNaoExistenteException{
		cadastroCantina.removerCantina(cant);
	}
	
	public String alarmeInicioCantina(Cantina cant) {
		return cadastroCantina.alarmeInicioCantina(cant);
	}
	
	public String alarmeFimCantina(Cantina cant) {
		return cadastroCantina.alarmeFimCantina(cant);
	}

	public void inserirMaterial(Material material) throws MaterialExistenteException{
		cadastroMaterial.inserirMaterial(material);
	}
	
	public boolean procurarMaterial(Material material) {
		return cadastroMaterial.procurarMaterial(material);
	}
	
	public void atualizarMaterial(Material antigo, Material atual) throws MaterialNaoExistenteException{
		cadastroMaterial.atualizarMaterial(antigo, atual);
	}
	
	public void removerMaterial(Material material) throws MaterialNaoExistenteException{
		cadastroMaterial.removerMaterial(material);
	}
	
	public void inserirCurso(Curso curso) throws CursoExistenteException{
		cadastroCurso.inserirCurso(curso);
	}
	
	public boolean procurarCurso(Curso curso) {
		return cadastroCurso.procurarCurso(curso);
	}
	
	public void atualizarCurso(Curso antigo, Curso atual) throws CursoNaoExistenteException{
		cadastroCurso.atualizarCurso(antigo, atual);
	}
	
	public void removerCurso(Curso curso) throws CursoNaoExistenteException{
		cadastroCurso.removerCurso(curso);
	}
	
	public void cadastrarDisciplina(Disciplina disciplina) throws DisciplinaCadastradaException {
		cadastroDisciplina.cadastrarDisciplina(disciplina);
	}
	
	public void removerDisciplina(Disciplina disciplina) throws DisciplinaNaoCadastradaException {
		cadastroDisciplina.removerDisciplina(disciplina);
	}
	
	public boolean procurarDisciplina(Disciplina disciplina) {
		return cadastroDisciplina.procurarDisciplina(disciplina);
	}
	
	public void atualizarMensalidade(Disciplina disciplinaAntiga, Disciplina disciplinaNova) throws MensalidadeIncorretaException {
		cadastroDisciplina.atualizarMensalidade(disciplinaAntiga, disciplinaNova);
	}
	
	public void inserirPessoa(Pessoa pessoa) throws PessoaExistenteException{
		cadastroPessoa.inserirPessoa(pessoa);
	}
	
	public boolean procurarPessoa(Pessoa pessoa) {
		return cadastroPessoa.procurarPessoa(pessoa);
	}
	
	public void atualizarPessoa(Pessoa novo) throws PessoaNaoEncontradaException{
		cadastroPessoa.atualizarPessoa(novo);
	}
	
	public void removerPessoa(Pessoa pessoa) throws PessoaNaoEncontradaException{
		cadastroPessoa.removerPessoa(pessoa);
	}
}