import java.util.List;

public class Pessoa {

	private String nome;
	private List<String> coresFavoritas;

	public Pessoa(String nome, List<String> coresFavoritas) {
		this.nome = nome;
		this.coresFavoritas = coresFavoritas;
	}

	public String getNome() {
		return nome;
	}

	public List<String> getCoresFavoritas() {
		return coresFavoritas;
	}

	public void addCorFavorita(String cor) {
		if(!this.coresFavoritas.contains(cor)) {
			this.coresFavoritas.add(cor);

		}
	}


}
