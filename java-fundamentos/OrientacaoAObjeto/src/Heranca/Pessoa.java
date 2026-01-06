package Heranca;

public class Pessoa {

	// Atributos
	private String endereco;
	private String telefone;
	private String email;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
}
