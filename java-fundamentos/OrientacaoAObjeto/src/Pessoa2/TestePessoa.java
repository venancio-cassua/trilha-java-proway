package Pessoa2;

public class TestePessoa {

	public static void main(String[] args) {

		// Instânciando a classe Pessoa, e com isso, criamos um objeto com nome pessoa.
		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Vanio");
		pessoa.setIdade(28);

		System.out.println(pessoa.toString());

	}
}
