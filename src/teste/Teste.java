package teste;



import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import calculo.Calculadora;
import junit.framework.TestCase;

public class Teste extends TestCase{
	
	@Test
	public void testeSomaSucesso() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.soma(1, 2);
		assertEquals(resultado, 3);
	}

	@Test
	public void testeSomaFalha() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.soma(2, 2);
		assertNotEquals(resultado, 3);
	}
}
