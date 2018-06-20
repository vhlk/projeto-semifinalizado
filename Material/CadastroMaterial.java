package Material;

import Exceptions.*;

public class CadastroMaterial {
	private RepositorioMaterial repositorioMaterial; 
	
	public CadastroMaterial(RepositorioMaterial repositorioMaterial){
		this.repositorioMaterial = repositorioMaterial; 
	}

	
	public void inserirMaterial(Material material) throws MaterialExistenteException{
		if (repositorioMaterial.procurar(material) == false) {
			repositorioMaterial.inserir(material);
		}
		else {
			throw new MaterialExistenteException();
		}
	}
	
	public boolean procurarMaterial(Material material) {
		return repositorioMaterial.procurar(material);
	}
	
	public void atualizarMaterial(Material antigo, Material atual) throws MaterialNaoExistenteException{
		if (repositorioMaterial.procurar(antigo) == true) {
			repositorioMaterial.atualizar(antigo, atual);
		}
		else {
			throw new MaterialNaoExistenteException();
		}
	}
	
	public void removerMaterial(Material material) throws MaterialNaoExistenteException{
		if (repositorioMaterial.procurar(material) == true) {
			repositorioMaterial.remover(material);
		}
		else {
			throw new MaterialNaoExistenteException();
		}
	}
}