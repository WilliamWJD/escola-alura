package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.AlunoRepository;

public class MatricularAluno {

	private final AlunoRepository repositorio;

	public MatricularAluno(AlunoRepository repositorio) {
		this.repositorio = repositorio;
	}
	
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
	}
}
