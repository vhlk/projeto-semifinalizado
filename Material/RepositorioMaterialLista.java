package Material;

public class RepositorioMaterialLista implements RepositorioMaterial {
	private Material mat;
	private RepositorioMaterialLista proximo;

	public RepositorioMaterialLista() {
		this.mat = null;
		this.proximo = null;
	}

	public void inserir(Material mat) {
		if (this.mat == null) {
			this.mat = mat;
			this.proximo = new RepositorioMaterialLista();
		} else {
			this.proximo.inserir(mat);
		}
	}

	public boolean procurar(String mat) {
		if (this.mat.equals(mat)) {
			return true;
		}
		if (this.proximo != null) {
			return this.proximo.procurar(mat);
		} else {
			return false;
		}
	}

	public void remover(String mat) {
		if (this.mat != null) {
			if (this.mat.equals(mat)) {
				this.mat = this.proximo.mat;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(mat);
			}
		}
	}

	public void atualizar(Material antigo, Material novo) {
		if (this.mat != null) {
			if (this.mat == antigo) {
				this.mat = novo;
			}
		}
	}
}
