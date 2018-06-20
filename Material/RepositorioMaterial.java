package Material;

public interface RepositorioMaterial {
	
	public void inserir(Material mat);
	
	public boolean procurar(Material mat);
	
	public void remover(Material mat);
	
	public void atualizar(Material antigo, Material novo);

}
