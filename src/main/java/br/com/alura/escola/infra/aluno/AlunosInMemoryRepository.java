package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.domain.aluno.Aluno;
import br.com.alura.escola.domain.aluno.AlunoRepository;
import br.com.alura.escola.domain.aluno.Cpf;

public class AlunosInMemoryRepository implements AlunoRepository {

	private List<Aluno> matriculados = new ArrayList<>();

	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCpf(Cpf cpf) {
		return this.matriculados.stream().filter(item -> item.getCpf().getNumero().equals(cpf.getNumero())).findFirst()
				.orElseThrow();
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}

}
