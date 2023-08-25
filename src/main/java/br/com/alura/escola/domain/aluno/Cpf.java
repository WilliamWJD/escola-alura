package br.com.alura.escola.domain.aluno;

import java.util.Objects;

public class Cpf {
	private String numero;
	
	public Cpf(String numero) {
		if(Objects.isNull(numero) || !numero.matches("^([0-9]){3}\\.([0-9]){3}\\.([0-9]){3}-([0-9]){2}$")) {
			throw new IllegalArgumentException("Cpf inválido !");
		}
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Cpf [numero=" + numero + "]";
	}
}
