package Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		
//		Instânciando a classe Pessoa, e com isso, criamos um objeto com nome pessoa.
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Vanio";
		pessoa.idade = 28;
		
		pessoa.mostraDados();
		pessoa.mostraDados("Mostrar Dados", 0);

	}

}
