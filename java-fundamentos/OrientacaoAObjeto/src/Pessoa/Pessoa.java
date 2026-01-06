package Pessoa;

public class Pessoa {

//	Atributos
	public String nome;

	public int idade;

//	Métodos
	public void mostraDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
	}

	// Método com parámetro. Mesmo nome, mas assinaturas diferentes.
	public void mostraDados(String nome, int idade) {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
	}
}
