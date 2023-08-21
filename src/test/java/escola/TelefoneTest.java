package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoDeveIncluirDDDInvalido() {
		assertThrows(IllegalArgumentException.class, ()-> new Telefone("1", "38649847"));
		assertThrows(IllegalArgumentException.class, ()-> new Telefone(null, "38649847"));
		assertThrows(IllegalArgumentException.class, ()-> new Telefone("", "38649847"));
	}
	
	@Test
	void naoDeveIncluirNumeroInvalido() {
		assertThrows(IllegalArgumentException.class, ()-> new Telefone("19", "3864984"));
		assertThrows(IllegalArgumentException.class, ()-> new Telefone("19", "386498478"));
		assertThrows(IllegalArgumentException.class, ()-> new Telefone("19", null));
		assertThrows(IllegalArgumentException.class, ()-> new Telefone("19", ""));
	}


}
