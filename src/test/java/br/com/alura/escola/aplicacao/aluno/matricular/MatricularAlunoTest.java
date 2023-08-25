package br.com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.Cpf;
import br.com.alura.escola.infra.aluno.AlunosInMemoryRepository;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		// cenario
		AlunosInMemoryRepository repositorio = new AlunosInMemoryRepository();
		MatricularAluno useCase = new MatricularAluno(repositorio);
		
		MatricularAlunoDto dados = new MatricularAlunoDto("william", "444.444.444-55", "william@gmail.com");
		
		// acao
		useCase.executa(dados);
		
		// validacao
		Aluno encontrado = repositorio.buscarPorCpf(new Cpf("444.444.444-55"));
		assertEquals("william", encontrado.getNome());
	}

}
