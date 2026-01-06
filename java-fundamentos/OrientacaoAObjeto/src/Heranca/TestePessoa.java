package Heranca;

public class TestePessoa {

	public static void main(String[] args) {
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setRazaoSocial("Tech Solutions LTDA");
		pessoaJuridica.setCnpj("12.345.678/0001-99");
		pessoaJuridica.setEndereco("Av. Central, 456 - Blumenau/SC");
		pessoaJuridica.setTelefone("(47) 98888-7777");
		pessoaJuridica.setEmail("contato@techsol.com.br");
		
		System.out.println("Dados da pessoa Jurídica");
		System.out.println(pessoaJuridica + "\n\n"); 

		
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("Vanio Silva");
		pessoaFisica.setCpf("123.456.789-00");
		pessoaFisica.setRg("12.345.678-9");
		pessoaFisica.setEndereco("Rua das Flores, 123 - Blumenau/SC");
		pessoaFisica.setTelefone("(47) 99999-8888");
		pessoaFisica.setEmail("vanio.silva@email.com");
		
		System.out.println("Dados da pessoa Física");
		System.out.println(pessoaFisica + "\n\n");


	}
}
