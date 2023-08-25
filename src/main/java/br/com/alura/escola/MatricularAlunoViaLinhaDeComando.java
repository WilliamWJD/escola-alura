package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.infra.aluno.AlunosInMemoryRepository;

public class MatricularAlunoViaLinhaDeComando {

	public static void main(String[] args) {
		String nome = "William";
		String cpf = "444.421.828-55";
		String email = "william@gmail.com";
		
		MatricularAluno matricular = new MatricularAluno(new AlunosInMemoryRepository());
		matricular.executa(new MatricularAlunoDto(nome, cpf, email));
	}

}
