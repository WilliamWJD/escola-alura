package br.com.alura.escola.domain.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.domain.aluno.Cpf;

class CpfTest {

	@Test
	void naoDeveriaCriarCpfComNumeroInvalido() {
		assertThrows(IllegalArgumentException.class, ()-> new Cpf(null));
		assertThrows(IllegalArgumentException.class, ()-> new Cpf(""));
		assertThrows(IllegalArgumentException.class, ()-> new Cpf("cpfInvalido"));
	}

}
