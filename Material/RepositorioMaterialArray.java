package Material;

public class RepositorioMaterialArray implements RepositorioMaterial {
	private Material[] materiais;
	private int contador;

	public RepositorioMaterialArray() {
		materiais = new Material[1];
		contador = 0;
	}

	public void inserir(Material material) {
		if (contador == materiais.length) {
			Material[] materiais2 = new Material[materiais.length * 2];
			for (int i = 0; i < materiais.length; i++) {
				materiais2[i] = materiais[i];
			}
			this.materiais = materiais2;
		}
		
		for (int i = 0; i < materiais.length; i++) {
			if (materiais[i].equals(material)) {
				
			}
			if (materiais[i] == null) {
				materiais[i] = material;
				contador++;
				return;
			}
		}
	}
	
	public boolean procurar(String material) {
		boolean tem = false;
		for(int i = 0; i < materiais.length; i++) {
			if (materiais[i].equals(material)) {
				tem = true;
			}
		}
		return tem;
	}
	
	public void atualizar (Material antigo, Material novo) {
		for(int i = 0; i < materiais.length; i++) {
			if (materiais[i] == antigo) {
				materiais[i] = novo;
				return;
			}
		}
	}
		
	public void remover(String material) {
		for (int i = 0; i < materiais.length; i++) {
			if (materiais[i].equals(material)) {
				materiais[i] = null;
				return;
			}
		}
	}
}
