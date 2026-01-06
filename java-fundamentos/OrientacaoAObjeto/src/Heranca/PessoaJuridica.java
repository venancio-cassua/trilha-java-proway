package Heranca;

public class PessoaJuridica extends Pessoa {
	private String razaoSocial;
	private String cnpj;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
	    return "PessoaJuridica {" +
	           "razaoSocial='" + razaoSocial + '\'' +
	           ", cnpj='" + cnpj + '\'' +
	           ", endereco='" + getEndereco() + '\'' +   // herdado de Pessoa
	           ", telefone='" + getTelefone() + '\'' +   // herdado de Pessoa
	           ", email='" + getEmail() + '\'' +         // herdado de Pessoa
	           '}';
	}

	
}
