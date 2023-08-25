package br.com.alura.escola.aplicacao.indicacao;

import br.com.alura.escola.domain.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	/**
	 * Envia e-mail para aluno endicado
	 * 
	 * @param indicado
	 */
	void enviarPara(Aluno indicado);
}
