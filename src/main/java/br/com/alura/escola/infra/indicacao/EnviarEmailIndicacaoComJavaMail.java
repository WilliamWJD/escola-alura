package br.com.alura.escola.infra.indicacao;

import br.com.alura.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.escola.domain.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao{

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de e-mails com a lib JavaMail
	}

}
