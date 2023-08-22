package br.com.alura.escola.domain.aluno;

import java.util.Objects;

public class Telefone {

	private String ddd;
	private String numero;

	public Telefone(String ddd, String numero) {
		if (Objects.isNull(ddd) || ddd.length() > 2 || ddd.length() < 2) {
			throw new IllegalArgumentException("DDD inválido");
		}

		if (Objects.isNull(numero) || numero.length() > 8 || numero.length() < 8) {
			throw new IllegalArgumentException("Número inválido");
		}

		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Telefone [ddd=" + ddd + ", numero=" + numero + "]";
	}

}
