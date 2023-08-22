package br.com.alura.escola.domain.aluno;

public class Email {
	// VALUE OBJECT
	
	private String endereco;

	public Email(String endereco) {
		if(endereco == null || !endereco.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
			throw new IllegalArgumentException("E-mail inválido !");
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Email [endereco=" + endereco + "]";
	}
}
