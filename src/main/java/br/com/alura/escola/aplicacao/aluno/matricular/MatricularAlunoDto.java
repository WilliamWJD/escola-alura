package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.Cpf;
import br.com.alura.escola.domain.aluno.Email;

public class MatricularAlunoDto {
	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;

	public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
		super();
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}

	public Aluno criarAluno() {
		return new Aluno(new Cpf(cpfAluno), nomeAluno, new Email(emailAluno));
	}
}
