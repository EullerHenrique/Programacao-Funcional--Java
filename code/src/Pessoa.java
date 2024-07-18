import java.util.List;

public class Pessoa {

	private String nome;
	private int idade;
	private List<String> coresFavoritas;

	public Pessoa(String nome, List<String> coresFavoritas) {
		this.nome = nome;
		this.coresFavoritas = coresFavoritas;
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
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
