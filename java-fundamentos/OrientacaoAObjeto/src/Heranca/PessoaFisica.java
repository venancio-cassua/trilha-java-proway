package Heranca;

public class PessoaFisica extends Pessoa {

	private String nome;
	private String cpf;
	private String rg;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	@Override
	public String toString() {
	    return "PessoaFisica {" +
	           "nome='" + nome + '\'' +
	           ", cpf='" + cpf + '\'' +
	           ", rg='" + rg + '\'' +
	           ", endereco='" + getEndereco() + '\'' +   // herdado de Pessoa
	           ", telefone='" + getTelefone() + '\'' +   // herdado de Pessoa
	           ", email='" + getEmail() + '\'' +         // herdado de Pessoa
	           '}';
	}


}
