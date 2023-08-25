package br.com.alura.escola.domain.aluno;

public interface CifradorDeSenha {
	
	/**
	 * Criptografa uma resenha
	 * 
	 * @param senha
	 * @return
	 */
	String cifrarSenha(String senha);
	
	/**
	 * Valida senha
	 * 
	 * @param senhaCifrada
	 * @param senha
	 * @return
	 */
	boolean validarSenhaCidrada(String senhaCifrada, String senha);
}
