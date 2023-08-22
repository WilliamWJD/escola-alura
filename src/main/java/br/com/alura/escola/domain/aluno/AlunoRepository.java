package br.com.alura.escola.domain.aluno;

import java.util.List;

public interface AlunoRepository {
	
	/**
	 * Realza a matricula de um aluno
	 * 
	 * @param aluno
	 */
	void matricular(Aluno aluno);
	
	/**
	 * Busca um aluno pelo número do CPF
	 * 
	 * @param cpf
	 * @return
	 */
	Aluno buscarPorCpf(Cpf cpf);
	
	/**
	 * Busca todos os alunos matriculados
	 * 
	 * @return
	 */
	List<Aluno> listarTodosAlunosMatriculados();
}
