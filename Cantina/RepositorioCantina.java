package Cantina;

import Exceptions.*;

public interface RepositorioCantina {
	
	public void inserir(Cantina cantina) throws CantinaExistenteException;
	
	public Cantina nome(String nome);
	
	public boolean procurar(Cantina cantina);
	
	public void atualizar(Cantina nova);
	
	public void remover(Cantina cantina) throws CantinaNaoExistenteException;
	
	public String alarmeInicio (Cantina cantina);
	
	public String alarmeFim (Cantina cantina);

}
