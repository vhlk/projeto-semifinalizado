package Material;

public interface RepositorioMaterial {
	
	public void inserir(Material mat);
	
	public boolean procurar(String mat);
	
	public void remover(String mat);
	
	public void atualizar(Material antigo, Material novo);

}
