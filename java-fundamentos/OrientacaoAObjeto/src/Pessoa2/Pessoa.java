package Pessoa2;

public class Pessoa {

	// Atributos
	private String nome;

	private int idade;

	// Métodos getters e setters... Encapsulamento

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isBlank()) {
			throw new IllegalArgumentException("Precisa digitar um nome.");
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade inválida");
		}
		this.idade = idade;
	}

	// Método toString
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

}
