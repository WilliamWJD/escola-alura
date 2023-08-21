package escola;

import java.util.Objects;

public class Cpf {
	private String numero;
	
	public Cpf(String numero) {
		if(Objects.isNull(numero) || !numero.matches("^([0-9]){3}\\.([0-9]){3}\\.([0-9]){3}-([0-9]){2}$")) {
			throw new IllegalArgumentException("Cpf inválido !");
		}
	}
}
